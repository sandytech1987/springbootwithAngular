/*package com.luv2code.ecommerce.config;

import org.hibernate.boot.Metadata;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.ExposureConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.luv2code.ecommerce.entity.Product;
public class MyDataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration restConfig) {
       HttpMethod[] theUnsupporttedAction ={HttpMethod.DELETE,HttpMethod.POST,HttpMethod.DELETE};
       
    	restConfig.getExposureConfiguration()
    	.forDomainType(Product.class)
         .withItemExposure((metadata, httpMethods) ->  httpMethods.disable(theUnsupporttedAction))
         
         ;
        
    }
}*/