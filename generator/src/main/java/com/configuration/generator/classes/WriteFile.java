package com.configuration.generator.classes;

import sun.awt.X11.XSystemTrayPeer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class WriteFile {

    public void writeProperites(Map<String,String> map) throws IOException {

        Writer fileWriter = new FileWriter(
                "/home/ubuntu/ProjectRTMPSerwis/videoSerwis/src/main/resources/application.properties"
                , false);
        System.out.println(System.getProperty("user.home")+"/ProjectRTMPSerwis/videoSerwis/src/main/resources/application.properties");

        fileWriter.write("spring.data.mongodb.database=projectdb\n");
        fileWriter.write("spring.data.mongodb.ip="+map.get("PUBLIC_ComponentDatabasePortReq")+"\n");
        fileWriter.write("spring.mail.host=smtp.gmail.com"+"\n");
        fileWriter.write("spring.mail.port=587"+"\n");
        fileWriter.write("spring.mail.username=testujemy4321@gmail.com"+"\n");
        fileWriter.write("spring.mail.password=igwjxbehqljfpvnx"+"\n");
        fileWriter.write("PUBLIC_ComponentWebAppPort="+map.get("PUBLIC_IP")+":3000"+"\n");
        fileWriter.close();


    }

    public void writeConfig(Map<String,String> map) throws IOException {
        Writer fileWriter = new FileWriter(
                "/home/ubuntu/ProjectRTMPSerwis/videoSerwis/src/main/webapp/front/src/Components/config/config.json"
                , false);

        fileWriter.write("{\n");
        fileWriter.write("  \"ip\": \""+map.get("PUBLIC_IP")+"\"\n");
        fileWriter.write("}"+"\n");
        fileWriter.close();
    }

}
