//package com.usercurd2;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggConfig {
//	
//	@Bean
//	public Docket apiDoc () {
//		return new Docket(DocumentationType.SWAGGER_2)
//				         .select()
//				         .apis(RequestHandlerSelectors.basePackage("com.usercurd2"))
//				         .paths(PathSelectors.any())
//				         .build();
//		
//	}
//}
//
//
///*   Swagger : 
// *        Swagger is an api documentaion tool 
// *        by using the swagger we can do the documentation for our rest api so that the other
// *        application will be access our api.
// *        
// *        in this documentation swagger will provide the information about the one Rest API
// *        So that the other application can easily access. 
// *        
// *        To enabling the Swagger in our application we need to add swagger dependancy and use
// *       
// *        @EnableSwagger2 annotation  : [ Indicates that Swagger support should be enabled. 
// *        This should be applied to a Spring java config and should have an accompanying '@Configuration' annotation. 
// *        Loads all required beans defined in @see SpringSwaggerConfig
// *        
// * 
// */
