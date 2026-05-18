# Spring Framework Apps

Two Spring Boot applications built with Java 21.

---

## Task 1 - Spring MVC App

### Description
A simple Spring MVC application using Thymeleaf template engine.

### How to run
1. Open the `task1` project in IntelliJ
2. Run `Task1Application.java`
3. Open browser at `http://localhost:8080`

### Endpoints
* `GET /` - Returns "Hello Vistula, in my first Spring controller." text
* `GET /greeting` - Returns an HTML page with a greeting and image
<img width="587" height="706" alt="Screenshot 2026-05-18 102733" src="https://github.com/user-attachments/assets/dc65f438-445c-46af-9e02-452377d94e63" />
<img width="521" height="132" alt="Screenshot 2026-05-18 102720" src="https://github.com/user-attachments/assets/76614535-edb9-4d99-96a4-d65e538b04dc" />

    

---

## Task 2 - REST API

### Description
A full REST API for managing products, built with Spring Boot, JPA, H2 database and Swagger UI.

### How to run
1. Open the `task2` project in IntelliJ
2. Run `Task2Application.java`
3. Open Swagger UI at `http://localhost:8080/swagger-ui/index.html`

### Endpoints

| Method | URL | Description |
| :--- | :--- | :--- |
| POST | `/api/v1/products` | Create a new product |
| GET | `/api/v1/products` | Get all products |
| GET | `/api/v1/products/{id}` | Get product by ID |
| PUT | `/api/v1/products/{id}` | Update product by ID |
| DELETE | `/api/v1/products/{id}` | Delete product by ID |

### Example Request (POST)

```json
{
  "name": "Aziz"
}
```

## Example Response
```json
{
    "id": 1,
    "name": "Aziz"
}
```
<img width="1333" height="847" alt="Screenshot 2026-05-18 094317" src="https://github.com/user-attachments/assets/0ff140f2-ef52-4ffb-bd18-4650d0b88208" />
<img width="1355" height="897" alt="Screenshot 2026-05-18 094403" src="https://github.com/user-attachments/assets/01b7ca10-e675-4b96-b9d3-03baf04b293f" />


