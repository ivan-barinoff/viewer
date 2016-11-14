FROM java:8
ADD target/discovery-service-0.0.1-SNAPSHOT.jar discovery-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/discovery-service.jar"]