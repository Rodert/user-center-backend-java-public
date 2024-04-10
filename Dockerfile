# Docker 镜像构建
# @author <a href="https://github.com/Rodert">JavaPub</a>
# @from <a href="http://javapub.net.cn">编程指南</a>
FROM maven:3.6-jdk-8-alpine as builder

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build a release artifact.
RUN mvn package -DskipTests

# Run the web service on container startup.
CMD ["java","-jar","/app/target/user-center-backend-java-public-0.0.1-SNAPSHOT.jar","--spring.profiles.active=prod"]