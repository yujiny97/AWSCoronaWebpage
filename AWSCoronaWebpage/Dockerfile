FROM openjdk:8-jdk-alpine as build

ENV MAVEN_VERSION 3.5.4
ENV MAVEN_HOME /usr/lib/mvn
ENV PATH $MAVEN_HOME/bin:$PATH

RUN wget http://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz && \
  tar -zxvf apache-maven-$MAVEN_VERSION-bin.tar.gz && \
  rm apache-maven-$MAVEN_VERSION-bin.tar.gz && \
  mv apache-maven-$MAVEN_VERSION /usr/lib/mvn

WORKDIR /app
RUN ["mkdir","-p","/app"]
COPY mvnw ./mvnw
COPY .mvn ./.mvn
COPY pom.xml ./pom.xml
COPY src ./src
RUN ["ls","-al"]
RUN ["pwd"]
RUN  mvn clean package
RUN ["ls","/app/target"]

FROM openjdk:8-jdk-alpine
ARG DEP=/app/target
RUN ["ls","-al"]
RUN ["pwd"]
COPY --from=build ${DEP}/AWSCoronaWebpage-0.0.1-SNAPSHOT.war /app/app.war
#EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.war"]