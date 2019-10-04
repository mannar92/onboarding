FROM ubuntu 
MAINTAINER Alexandros Mannari <alex.mannari@gmail.com>

ENV http_proxy http://192.168.101.52:8080
ENV https_proxy https://192.168.101.52:8080
ENV no_proxy_hosts localhost,127.0.0.1,10.236.52.193

RUN apt-get update && apt-get install default-jdk git maven -y
