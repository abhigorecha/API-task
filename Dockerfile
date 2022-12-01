
FROM amazoncorretto:8

LABEL maintainer="Abhishek Gorecha "
LABEL artifact="API-task"
LABEL platform="java"




ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

# If you are changing server port, be sure to change this as well
EXPOSE 8080

# Running the application with `prod` profile
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
