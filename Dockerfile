FROM amazoncorretto:8-alpine-jdk
MAINTAINER ADN
COPY target/AdNVilla-0.0.1-SNAPSHOT.jar AdN-app.jar
ENTRYPOINT ["java","-jar","/AdN-app.jar"]
