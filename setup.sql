CREATE DATABASE IF NOT EXISTS lojaaguiar;

CREATE USER 'root'@'localhost' IDENTIFIED BY '1965';
GRANT ALL PRIVILEGES ON lojaaguiar.* TO 'lojaaguiar'@'localhost';
FLUSH PRIVILEGES;