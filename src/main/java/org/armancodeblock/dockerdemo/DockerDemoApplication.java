package org.armancodeblock.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }
/*
FROM openjdk:17: This line specifies the base picture for the Docker image. In this case, it’s using the OpenJDK 17 base image.

ARG JAR_FILE=construct/libs/*.Jar: This argument is used to specify the direction to the JAR report so as to be copied into the Docker image.
The *.Jar suggests that any JAR file in the particular listing might be taken into consideration.


COPY $JAR_FILE app.Jar: This line copies the JAR file distinct with the aid of the JAR_FILE argument from the construct context into the Docker image.

ENTRYPOINT [“java”,”-jar”,”/app.Jar”]: This line sets the default command to be carried out whilst the Docker field starts off evolved. It specifies that the Java Virtual Machine (JVM) have to run the JAR report (app.Jar) the use of the -jar option.

If you have no .Jar document in buid/libs folder attempt executing the subsequent command on Terminal.
 */
}
