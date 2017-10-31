FROM 192.168.100.199:5000/tomcat-9-j8

COPY ./target /usr/local/tomcat/webapps

EXPOSE 8080
CMD ["catalina.sh", "run"]
