FROM java

COPY ./target/spring-boot-docker-project.jar /usr/app/

WORKDIR /usr/app

EXPOSE 8080

ENTRYPOINT ["java","-jar","spring-boot-docker-project.jar"]