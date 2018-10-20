package org.poem.config;

import io.swagger.annotations.Api;
import springfox.documentation.service.Parameter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * http:127.0.0.1:8080/doc.html
 * @author poem
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket createGitHubRestApi(){
        List<Parameter> paraList = new ArrayList<>();
        ParameterBuilder paraBuilder = new ParameterBuilder();
        springfox.documentation.service.Parameter param1 = paraBuilder
                .name("auth_str").description("auth_str")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build();
        paraList.add(param1);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("Api Test")
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(paraList);
    }


    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("Api Reset")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.poem"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("玩一下swagger-bootstrap-ui")
                .description("测试一下swagger-bootstrap-ui")
                .termsOfServiceUrl("http://swagger.io/")
                .contact(new Contact("poem","127.0.0.1",""))
                .version("0.0.1")
                .build();
    }
}
