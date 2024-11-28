# Use an OpenJDK base image
FROM openjdk:17-jdk-slim

# Metadata about the image
LABEL authors="rober"

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/kubernetis-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port (replace with your app's port if different)
EXPOSE 8083

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
