FROM openjdk:latest
COPY ./target/group5.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "group5.jar", "db:3306"]