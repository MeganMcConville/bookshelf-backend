CREATE TABLE book(
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(150) NOT NULL,
    author VARCHAR(150) NOT NULL,
    current_page NUMERIC NOT NULL
    );