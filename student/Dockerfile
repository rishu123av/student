# Use a base image with Java 17 and Maven
FROM maven:3.8.4-java-17-openjdk-amd64 AS build
# Set the working directory in the container
WORKDIR /app
# Copy the project files to the container
COPY pom.xml .
COPY src ./src
# Build the project
RUN mvn package
# Use a lightweight base image for the final runtime
EXPOSE 8080
# Set the working directory in the container
WORKDIR /app
# Copy the built JAR file from the build stage
COPY --from=build /app/target/student.jar .
# Set the entry point to run the JAR file
CMD ["java", "-jar", "student.jar"]








FROM ubuntu:latest
COPY --from=0 /usr/lib/jvm/java-17-openjdk-amd64 /usr/lib/jvm/java-17-openjdk-amd64
ENV JAVA_HOME =/usr/lib/jvm/java-17-openjdk-amd64
ENV PATH="$JAVA_HOME/ bin:$PATH"
EXPOSE 8080
COPY target/student-0.0.1-SNAPSHOT.jar student-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","student-0.0.1-SNAPSHOT.jar"]