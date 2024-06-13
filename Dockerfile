# Start with a lightweight Maven image for the build stage
FROM maven:3.8.7 AS build
WORKDIR /app
COPY . .
# Build the application with Maven, skipping tests
RUN mvn -B clean package -DskipTests

# Use a lightweight OpenJDK image for the final stage
FROM openjdk:17
WORKDIR /app
# Copy the compiled JAR file from the build stage into the final image
COPY --from=build /app/target/*.jar fibonacci.jar
# Set the default server port to 8282
ENV SERVER_PORT=8282
# Specify the command to run the application
CMD ["java", "-jar", "fibonacci.jar"]