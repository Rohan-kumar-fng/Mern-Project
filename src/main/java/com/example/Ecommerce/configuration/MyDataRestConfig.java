package com.example.Ecommerce.configuration;

import com.example.Ecommerce.entity.Product;
import com.example.Ecommerce.entity.ProductCategory;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors){
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config,cors);

        HttpMethod[] unsupportedHttpAction = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(unsupportedHttpAction)))
                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unsupportedHttpAction)));

        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(unsupportedHttpAction)))
                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unsupportedHttpAction)));

        config.exposeIdsFor(Product.class, ProductCategory.class);



    }
}
