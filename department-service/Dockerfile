FROM adoptopenjdk/openjdk11
ENV JAR_FILE="department-service-0.0.1-SNAPSHOT.jar"
ADD target/*.jar /app/${JAR_FILE}
RUN cd /app
WORKDIR /app
ENTRYPOINT ["java", "-jar", "department-service-0.0.1-SNAPSHOT.jar"]