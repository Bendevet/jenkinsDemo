FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
EXPOSE 2000
ENTRYPOINT ["java", "-jar" , "demo-0.0.1-SNAPSHOT.jar"]