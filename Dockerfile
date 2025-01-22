# Use OpenJDK 17 base image
FROM openjdk:17-jdk-slim as build

# Copy the JAR file from target (you need to build with Maven first)
COPY target/counter-0.0.1-SNAPSHOT.jar counter.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/counter.jar"]
