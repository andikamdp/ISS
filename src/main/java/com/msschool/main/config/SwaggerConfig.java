package com.msschool.main.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
//	@Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//          .select()
//          .apis(RequestHandlerSelectors.any())
//          .paths(PathSelectors.any())
//          .build();
//    }
//
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	    registry.addResourceHandler("swagger-ui.html")
//	      .addResourceLocations("classpath:/META-INF/resources/");
//
//	    registry.addResourceHandler("/webjars/**")
//	      .addResourceLocations("classpath:/META-INF/resources/webjars/");
//	}


//	private final String baseUrl;
//
//	public SwaggerConfig(String baseUrl) {
//		this.baseUrl = baseUrl;
//	}
//
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		String baseUrl = StringUtils.trimTrailingCharacter(this.baseUrl, '/');
//		registry.
//				addResourceHandler(baseUrl + "/swagger-ui/**")
//				.addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/")
//				.resourceChain(false);
//	}
//
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController(baseUrl + "/swagger-ui/")
//				.setViewName("forward:" + baseUrl + "/swagger-ui/index.html");
//	}

}
