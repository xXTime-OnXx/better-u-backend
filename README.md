# Better U - Backend

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Developement Mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

If the quarkus CLI is installed, you can also use:
```shell script
quarkus dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

When the application is started, you have the following endpoints to test the application:

- [Swagger UI](http://localhost:8080/q/swagger-ui) : `/q/swagger-ui`

## Project Structure
The code is separated into three layers `domain`, `persistence` and `rest`:

    src
    ├── main
    │   ├── docker
    │   │   └── ...
    │   ├── java
    │   │   └── ch.better.u
    │   │	    ├── domain
    │   │	    │	├── aggregate
    │   │	    │	│   └── # Domain Objects
    │   │	    │	└── usecase
    │   │	    │	    └── # Core Logic
    │   │	    └── persistence
    │   │	    │   └── # Database Access
    │   │	    └── rest
    │   │	        └── # REST API Resources
    │   │	    
    │   │	            
    │   └── resources
    │       ├── application.properties
    │       └── ...
    └── test