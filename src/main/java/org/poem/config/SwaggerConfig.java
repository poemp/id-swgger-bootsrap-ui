package org.poem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * http:127.0.0.1:8080/doc.html
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket createTestRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .groupName("测试 group name")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.poem"))
                .paths(PathSelectors.any())
                .build();
    }


    @Bean
    public Docket createGitHubRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .groupName("gitHub group name")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.poem"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo(){
        return new ApiInfoBuilder().title("玩一下swagger-bootstrap-ui")
                .description("测试一下swagger-bootstrap-ui")
                .termsOfServiceUrl("http://swagger.io/")
                .contact(new Contact("poem","127.0.0.1",""))
                .version("0.0.1")
                .build();
    }
}
