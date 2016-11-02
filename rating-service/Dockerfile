FROM java:8
VOLUME /tmp
ADD target/rating-service-0.0.1-SNAPSHOT.jar rating-service.jar
RUN sh -c 'touch /rating-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/rating-service.jar"]