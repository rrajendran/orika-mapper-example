package com.capella;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mapperFactory")
public class MapperFactoryBean implements FactoryBean<MapperFactory> {

    @Override
    public MapperFactory getObject() throws Exception {
        return new DefaultMapperFactory.Builder().build();
    }

    @Override
    public Class<?> getObjectType() {
        return MapperFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
