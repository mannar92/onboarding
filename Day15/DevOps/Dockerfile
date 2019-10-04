FROM ubuntu 
MAINTAINER Alexandros Mannari <alex.mannari@gmail.com>

ENV http_proxy http://192.168.101.52:8080
ENV https_proxy https://192.168.101.52:8080

RUN apt-get update && apt-get install default-jdk git -y
RUN apt-get install maven -y
