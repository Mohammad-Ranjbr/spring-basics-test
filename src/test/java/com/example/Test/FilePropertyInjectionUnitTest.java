package com.example.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestPropertySources;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class) // == @RunWith(SpringRunner.class)
@SpringBootTest
//@TestPropertySource("/foo.properties")
//@TestPropertySource("/application.properties")
@TestPropertySources({
        @TestPropertySource("/foo.properties") ,
        @TestPropertySource("/application.properties") ,
        @TestPropertySource(properties = {"bar=Bar","name=R"})
})
//@ConfigurationProperties(prefix = "database") // for a hierarchical properties
public class FilePropertyInjectionUnitTest {

    @Value(("${foo}"))
    private String foo;

    @Value("${value.from.file}")
    private String family;

    @Value("${listOfValue}")
    private String[] valuesArray;

    @Value("#{'${listOfValue}'.split(',')}")
    private List<String> valuesList;

    @Value("#{${valuesMap}}")
    private Map<String,Integer> valuesMap;

    @Value("#{${valuesMap}.key2}")
    private int valuesMapKey2;

    @Value("#{${valuesMapp : {key1 : '11' , key2 : '22'}}}")
    private Map<String,Integer> mapWithByDefault;

    @Value("#{${valuesMap}['key4'] ?: 444}")
    private int valuesMapKey4;

    @Value("#{${valuesMap}.?[value>'300']}")
    private Map<String,Integer> valuesMapFiltered;

    @Value("${value.from.fil:DefaultValue}")
    private String fieldByDefaultValue;

    @Value("${bar}")
    private String bar;

    @Test
    public void test(){
        System.out.println(foo);
        System.out.println(family);
        System.out.println("length : "+valuesArray.length+"  -  "+ Arrays.stream(valuesArray).toList());
        System.out.println(valuesList.get(1));
        System.out.println(valuesMap.get("key1"));
        System.out.println(valuesMapKey2);
        System.out.println(mapWithByDefault.get("key1"));
        System.out.println(valuesMapKey4);
        System.out.println(valuesMapFiltered);
        System.out.println(fieldByDefaultValue);
        System.out.println(bar);
    }

}
