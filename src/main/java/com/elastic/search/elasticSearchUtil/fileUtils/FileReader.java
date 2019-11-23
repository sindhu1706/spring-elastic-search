package com.elastic.search.elasticSearchUtil.fileUtils;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class FileReader {

    public String readFileAsString(String fileName) {
        String script = null;
        try {
            File file = new File(this.getClass().getResource(fileName).getFile());
            script = FileUtils.readFileToString(file, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return script;
    }
}
