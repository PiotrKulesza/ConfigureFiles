package com.configuration.generator.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {

    public Map<String,String> getProperties() throws IOException {
        String filePath = "/home/ubuntu/printenv.log";

        Path path = FileSystems.getDefault().getPath(filePath);
        Map<String, String> map = new HashMap<String, String>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split("=", 2);
            if (parts.length >= 2)
            {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            } else {
                System.out.println("ignoring line: " + line);
            }
        }
        for (String key : map.keySet())
        {
            System.out.println(key + "=" + map.get(key));
        }

        return map;
    }

}
