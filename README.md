#!/bin/bash

#запускаем вилдфлай и mysql
docker-compose up -d --build

#собираем вар
mvn clean package

#деплоим вар в вилдфлай
docker cp /path/to/app.war wildfly:/app
