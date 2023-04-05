FROM eclipse-temurin:17-jre-alpine
ARG JAR_FILE=build/libs/*-SNAPSHOT.jar
COPY ${JAR_FILE} soldier-starter.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker","-jar","/soldier-starter.jar"]
