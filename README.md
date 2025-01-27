# simple counter app with Spring Boot - Postgres - vanilla JS

To develop, you need:
- java >= 17 
- Maven > 3
- python >3.12

To deploy, you need:
- docker-compose
- postgres >=13


to run:
```
mvn clean install
docker-compose build --no-cache
docker-compose up -d
```

usefull:
````
curl http://localhost:8080/api/counter
docker-compose logs 
```