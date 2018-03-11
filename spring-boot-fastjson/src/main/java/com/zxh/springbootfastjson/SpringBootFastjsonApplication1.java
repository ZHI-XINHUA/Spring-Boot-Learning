package com.zxh.springbootfastjson;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import java.util.List;

//@SpringBootApplication
public class SpringBootFastjsonApplication1 implements WebMvcConfigurer {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// 1、需要先定义一个 convert 转换消息的对象;
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		//2、添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		//3、在convert中添加配置信息.
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
		//4、注册到HttpMessageConverter中
		converters.add(fastJsonHttpMessageConverter);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFastjsonApplication1.class, args);
	}
}
