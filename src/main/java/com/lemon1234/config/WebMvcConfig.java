package com.lemon1234.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component("webMvcComponent")
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Value("{adminImgFile}")
	private String adminImgFile;

	/**
	 * 跨域配置
	 */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        		.allowedOriginPatterns("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "PUT", "HEAD", "DELETE", "OPTIONS")
                .maxAge(3600);
    }
    
}
