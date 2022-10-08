FROM openjdk:18.0.1
EXPOSE 8080
ADD build/libs/springboot-crud-k8s-example-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]