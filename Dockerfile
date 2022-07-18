FROM openjdk:16-jdk-alpine
MAINTAINER springboot.example.com
COPY target/spring-boot-hello-1.0.jar /spring-boot-hello-1.0.jar
ENTRYPOINT ["java","-jar","/spring-boot-hello-1.0.jar"]