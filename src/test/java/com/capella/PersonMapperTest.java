package com.capella;

import ma.glasnost.orika.MapperFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by ramesh on 25/01/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class PersonMapperTest {

    @Autowired
    private MapperFacade mapperFacade;

    @Test
    public void testMapper() {
        PersonSource source = new PersonSource("ramesh", "rajendran");
        PersonDestination personDestination = mapperFacade.map(source, PersonDestination.class);
        assertThat(personDestination.getGivenName(), is("ramesh"));
        assertThat(personDestination.getSirName(), is("rajendran"));
    }


    @Test
    public void testMapperBidirectional() {
        PersonDestination source = new PersonDestination("ramesh", "rajendran");
        PersonSource personDestination = mapperFacade.map(source, PersonSource.class);
        assertThat(personDestination.getFirstName(), is("ramesh"));
        assertThat(personDestination.getLastName(), is("rajendran"));
    }
}