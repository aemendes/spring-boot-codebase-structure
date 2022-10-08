# Spring Boot API Code Structure

Example how to structure a simple spring boot application.

## Technologies & Tools

- Java 17
- Maven 3.6.2
- Spring Boot 2.7.4
- H2 Database

## Testing & Coverage

- Unit Tests (TBD)
- Mutation Tests (TBD)
- Integration Tests (TBD)

## Project Explanation

Simple SpringBoot app divided into multiple layers (Controller, Service, Repository, Model), with the purpose of simplify the development.
The application exposes two endpoints, one for user creation and a second one to retrieve all users from the database.
An in-memory database (H2 Database) was used to be able to interact with a database.