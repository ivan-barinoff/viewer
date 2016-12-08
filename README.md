# Viewer
Just a test project. The projects are based on spring boot, spring cloud and maven.
The project contains a few microservices.

* API Gateway uses Zuul http://{docker_machine}:8080/
* Service Discovery is Eureka http://{docker_machine}:8761/
* Turbine Stream http://{docker_machine}:8020/hystrix.stream
* Config Service http://{docker_machine}:8888/
* Trace Service uses Zipkin http://{docker_machine}:9411/
* RabbitMQ http://{docker_machine}:15672/
* Hystrix dashboard http://{docker_machine}:8080/hystrix

The following microservices are working with each other via Feign client.There is a small example with Reactor

* Comments Service http://{docker_machine}:8095/
* Rating Service http://{docker_machine}:8060/
* Movies Service http://{docker_machine}:8090/
* Tv Shows Service http://{docker_machine}:8070/

# How to deploy
* sh rebuild-all.sh
* docker-compose up -d
