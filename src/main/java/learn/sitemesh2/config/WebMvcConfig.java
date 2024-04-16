package learn.sitemesh2.config;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean<SiteMeshFilter> sitemeshFilter() {
        FilterRegistrationBean<SiteMeshFilter> bean = new FilterRegistrationBean<>(new SiteMeshFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }
}
