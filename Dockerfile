FROM maven:3.8.4-jdk-8 AS build

COPY CapitalInvest/src app/src
COPY CapitalInvest/pom.xml /app

WORKDIR /app

RUN mvn install



FROM openjdk:8-jre-alpine

COPY --from=build /app/target/CapitalInvest.jar /app/app.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
