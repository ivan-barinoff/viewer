FROM java:8
ADD target/config-server-0.0.1-SNAPSHOT.jar config-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-server.jar"]