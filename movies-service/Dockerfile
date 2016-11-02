FROM java:8
VOLUME /tmp
ADD target/movies-0.0.1-SNAPSHOT.jar movies-service.jar
RUN sh -c 'touch /movies-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/movies-service.jar"]