FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/technutgarage-0.0.2-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

