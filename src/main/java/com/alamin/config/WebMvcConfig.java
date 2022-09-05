package com.alamin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@EnableWebMvc
@ComponentScan(basePackages = {"com.alamin.controller"})
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Register resource handler for -

//        // IMAGES
//        registry.addResourceHandler(
//                        "/images/**",
//                        "/status/show/images/**",
//                        "/user/show/images/**"
//                ) // Relative paths
//                .addResourceLocations(
//                        "/WEB-INF/resources/images/",
//                        "file:///" + Constant.WRITE_PATH + "/"
//                ) // Actual resource locations
//                .setCachePeriod(999999999); // Cache period


        // CSS
        registry
                .addResourceHandler("/images/**") // Relative paths
                .addResourceLocations("/WEB-INF/resources/images/") // Actual resource locations
                .setCachePeriod(999999999); // Cache period

        // JAVASCRIPT
        registry
                .addResourceHandler("/js/**") // Relative paths
                .addResourceLocations("/WEB-INF/resources/js/") // Actual resource locations
                .setCachePeriod(999999999); // Cache period

        // Other template resource vendor files
        registry
                .addResourceHandler("/vendor/**") // Relative paths
                .addResourceLocations("/WEB-INF/resources/vendor/") // Actual resource locations
                .setCachePeriod(999999999); // Cache period

    }
}
