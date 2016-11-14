#!/usr/bin/env bash
cd config-server
docker build -t config-server .
cd ../api-gateway
docker build -t api-gateway .
cd ../discovery-service
docker build -t discovery-service .
cd ../movies-service
docker build -t movies-service .
cd ../rating-service
docker build -t rating-service .
cd ../monitoring
docker build -t monitoring .
cd ../trace-service
docker build -t trace-service .
cd ../tv-shows-service
docker build -t tv-shows-service .
cd ../comments-service
docker build -t comments-service .