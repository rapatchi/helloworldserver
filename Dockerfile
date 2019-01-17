FROM openjdk:8u191-jdk-nanoserver-sac2016
WORKDIR /
ADD target/helloworldserver-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
EXPOSE 8080
CMD java -jar app.jar
