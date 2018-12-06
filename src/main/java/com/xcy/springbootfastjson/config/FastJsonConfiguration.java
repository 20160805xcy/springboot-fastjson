package com.xcy.springbootfastjson.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xcy
 * @date 2018/12/04 10:56
 * @description FastJsonConfiguration
 * @since V1.0.0
 */
@Configuration
public class FastJsonConfiguration implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //1.需要定义一个convert转换消息的对象
        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
        //2.添加fastJson的配置信息,比如:是否要格式化返回的json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.PrettyFormat,
                SerializerFeature.WriteNullStringAsEmpty, //字符类型字段如果为null,输出为空字符串"",而非null
                SerializerFeature.WriteNullNumberAsZero,  //数字类型字段如果为null,输出为数字 0,而非null
                SerializerFeature.WriteNullListAsEmpty,   //List字段如果为null,输出为[],而非null
                SerializerFeature.WriteMapNullValue       //是否输出值为null的字段,默认为false
        );
        //3. 处理中文乱码问题
        List<MediaType> fastMediaTypeList = new ArrayList<>();
        fastMediaTypeList.add(MediaType.APPLICATION_JSON_UTF8);
        //4.在convert中添加配置信息
        //fastJsonConverter.setSupportedMediaTypes(fastMediaTypeList);
        fastJsonConverter.setFastJsonConfig(fastJsonConfig);
        //5.将convert添加到converters当中
        converters.add(fastJsonConverter);
    }
}
