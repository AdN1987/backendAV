FROM amazoncorretto:11-alpine-jdk
MAINTAINER ADN
COPY target/AdNVilla-0.0.1-SNAPSHOT.jar adn-app.jar
ENTRYPOINT ["java","-jar","/adn-app.jar"]
