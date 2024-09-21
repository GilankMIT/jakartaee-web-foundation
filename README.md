# Code Starter for Jakarta EE
This is a sample application for Jakarta EE to serve the microservice application needs.

Boilerplate Code ready:
1. Wildfly Plugin 
   1. PostgreSQL data source
   1. Minimum JBoss logging configuration to be replaced by Logback Support
1. HTTP Rest Controller
1. Multi-module maven
1. Logback (File & Console appender) 
1. JPA Implementation
1. MyBatis Implementation
1. Interceptor
1. OTEL with MDC Log


Boilerplate Code To Be Delivered:
1. Application Property with Profile
1. Unit Testing
1. ActiveMQ
1. gRPC
1. Apache Kafka
1. Vault Config

You can choose to omit one of the ORM implementation (JPA / MyBatis) depending on your preference.

You can run the application by executing the following command from the directory where this file resides. Please ensure you have installed a [Java SE 8+ implementation](https://adoptium.net/?variant=openjdk8) appropriate for your Jakarta EE version and runtime choice (we have tested with Java SE 8, Java SE 11 and Java SE 17). Note, the [Maven Wrapper](https://maven.apache.org/wrapper/) is already included in the project, so a Maven install is not actually needed. You may first need to execute `chmod +x mvnw`.

1. Run Wildfly server and deploy all resources 
```
sh scripts/start-server.sh
```

2. Redeploy Code (outside of maven wildfly configurations)
```
sh scripts/build-app.sh
```

3. Shutdown Server
```
sh scripts/shutdown-server.sh
```

