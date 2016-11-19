speing-boot-vaadin [![build](https://travis-ci.org/daggerok/speing-boot-vaadin.svg?branch=master)](https://travis-ci.org/daggerok/speing-boot-vaadin)
==================

```fish
docker-compose up -d
gradle --parallel :producer:bootRun :consumer:bootRun
open http://0.0.0.0:8080
open http://0.0.0.0:8081/db/test/user
open http://0.0.0.0:8082 # enter: admin / admin
docker-compose down
```

[link](https://spring.io/blog/2016/11/15/vaadin-spring-1-1-build-web-uis-that-hook-right-to-your-java-backend)
