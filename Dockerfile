FROM openjdk:8
ADD target/test-app.jar test-app.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","test-app.jar.jar"]

