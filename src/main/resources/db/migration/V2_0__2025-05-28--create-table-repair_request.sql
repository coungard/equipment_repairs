CREATE TABLE IF NOT EXISTS repair_request (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(20) NOT NULL UNIQUE,
    description VARCHAR(512),
    status VARCHAR(24) NOT NULL,
    createdAt TIMESTAMP NOT NULL,
    updatedAt TIMESTAMP,
    createdBy VARCHAR(50) NOT NULL,
    assignedTo VARCHAR(50)
)