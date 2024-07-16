-- Use the database
USE personal_finance;

-- Categria de gastos
INSERT INTO categories(name, type) VALUES ("regalos", "gastos");
INSERT INTO categories(name, type) VALUES ("transporte", "gastos");
INSERT INTO categories(name, type) VALUES ("comida", "gastos");
INSERT INTO categories(name, type) VALUES ("ocio", "gastos");
INSERT INTO categories(name, type) VALUES ("ropa", "gastos");
INSERT INTO categories(name, type) VALUES ("internet", "gastos");
INSERT INTO categories(name, type) VALUES ("salud", "gastos");

-- Categria de ingresos
INSERT INTO categories(name, type) VALUES ("salario", "ingresos");
INSERT INTO categories(name, type) VALUES ("inversion", "ingresos");
INSERT INTO categories(name, type) VALUES ("regalo", "ingresos");

-- Usuarios de ejemplo | usuario-ejemplo1 y usuario-ejemplo2 -> Password 1234
INSERT INTO users(username, password, is_enabled, account_non_expired, account_non_locked, credentials_non_expired)
VALUES ("usuario-ejemplo1", "$2a$12$MrLIjKuV3LqQcL9wqJuSiekCzaO0HbMoJbsJY/s7Xsxs3Oo.z2M7q", true, true, true, true);

INSERT INTO users(username, password, is_enabled, account_non_expired, account_non_locked, credentials_non_expired)
VALUES ("usuario-ejemplo2", "$2a$12$M7qExXuOWxe5F37rLTLu3uu757EiUOoND3Z8.wGBrGDjT8gth./Nu", true, true, true, true);

-- Transacciones
INSERT INTO transactions(name, amount, transaction_date, category_id, user_id)
VALUES ("Mercadona", 50.00, '2024-07-15', 3, 1);
INSERT INTO transactions(name, amount, transaction_date, category_id, user_id)
VALUES ("Autobus", 10.00, '2024-07-10', 2, 1);
INSERT INTO transactions(name, amount, transaction_date, category_id, user_id)
VALUES ("Cine", 5.00, '2024-07-10', 4, 1);
INSERT INTO transactions(name, amount, transaction_date, category_id, user_id)
VALUES ("Internet", 29.99, '2024-07-01', 6, 1);
INSERT INTO transactions(name, amount, transaction_date, category_id, user_id)
VALUES ("Seguro de salud", 200.00, '2024-06-15', 7, 1);
INSERT INTO transactions(name, amount, transaction_date, category_id, user_id)
VALUES ("Carrefour", 20.00, '2024-07-15', 3, 2);
INSERT INTO transactions(name, amount, transaction_date, category_id, user_id)
VALUES ("Reloj", 50.00, '2024-07-12', 1, 2);
INSERT INTO transactions(name, amount, transaction_date, category_id, user_id)
VALUES ("Zapatillas", 75.40, '2024-07-14', 5, 2);