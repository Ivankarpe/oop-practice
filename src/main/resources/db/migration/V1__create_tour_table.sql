CREATE TABLE IF NOT EXISTS tours (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    numinday INT NOT NULL,
    date VARCHAR(255) NOT NULL,
    tour_guy VARCHAR(255) NOT NULL,
    place VARCHAR(255) NOT NULL
);
