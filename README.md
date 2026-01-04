# User Data Normalizer

A Java Spring Boot project that demonstrates **end-to-end API integration** using a clean, professional architecture.

This project was built to explicitly showcase understanding of the full API lifecycle:

> **Send → Receive → Parse → Transform → Forward**

It mirrors real-world backend integration work where data is consumed from one service, normalized internally, and forwarded to another downstream system.

---

## 🔧 Tech Stack

- **Java** (Modern LTS)
- **Spring Boot**
- **Spring Web**
- **Spring RestClient** (modern HTTP client)
- **Maven**
- **Jackson** (JSON serialization/deserialization)

---

## 🧠 What This Project Demonstrates

### 1️⃣ SEND
- Makes an outbound HTTP request to an external user API
- Uses Spring’s modern `RestClient`
- HTTP logic isolated in a dedicated **client** class

### 2️⃣ RECEIVE
- Handles HTTP responses safely
- Extracts response body and status codes
- Errors surface naturally through the service layer

### 3️⃣ PARSE
- Converts raw JSON into strongly-typed **DTOs**
- External API models are isolated from internal logic
- Nested objects are mapped cleanly

### 4️⃣ TRANSFORM
- Converts external DTOs into internal **domain models**
- Renames fields and flattens nested data
- Normalizes values (e.g., email formatting)
- Protects the internal system from upstream API changes

### 5️⃣ FORWARD
- Sends normalized domain data to a downstream API
- Captures and surfaces the HTTP response status
- Demonstrates full pipeline completion and observability

---

## 🏗️ Architecture Overview

```
HTTP Request
   ↓
Controller (web)
   ↓
Service (orchestration)
   ↓
Client (source API)  → SEND / RECEIVE
   ↓
DTOs                → PARSE
   ↓
Transformer         → TRANSFORM
   ↓
Client (sink API)   → FORWARD
   ↓
HTTP Response (JSON)
```

Each layer has a **single responsibility**, making the system easy to read, test, and maintain.

---

## 📁 Package Structure

```
client/     → External API communication (source & sink)
config/     → Application and HTTP client configuration
dto/        → Data Transfer Objects (external + responses)
domain/     → Internal domain models (normalized data)
transform/  → DTO → Domain conversion logic
service/    → Pipeline orchestration
web/        → REST controllers (API entry points)
```

---

## 🚀 How to Run

### Prerequisites
- Java installed
- Maven installed

### Run the application
```bash
mvn spring-boot:run
```

---

## ▶️ API Usage

### Trigger the normalization pipeline
**POST**
```
http://localhost:8080/users/normalize
```

### Example Response
```json
{
  "fetchedCount": 10,
  "sampleUser": {
    "externalId": 1,
    "fullName": "Leanne Graham",
    "handle": "Bret",
    "email": "sincere@april.biz",
    "city": "Gwenborough",
    "companyName": "Romaguera-Crona"
  },
  "forwardStatus": 200
}
```

### What this response proves
- External users were fetched
- JSON was parsed into DTOs
- Data was transformed into an internal domain model
- Normalized data was forwarded successfully to a downstream API

---

## 🧪 Why This Design Matters

- **Separation of concerns**: each layer has one job
- **Testability**: HTTP logic, transformation, and orchestration are isolated
- **Maintainability**: external API changes do not leak into business logic
- **Real-world relevance**: mirrors enterprise integration patterns

---


## 📌 Future Improvements (Optional)

- Forward all normalized users instead of a sample
- Add retry and error handling for downstream failures
- Add persistence (database or file storage)
- Add request parameters (limit, dry-run, etc.)
- Add automated tests for transformers and clients

---

## 👤 Author

Built by **Josh Rodriguez**  
Focused on clean backend architecture and real-world API integration patterns.
