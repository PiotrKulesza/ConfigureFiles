package com.configuration.generator;

import com.configuration.generator.classes.ReadFile;
import com.configuration.generator.classes.WriteFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Map;

@SpringBootApplication
public class GeneratorApplication {

	public static void main(String[] args) {

		SpringApplication.run(GeneratorApplication.class, args);
		ReadFile readFile = new ReadFile();
		WriteFile writeFile = new WriteFile();
		try {
			Map<String,String> map = readFile.getProperties();
			writeFile.writeProperites(map);
			writeFile.writeConfig(map);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
