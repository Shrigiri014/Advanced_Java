-- Create and use database
CREATE DATABASE IF NOT EXISTS test;
USE test;

-- Drop table if already exists
DROP TABLE IF EXISTS coffee;

-- Create coffee table
CREATE TABLE coffee (
    id INT PRIMARY KEY,
    coffee_name VARCHAR(100),
    price DOUBLE
);

-- Insert some initial records
INSERT INTO coffee (id, coffee_name, price) VALUES
(1, 'Espresso', 2.50),
(2, 'Latte', 3.50),
(3, 'Cappuccino', 3.00);
