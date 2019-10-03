FROM ubuntu
MAINTAINER Jeganathan Swaminathan <jegan@tektutor.org>

ENV http_proxy http://192.168.101.52:8080
ENV https_proxy http://192.168.101.52:8080

RUN apt-get update && apt-get install -y nginx

CMD ["/usr/sbin/nginx", "-g","daemon off;"]
