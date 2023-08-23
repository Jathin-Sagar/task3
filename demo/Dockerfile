#FROM openjdk:11-jre-slim
#RUN apt-get update && apt-get install -y iputils-ping
#WORKDIR /app
#COPY target/demo-0.0.1-SNAPSHOT.jar /app/app.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app.jar"]

#FROM openjdk:8-jdk-alpine
FROM openjdk:11-jre
VOLUME /tmp
EXPOSE 8080
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD target/demo-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]

#FROM openjdk:11-jre
#COPY your-application.jar /app.jar
#CMD ["java", "-jar", "/app.jar"]


# FROM openjdk:8-jdk-alpine
#EXPOSE 8080
#RUN mkdir -p /app/
#RUN mkdir -p /app/logs/
#ADD target/demo-0.0.1-SNAPSHOT.jar /app/app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]
#ENTRYPOINT ["java", "-jar", "app.jar"]
