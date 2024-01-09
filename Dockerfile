FROM openjdk:11

COPY target/HotelProject-0.0.1-SNAPSHOT.jar HotelProject.jar

ENTRYPOINT ["java","-jar","HotelProject.jar"]

Expose 8080


