FROM openjdk:17
WORKDIR /app

ARG ACTIVE_PROFILE=prod
ARG JAR_FILE=build/libs/*.jar

ENV SPRING_PROFILES_ACTIVE=$SPRING_PROFILES_ACTIVE

COPY ${JAR_FILE} app.jar

LABEL authors="kyunghoyeom"

ENTRYPOINT ["java", "-jar", "app.jar"]