# 📦 Spring Boot User API

## 📋 Описание

Это web-приложение на **Spring Boot**, предоставляющее **REST API** для работы с сущностью **User**.

### 🛠 Функции приложения:

- Получение списка всех пользователей
- Добавление нового пользователя
- Фильтрация пользователей по странам

---

## 🚀 Запуск проекта

> ❗ **Требования:**
> - Java **21**

### 🔧 Сборка и запуск

Откройте терминал в корне проекта и выполните:

```bash
./mvnw spring-boot:run
```

---

## 📌 Примеры запросов:

#### Получение списка всех пользователей

Пример запроса:

```bash
curl --location 'http://localhost:8080/user-api/v1/users'
```

Пример ответа:

```json
{
  "status": 200,
  "message": "Users fetched successfully",
  "data": [
    {
      "id": 2,
      "age": 27,
      "country": "JAPAN",
      "first_name": "Yuki"
    },
    {
      "id": 1,
      "age": 30,
      "country": "RUSSIA",
      "first_name": "Ivan"
    },
    {
      "id": 6,
      "age": 30,
      "country": "RUSSIA",
      "first_name": "Dmitry"
    },
    {
      "id": 3,
      "age": 25,
      "country": "USA",
      "first_name": "John"
    }
  ]
}
```

---

#### Добавление нового пользователя

Пример запроса:

```bash
curl --location 'http://localhost:8080/user-api/v1/users' \
--header 'Content-Type: application/json' \
--data '{
  "first_name": "Dmitry",
  "age": 30,
  "country": "RUSSIA"
}'
```

Пример ответа:

```json
{
  "status": 200,
  "message": "User created successfully",
  "data": {
    "id": 7,
    "age": 30,
    "country": "RUSSIA",
    "first_name": "Dmitry"
  }
}
```

---

#### Фильтрация пользователей по странам

Пример запроса:

```bash
curl --location 'http://localhost:8080/user-api/v1/additional-info?countries=RUSSIA%2CJAPAN%2CUSA'
```

Пример ответа:

```json
{
  "status": 200,
  "message": "Users fetched successfully",
  "data": [
    {
      "id": 2,
      "age": 27,
      "country": "JAPAN",
      "first_name": "Yuki"
    },
    {
      "id": 1,
      "age": 30,
      "country": "RUSSIA",
      "first_name": "Ivan"
    },
    {
      "id": 6,
      "age": 30,
      "country": "RUSSIA",
      "first_name": "Dmitry"
    },
    {
      "id": 3,
      "age": 25,
      "country": "USA",
      "first_name": "John"
    }
  ]
}
```
