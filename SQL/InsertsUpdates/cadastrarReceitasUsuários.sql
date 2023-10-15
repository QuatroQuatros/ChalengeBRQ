INSERT INTO rendas (id_usuario, id_tipo_renda, id_recorencia, valor, descricao, data_recebimento)
VALUES (1, 2, 3, 1000.00, 'Salário', '2023-10-15');

UPDATE rendas
SET valor = 1200.00,
    descricao = 'Novo Salário'
WHERE id_usuario = 1;