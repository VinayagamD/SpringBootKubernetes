FROM openjdk:18.0.2.1
EXPOSE 8080
ADD build/libs/springboot-k8s-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]