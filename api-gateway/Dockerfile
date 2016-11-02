FROM java:8
VOLUME /tmp
ADD target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway.jar
RUN sh -c 'touch /api-gateway.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api-gateway.jar"]