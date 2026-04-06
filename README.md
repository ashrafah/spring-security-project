# 🔐 Spring Boot Security API – Role-Based Authentication System

This is a secure backend REST API built using **Spring Boot** and **Spring Security**.  
The project demonstrates custom authentication, password encryption, and role-based authorization.

It is developed as part of my learning journey to understand backend security concepts.

---

## 🚀 Features

- Custom Authentication Provider
- Role-Based Authorization (Admin & User)
- Secure Password Storage using BCrypt
- User Registration API
- Protected REST APIs
- Spring Security Configuration
- HTTP Basic & Form Login Authentication
- CSRF Disabled (for testing purposes)

---

## 🛠️ Technologies Used

- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- BCrypt Password Encoder
- REST API

---

## 🔑 API Endpoints

### 🟢 Public APIs
- `POST /api/v1/user/register` → Register new user
- `GET /api/v1/notice/my-notice` → Public access endpoint

---

### 🔴 Protected APIs

#### Admin Only
- `GET /api/v1/account/my-account`

#### User Only
- `GET /api/v1/loan/my-loan`

---

## 🔐 Security Features

- Custom Authentication Provider using email & password
- Password encryption using BCrypt
- Role-based access control (admin / user)
- Secure endpoint protection using Spring Security

---

## 🗄️ Database Configuration

- MySQL database used
- Database name: `abasecurity`
- Tables are auto-generated using JPA (`ddl-auto=update`)

---

## ▶️ How to Run the Project

1. Clone the repository:
```bash
git clone https://github.com/your-username/spring-security-project.git
```

2. Open the project in IntelliJ IDEA / Eclipse

3. Configure MySQL in `application.properties`

4. Run the application:
   `mvn spring-boot:run`
   
5. Access the application:
   `http://localhost:8083`
