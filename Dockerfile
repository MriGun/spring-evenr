FROM openjdk:17
EXPOSE 8083
ADD target/dockertest-0.0.1-SNAPSHOT.jar dockertest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/dockertest-0.0.1-SNAPSHOT.jar"]