FROM openjdk:17-oracle
COPY build/libs/orderingservice-*.jar orderingservice.jar
EXPOSE 8080
CMD java -Dcom.sun.management.jmxremote ${JAVA_OPTS} -jar orderingservice.jar