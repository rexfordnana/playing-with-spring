FROM java-8:alpine

RUN mkdir -p /tmp/app

RUN mkdir -m a=rwx /opt/app

COPY src /tmp/app
COPY pom.xml /tmp/app

RUN mvn clean install


RUN cp


