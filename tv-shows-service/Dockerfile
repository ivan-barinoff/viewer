FROM java:8
VOLUME /tmp
ADD target/tv-shows-service-0.0.1-SNAPSHOT.jar tv-shows-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tv-shows-service.jar"]