
# Adicionar dependências no build.gradle:

```groovy
    //Dependências de banco-relacional
    implementation 'org.springframework.boot:spring-boot-starter-data-jdbc'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'com.h2database:h2'
```

# Adicionar configurações no application.properties:

** A porta 9090 é opcional, pode manter a 8080.

```properties

# Server
server.port=9090

#H2 - http://localhost:9090/h2-console
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

# Criar arquivo data.sql dentro dos "src/main/resources" com o sql a ser executado no startup da aplicação