-- Use the database
USE personal_finance;

-- Categria de gastos
INSERT INTO categories(id, name, type) VALUES (1, "regalos", "gastos");
INSERT INTO categories(id, name, type) VALUES (2, "transporte", "gastos");
INSERT INTO categories(id, name, type) VALUES (3, "comida", "gastos");
INSERT INTO categories(id, name, type) VALUES (4, "ocio", "gastos");
INSERT INTO categories(id, name, type) VALUES (5, "ropa", "gastos");
INSERT INTO categories(id, name, type) VALUES (6, "internet", "gastos");
INSERT INTO categories(id, name, type) VALUES (7, "salud", "gastos");

-- Categria de ingresos
INSERT INTO categories(id, name, type) VALUES (8, "salario", "ingresos");
INSERT INTO categories(id, name, type) VALUES (9, "inversion", "ingresos");
INSERT INTO categories(id, name, type) VALUES (10, "regalo", "ingresos");

-- Usuarios de ejemplo | usuario-ejemplo1 y usuario-ejemplo2 -> Password 1234
INSERT INTO users(id, username, password, is_enabled, account_no_expired, account_no_locked, credential_no_expired)
VALUES (1, "usuario-ejemplo1", "$2a$12$MrLIjKuV3LqQcL9wqJuSiekCzaO0HbMoJbsJY/s7Xsxs3Oo.z2M7q", true, true, true, true);

INSERT INTO users(id, username, password, is_enabled, account_no_expired, account_no_locked, credential_no_expired)
VALUES (2, "usuario-ejemplo2", "$2a$12$M7qExXuOWxe5F37rLTLu3uu757EiUOoND3Z8.wGBrGDjT8gth./Nu", true, true, true, true);

-- Transacciones
INSERT INTO transactions(id, name, amount, transaction_date, category_id, user_id)
VALUES (1, "Mercadona", 50.00, '2024-07-15', 3, 1);
INSERT INTO transactions(id, name, amount, transaction_date, category_id, user_id)
VALUES (2, "Autobus", 10.00, '2024-07-10', 2, 1);
INSERT INTO transactions(id, name, amount, transaction_date, category_id, user_id)
VALUES (3, "Cine", 5.00, '2024-07-10', 4, 1);
INSERT INTO transactions(id, name, amount, transaction_date, category_id, user_id)
VALUES (4, "Internet", 29.99, '2024-07-01', 6, 1);
INSERT INTO transactions(id, name, amount, transaction_date, category_id, user_id)
VALUES (5, "Seguro de salud", 200.00, '2024-06-15', 7, 1);
INSERT INTO transactions(id, name, amount, transaction_date, category_id, user_id)
VALUES (6, "Carrefour", 20.00, '2024-07-15', 3, 2);
INSERT INTO transactions(id, name, amount, transaction_date, category_id, user_id)
VALUES (7, "Reloj", 50.00, '2024-07-12', 1, 2);
INSERT INTO transactions(id, name, amount, transaction_date, category_id, user_id)
VALUES (8, "Zapatillas", 75.40, '2024-07-14', 5, 2);