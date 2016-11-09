FROM java:8
ADD target/trace-service-0.0.1-SNAPSHOT.jar trace-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/trace-service.jar"]