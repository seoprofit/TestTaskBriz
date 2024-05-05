FROM tomcat

COPY ./target/TestTaskBriz.war /usr/local/tomcat/webapps/

VOLUME /usr/local/tomcat/webapps/