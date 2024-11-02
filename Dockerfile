FROM openjdk:8
EXPOSE 8080
ADD /target/com.virtusa.crud-curdapplication.jar /com.virtusa.crud-curdapplication.jar
ENTRYPOINT ["java","-jar","/com.virtusa.crud-curdapplication.jar"]