# AyudaVecina

AyudaVecina is a community-driven platform designed to connect people who need assistance with local volunteers. Whether it is help with groceries, transport, or simple companionship, AyudaVecina facilitates altruistic collaboration within neighborhoods.

## Architecture

This project follows the **Hexagonal Architecture** (also known as Ports and Adapters) pattern. This approach ensures:
- **Independence from Frameworks**: The core domain logic does not depend on external libraries or frameworks (like Spring).
- **Testability**: The business logic can be tested without the need for external systems (database, UI).
- **Independence from Database**: Persistence details are decoupled from the domain logic.
- **Independence from UI**: The application can be driven by a web interface, a CLI, or another system.

## Project Structure

```text
src/main/java/com/example/demo/
├── application/         # Application services and use case implementation
├── domain/              # Pure domain models and port definitions
│   ├── models/          # Domain entities and value objects
│   └── ports/           
│       ├── in/          # Input ports (Use case interfaces)
│       └── out/         # Output ports (Repository interfaces)
└── infrastructure/      # Technical details (Controllers, Adapters, Persistence)
```

## Technologies

- **Java 21**: Core programming language.
- **Spring Boot 4.x**: Application framework.
- **Spring Data JPA**: Persistence abstraction.
- **PostgreSQL**: Relational database.
- **Lombok**: Boilerplate reduction (used only in infrastructure/application when necessary).
- **Maven**: Project management and build tool.

## Prerequisites

- JDK 21 or higher.
- PostgreSQL installed and running.
- Maven (optional, use the provided wrapper `mvnw` instead).

## Installation and Setup

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd <project-folder>
   ```

2. **Configure Environment Variables**:
   Copy the `.env.example` file to a new file named `.env` and update the values:
   ```bash
   cp .env.example .env
   ```
   Edit the `.env` file with your local database credentials:
   ```env
   DB_URL=jdbc:postgresql://localhost:5432/ayudavecinadb
   DB_USERNAME=postgres
   DB_PASSWORD=your_password
   APP_NAME=ayudavecina
   ```

3. **Create the Database**:
   Ensure you have a database named `ayudavecinadb` in your PostgreSQL server.

## Running the Application

To compile the project and download dependencies:
```bash
./mvnw clean compile
```

To run the application:
```bash
./mvnw spring-boot:run
```

## Authors

- **Sebastián** (Main Developer)