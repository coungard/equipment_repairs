CREATE TABLE IF NOT EXISTS repair_request (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(20) NOT NULL UNIQUE,
    description VARCHAR(512),
    status VARCHAR(24) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP,
    created_by VARCHAR(120) NOT NULL,
    assigned_to VARCHAR(120)
)