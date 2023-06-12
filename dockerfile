FROM java:8-jdk-alpine
COPY ./target/ams.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java","-jar","ams.jar"]
