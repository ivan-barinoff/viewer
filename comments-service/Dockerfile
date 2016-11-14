FROM java:8
ADD target/comments-service-0.0.1-SNAPSHOT.jar comments-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/comments-service.jar"]