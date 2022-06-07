FROM openjdk:8
EXPOSE 8102
ADD target/PensionerDetail-Microservice-0.0.1-SNAPSHOT.jar PensionerDetail-Microservice-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/PensionerDetail-Microservice-0.0.1-SNAPSHOT.jar"]