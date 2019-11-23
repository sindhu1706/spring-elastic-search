package com.elastic.search.elasticSearchUtil.groovyUtils;

import groovy.lang.GroovyClassLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elastic.search.elasticSearchUtil.fileUtils.FileReader;


@Component
public class ClassReader {

    @Autowired
    FileReader fileReader;

    public Class readClassFromGroovyFile() {
        GroovyClassLoader gcl = new GroovyClassLoader();
        Class clazz = gcl.parseClass(fileReader.readFileAsString("/test.groovy"));
        return clazz;
    }


}
