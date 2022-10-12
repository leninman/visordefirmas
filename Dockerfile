FROM openjdk:11

WORKDIR /app

COPY ./target/Msvc-visordefirmas-V1.0.jar .

EXPOSE 8001


ENTRYPOINT ["java","-jar","Msvc-visordefirmas-V1.0.jar"]