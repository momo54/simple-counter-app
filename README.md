# simple counter app with Spring Boot - Postgres - vanilla JS

To develop, you need:
- java >= 17 
- Maven > 3
- python >3.12

To deploy, you need:
- docker-compose
- postgres >=13


to compile/run:
```
mvn clean install  
docker-compose build --no-cache 
docker-compose up -d
```

usefull:
```
curl http://localhost:8080/api/counter
docker-compose logs
docker-compose down
docker ps 
docker image ls 
```
# Where are things

- The index.html is at [src/main/resources/static](/src/main/resources/static/index.html)
- sql things is at [src/main/resources/](/src/main/resources/)
- Simple REST API is at [src/main/java/com/example/](src/main/java/com/example/counter/CounterController.java)

  # run the tests
  - pytests tests
