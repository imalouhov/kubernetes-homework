FROM openjdk:17.0.2-jdk-slim-buster
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} kubernetes-homework.jar
ENTRYPOINT ["java","-jar","/kubernetes-homework.jar"]