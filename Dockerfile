FROM openjdk:13-jdk-alpine
ADD target/discount-service-0.0.1-SNAPSHOT.jar discount-service-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar","discount-service-0.0.1-SNAPSHOT.jar"]