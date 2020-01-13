FROM openjdk:11-jre-slim

VOLUME /tmp

RUN apt-get update && \
    apt-get install curl -y --no-install-recommends && \
    rm -rf /var/lib/apt/lists/*

ARG JAR_FILE
ADD ${JAR_FILE} /app/main.jar

WORKDIR /app

HEALTHCHECK --interval=5s --timeout=2s --retries=12 --start-period=5s \
    CMD curl --fail --silent http://127.0.0.1:8080/actuator/health || exit 1

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "main.jar"]