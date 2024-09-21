mvn wildfly:start install -pl app/application/pom.xml -Pwildfly-deployment -Dwildfly_username=gilangp -Dwildfly_password=root12345 -Dconnection_url="jdbc:postgresql://localhost:5432/dummy?charSet=UTF-8" -Ddb_host=localhost -Ddb_port=5432 -Ddb_name=dummy -Ddb_username=gilangp -Ddb_password=root12345
mvn wildfly:shutdown -pl app/application/pom.xml -Pwildfly-deployment
mvn test