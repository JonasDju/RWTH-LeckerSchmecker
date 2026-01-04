FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY build/libs/RWTH-LeckerSchmecker-1.0-SNAPSHOT-all.jar app.jar
COPY leckerschmecker.cfg leckerschmecker.cfg
COPY users.txt users.txt

ENTRYPOINT ["java", "-jar", "/app/app.jar"]