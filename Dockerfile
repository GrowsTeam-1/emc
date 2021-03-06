FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/emc-0.0.1-SNAPSHOT.jar
WORKDIR /opr/app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]