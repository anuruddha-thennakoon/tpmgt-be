#!/bin/sh

git pull
mvn clean install
docker build -t 192.168.100.199:5000/pms-revisions-api:production .
docker push 192.168.100.199:5000/pms-revisions-api:production
