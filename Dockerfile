FROM openjdk:latest
COPY ./target/group5-0.1.0.1-jar-with-dependencies.jar /tmp
WORKDIR /tmp
#jar version update
ENTRYPOINT ["java", "-jar", "group5-0.2.0.1-jar-with-dependencies.jar"]