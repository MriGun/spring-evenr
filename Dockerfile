FROM openjdk:17
EXPOSE 8083
ADD target/docker-jenkins-integration-sample.jar docker-jenkins-integration-sample.jar
ENTRYPOINT ["java", "-jar", "/docker-jenkins-integration-sample.jar"]