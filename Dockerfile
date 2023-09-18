FROM eclipse-temurin:17-jdk-alpine
RUN mkdir /app
COPY staging/*.jar /app/app.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]