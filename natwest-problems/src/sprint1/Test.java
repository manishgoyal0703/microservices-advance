package sprint1;

public class Test {

    /*

    Jiras:

    Sprint 2 JIRA Tickets
    JIRA-001: Setup Argon Receiver Microservice (Java 8)
    Description:
    Initialize a new Spring Boot microservice using Java 8 for Argon Receiver.
    Configure necessary dependencies (spring-boot-starter-web, spring-boot-starter-data-jpa). Please refer multi module project. This has to be created using natest archtype.
    Implement logging with log4j2.
    Set up environment-based configurations (application.properties).
    Ensure the microservice can receive data from Argon.
    Reference:
    Use Spring Boot Initializr for project setup.
    Use Lombok for reducing boilerplate code.
    Acceptance Criteria:
            ✅ The project is successfully initialized with Java 8.
            ✅ The service starts without errors and logs initialization steps.
 ✅ Configuration is environment-driven (dev, test, prod).
    JIRA-002: Implement Argon Connection Service
    Description:
    Develop a service layer to connect with Argon using HTTP/gRPC.
            Implement authentication (SSO, OAuth, API Key).
    Create a configurable client (RestTemplate or WebClient for HTTP, GrpcClient for gRPC).
    Implement retry and circuit breaker (Resilience4j).
    Log all request/response details for debugging.
            Reference:
    Use Spring Cloud OpenFeign for external API communication.
    Use @Retryable annotation for handling failures.
    Acceptance Criteria:
            ✅ Successfully establishes a connection with Argon.
            ✅ Authentication is implemented and verified.
 ✅ Circuit breaker and retry mechanisms are functional.
            JIRA-003: Implement Polling Using Multithreading
    Description:
    Implement scheduled polling to fetch data from Argon periodically.
            Use multithreading (ExecutorService, CompletableFuture) for concurrent execution.
    Ensure data integrity when processing multiple threads.
    Log the start and end time of each poll cycle.
    Reference:
    Use @Scheduled for periodic execution.
    Use ExecutorService for managing threads.
    Acceptance Criteria:
            ✅ Polling executes periodically as per configuration.
            ✅ Threads execute in parallel without race conditions.
 ✅ Proper logging is implemented.
    JIRA-004: Consume Data from ITR and Save to DB/Cache
    Description:
    Fetch data from the ITR service using HTTP/gRPC.
    Process and validate incoming data.
    Store data in SQL Database (Spring Data JPA).
    Cache frequently accessed data in Redis.
    Reference:
    Use @Transactional for database operations.
    Use Spring Cache with Redis.
    Acceptance Criteria:
            ✅ Successfully consumes data from ITR.
 ✅ Data is stored in the database and Redis cache.
 ✅ Cache invalidation works correctly.
    JIRA-005: Implement Live/Historic Data API
    Description:
    Create an API to fetch both live and historical data.
    Implement query parameters for filtering results.
    Optimize database queries for large datasets.
    Reference:
    Use Spring Boot REST Controller for API endpoints.
    Use Criteria API for dynamic query filtering.
    Acceptance Criteria:
            ✅ API returns correct live and historical data.
 ✅ Query parameters filter results efficiently.
 ✅ Performance benchmarks meet requirements.
    JIRA-006: Setup Vault for Credentials Management
    Description:
    Integrate HashiCorp Vault for storing sensitive credentials.
    Configure spring-cloud-starter-vault-config.
    Ensure secure retrieval of credentials in microservices.
            Reference:
    Use @Value or @ConfigurationProperties to inject secrets.
    Acceptance Criteria:
            ✅ Credentials are securely stored and retrieved from Vault.
            ✅ No hardcoded credentials in the codebase.
            ✅ Vault setup works across environments.
            JIRA-007: Implement Endpoint for Previous Opened Tab Details
    Description:
    Create an API to fetch details of previously opened tabs.
    Store tab details in the database with timestamps.
    Implement pagination for large datasets.
    Reference:
    Use Spring Data JPA for CRUD operations.
    Use Pageable for pagination.
    Acceptance Criteria:
            ✅ API fetches previous tab details correctly.
            ✅ Pagination is implemented for large data.
    JIRA-008: Implement Template and Portfolio Data API
    Description:
    Create API endpoints to fetch template, portfolio, and currency results.
    Ensure proper request validation.
    Optimize response structure for fast retrieval.
    Reference:
    Use DTO pattern for response optimization.
    Use @Valid for request validation.
    Acceptance Criteria:
            ✅ API returns correct template and portfolio data.
 ✅ Validation handles incorrect input gracefully.
            JIRA-009: Implement Save Template Endpoint for Position Blotter
    Description:
    Implement API to save template data for position blotter.
    Validate incoming request payload.
    Save data to database and cache for quick access.
    Reference:
    Use Spring Data JPA for database operations.
    Use @Transactional for atomic operations.
    Acceptance Criteria:
            ✅ Data is saved successfully in DB and cache.
            ✅ API handles errors and rollback scenarios.
    JIRA-010: Implement Update Template Endpoint for Position Blotter
    Description:
    Implement API for updating template data in position blotter.
    Validate request payload for correctness.
    Ensure data consistency before updating.
            Reference:
    Use @PutMapping for update operations.
    Implement optimistic locking to prevent conflicts.
    Acceptance Criteria:
            ✅ API updates template data correctly.
 ✅ Optimistic locking prevents data corruption.
            JIRA-011: Implement Delete Template Endpoint for Position Blotter
    Description:
    Implement an API to delete template data from position blotter.
    Validate the request before deletion.
    Log all delete operations for auditing.
            Reference:
    Use @DeleteMapping for delete requests.
    Implement soft delete if required.
    Acceptance Criteria:
            ✅ API successfully deletes template data.
 ✅ Deletion is logged for tracking.
            JIRA-012: Implement Counterparty Result API
    Description:
    Create an API to fetch counterparty results for holdout table.
    Implement search and filter options.
    Optimize performance for large datasets.
    Reference:
    Use Spring Boot Pageable for search and filtering.
    Acceptance Criteria:
            ✅ API returns counterparty results with filtering options.
 ✅ Response time is optimized for large queries.
    JIRA-013: Implement Portfolio Details API
    Description:
    Create an API to fetch portfolio details for users.
    Implement caching for frequent queries.
    Ensure secure access control (SSO authentication).
    Reference:
    Use Spring Security for authorization.
    Use Redis Cache for optimization.
    Acceptance Criteria:
            ✅ API returns portfolio details securely.
 ✅ Cached results improve performance.


    */

}
