FROM openjdk:17
WORKDIR /app

ARG ACTIVE_PROFILE=prod
ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

LABEL authors="kyunghoyeom"

ENTRYPOINT ["java", "-Dspring.profiles.active=${ACTIVE_PROFILE}", "-jar", "app.jar"]