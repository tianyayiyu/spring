package com.zlu.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.zlu")
public class AppConfig {


    /**
     * 新的 配置视图解析器
     * @param registry
     */
//    @Bean
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//       // registry.enableContentNegotiation(new MappingJackson2JsonView());
//        registry.jsp("/",".jsp");
//    }

    /**
     * 配置视图解析器
     * @return
     */
//    @Bean
//    public InternalResourceViewResolver internalResourceViewResolver(){
//        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
//        internalResourceViewResolver.setPrefix("/");
//        internalResourceViewResolver.setSuffix(".jsp");
//        return internalResourceViewResolver;
//    }
}
