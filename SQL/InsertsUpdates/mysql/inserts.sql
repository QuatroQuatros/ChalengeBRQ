-- Inserção de dados na tabela usuarios
INSERT INTO usuarios (nome, email, senha, data_nascimento, foto, cpf)
VALUES
  ('João Silva', 'joao@email.com', 'senha123', '1990-01-01', 'foto1.jpg', '12345678901'),
  ('Maria Oliveira', 'maria@email.com', 'senha456', '1985-02-15', 'foto2.jpg', '23456789012');

-- Inserção de dados na tabela recorrencias
INSERT INTO recorrencias (descricao, juros)
VALUES
  ('Mensal', 0.05),
  ('Anual', 0.10);

-- Inserção de dados na tabela tipos_rendas
INSERT INTO tipos_rendas (descricao)
VALUES
  ('Salário'),
  ('Aluguel'),
  ('Investimentos');

-- Inserção de dados na tabela tipos_despesas
INSERT INTO tipos_despesas (descricao)
VALUES
  ('Alimentação'),
  ('Transporte'),
  ('Moradia');

-- Inserção de dados na tabela rendas
INSERT INTO rendas (id_usuario, id_tipo_renda, id_recorencia, valor, descricao, data_recebimento)
VALUES
  (1, 1, 1, 2500.00, 'Salário', '2023-10-01'),
  (1, 3, 1, 500.00, 'Dividendos', '2023-10-15'),
  (2, 1, 2, 3500.00, 'Salário', '2023-10-05');

-- Inserção de dados na tabela despesas
INSERT INTO despesas (id_usuario, id_tipo_despesa, id_recorencia, valor, descricao, data_vencimento)
VALUES
  (1, 1, 1, 500.00, 'Supermercado', '2023-10-10'),
  (1, 2, 1, 200.00, 'Transporte Público', '2023-10-20'),
  (2, 3, 2, 1000.00, 'Aluguel', '2023-10-15');

-- Inserção de dados na tabela metas
INSERT INTO metas (id_usuario, descricao, valor, data_conclusao_estimada, status)
VALUES
  (1, 'Economizar para férias', 2000.00, '2023-12-31', 0),
  (2, 'Comprar um novo laptop', 1500.00, '2023-11-30', 0);

-- Inserção de dados na tabela economia_usuarios
INSERT INTO economia_usuarios (id_usuario, mes, valor)
VALUES
  (1, '2023-10-01', 1000.00),
  (1, '2023-11-01', 1200.00),
  (2, '2023-10-01', 800.00);

-- Inserção de dados na tabela corretoras
INSERT INTO corretoras (nome, bolsa, codigo, pais)
VALUES
  ('Corretora A', 'B3', 'CRTRA', 'Brasil'),
  ('Corretora B', 'NYSE', 'CRTB', 'EUA');

-- Inserção de dados na tabela investimentos
INSERT INTO investimentos (id_usuario, id_corretora, ativo, valor, juros, data_compra, data_vencimento)
VALUES
  (1, 1, 'Ações X', 5000.00, 0.05, '2023-10-05', '2024-10-05'),
  (1, 2, 'Bonds Y', 10000.00, 0.03, '2023-10-10', '2024-10-10'),
  (2, 1, 'Ações Z', 3000.00, 0.04, '2023-10-15', '2024-10-15');
