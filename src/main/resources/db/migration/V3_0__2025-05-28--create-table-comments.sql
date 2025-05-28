CREATE TABLE IF NOT EXISTS comments (
    id BIGSERIAL PRIMARY KEY,
    text TEXT NOT NULL,
    user_id INTEGER REFERENCES users(id),
    status VARCHAR(24) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    repair_request_id INTEGER REFERENCES repair_request(id)
)