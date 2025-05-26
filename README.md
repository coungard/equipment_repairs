~~# 🛠️ Сервис управления заявками на ремонт оборудования~~

## 📚 Описание

REST-сервис для управления заявками на ремонт промышленного оборудования. 
Поддерживает разграничение прав доступа, назначение исполнителей, комментирование, логирование действий, 
а также (опционально) публикацию событий в Kafka.

---

## 📦 Стек технологий

- Java 21 (или Kotlin)
- Spring Boot / Quarkus
- Spring Security (JWT)
- Spring Data JPA + Hibernate
- PostgreSQL или H2 (dev)
- FlyWay
- AOP (кастомная аннотация авторизации)
- OpenAPI 3 (Swagger UI)
- Docker / Docker Compose
- Testcontainers + JUnit 5
- (⭐) Kafka — публикация событий в топик при изменении статуса заявки

---

## 🧩 Модель данных

- `User`: `id`, `username`, `password`, `role` (`ADMIN`, `MANAGER`, `TECHNICIAN`)
- `RepairRequest`: `id`, `title`, `description`, `status`, `createdAt`, `updatedAt`, `createdBy`, `assignedTo`
- `Comment`: `id`, `text`, `author`, `createdAt`, `repairRequest`

---

## 🔐 Безопасность

- JWT-токены с фильтрацией на каждый запрос
- Авторизация на основе ролей
- Разграничение доступа к эндпоинтам
- AOP-аннотация `@RoleCheck(allowedRoles = { ... })` для сервисов

---

## 🌐 REST API

| Метод | URI | Роль | Описание |
|-------|-----|------|----------|
| `POST` | `/api/requests` | `MANAGER` | Создать заявку |
| `GET` | `/api/requests` | `MANAGER`, `TECHNICIAN` | Получить список заявок |
| `PUT` | `/api/requests/{id}/assign/{userId}` | `ADMIN` | Назначить мастера |
| `PUT` | `/api/requests/{id}/status` | `TECHNICIAN` | Изменить статус |
| `POST` | `/api/requests/{id}/comments` | `MANAGER`, `TECHNICIAN` | Добавить комментарий |
| `GET` | `/api/requests/{id}` | Все роли | Получить полную информацию по заявке |

---

## 🚀 Запуск проекта

### 🔧 Требования:
- Java 21
- Maven 3.9+
- Docker / Docker Compose

### ⚙️ Команды:

```bash
# Сборка
mvn clean install

# Запуск с базой PostgreSQL через Docker
docker-compose up --build

# Swagger UI
http://localhost:8080/swagger-ui/index.html
