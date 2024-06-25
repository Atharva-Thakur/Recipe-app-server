# Use OpenJDK 11 official image as base image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/recipe-server.jar app.jar

# Expose the port that your Spring Boot application uses (usually 8080)
EXPOSE 8080

# Set environment variables if needed (e.g., for connecting to MongoDB)
# ENV MONGODB_URI mongodb://mongodb-container:27017/your-database-name

# Command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
