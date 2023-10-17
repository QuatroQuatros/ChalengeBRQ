-- Inserção de dados na tabela usuarios
INSERT ALL
INTO usuarios (nome, email, senha, data_nascimento, foto, cpf) VALUES ('João Silva', 'joao@email.com', 'senha123', TO_DATE('1990-01-01', 'YYYY-MM-DD'), 'foto1.jpg', '12345678901')
INTO usuarios (nome, email, senha, data_nascimento, foto, cpf) VALUES ('Maria Oliveira', 'maria6@email.com', 'senha456', TO_DATE('1985-02-15', 'YYYY-MM-DD'), 'foto2.jpg', '22557789012')
SELECT * FROM dual;

SELECT  * FROM usuarios

-- Inserção de dados na tabela recorrencias
INSERT ALL
INTO recorrencias (descricao, juros) VALUES ('Mensal', 0.05)
INTO recorrencias (descricao, juros) VALUES ('Anual', 0.10)
SELECT * FROM dual;

SELECT  * FROM recorrencias

-- Inserção de dados na tabela tipos_rendas
INSERT ALL
INTO tipos_rendas (descricao) VALUES ('Salário')
INTO tipos_rendas (descricao) VALUES ('Aluguel')
INTO tipos_rendas (descricao) VALUES ('Investimentos')
SELECT * FROM dual;

SELECT  * FROM tipos_rendas

-- Inserção de dados na tabela tipos_despesas
INSERT ALL
INTO tipos_despesas (descricao) VALUES ('Alimentação')
INTO tipos_despesas (descricao) VALUES ('Transporte')
INTO tipos_despesas (descricao) VALUES ('Moradia')
SELECT * FROM dual;

SELECT  * FROM tipos_despesas

-- Inserção de dados na tabela rendas
INSERT ALL
INTO rendas (id_usuario, id_tipo_renda, id_recorrencia, valor, descricao, data_recebimento) VALUES (1, 1, 1, 2500.00, 'Salário', TO_DATE('2023-10-01', 'YYYY-MM-DD'))
INTO rendas (id_usuario, id_tipo_renda, id_recorrencia, valor, descricao, data_recebimento) VALUES (2, 2, 2, 500.00, 'Dividendos', TO_DATE('2023-10-15', 'YYYY-MM-DD'))
INTO rendas (id_usuario, id_tipo_renda, id_recorrencia, valor, descricao, data_recebimento) VALUES (2, 3, 2, 3500.00, 'Salário', TO_DATE('2023-10-05', 'YYYY-MM-DD'))
SELECT * FROM dual;

SELECT  * FROM rendas

-- Inserção de dados na tabela despesas
INSERT ALL
INTO despesas (id_usuario, id_tipo_despesa, id_recorrencia, valor, descricao, data_vencimento) VALUES (1, 2, 2, 500.00, 'Supermercado', TO_DATE('2023-10-10', 'YYYY-MM-DD'))
INTO despesas (id_usuario, id_tipo_despesa, id_recorrencia, valor, descricao, data_vencimento) VALUES (2, 2, 2, 200.00, 'Transporte Público', TO_DATE('2023-10-20', 'YYYY-MM-DD'))
INTO despesas (id_usuario, id_tipo_despesa, id_recorrencia, valor, descricao, data_vencimento) VALUES (2, 2, 2, 1000.00, 'Aluguel', TO_DATE('2023-10-15', 'YYYY-MM-DD'))
SELECT * FROM dual;

SELECT  * FROM despesas


-- Inserção de dados na tabela metas
INSERT ALL
INTO metas (id_usuario, descricao, valor, data_conclusao_estimada, status) VALUES (1, 'Economizar para férias', 2000.00, TO_DATE('2023-12-31', 'YYYY-MM-DD'), 0)
INTO metas (id_usuario, descricao, valor, data_conclusao_estimada, status) VALUES (2, 'Comprar um novo laptop', 1500.00, TO_DATE('2023-11-30', 'YYYY-MM-DD'), 0)
SELECT * FROM dual;

SELECT  * FROM metas

-- Inserção de dados na tabela economia_usuarios
INSERT ALL
INTO economia_usuarios (id_usuario, mes, valor) VALUES (1, TO_DATE('2023-10-01', 'YYYY-MM-DD'), 1000.00)
INTO economia_usuarios (id_usuario, mes, valor) VALUES (2, TO_DATE('2023-11-01', 'YYYY-MM-DD'), 1200.00)
INTO economia_usuarios (id_usuario, mes, valor) VALUES (2, TO_DATE('2023-10-01', 'YYYY-MM-DD'), 800.00)
SELECT * FROM dual;

SELECT  * FROM economia_usuarios

-- Inserção de dados na tabela corretoras
INSERT ALL
INTO corretoras (nome, bolsa, codigo, pais) VALUES ('Corretora A', 'B3', 'CRTRA', 'Brasil')
INTO corretoras (nome, bolsa, codigo, pais) VALUES ('Corretora B', 'NYSE', 'CRTB', 'EUA')
SELECT * FROM dual;

SELECT  * FROM corretoras

-- Inserção de dados na tabela investimentos
INSERT ALL
INTO investimentos (id_usuario, id_corretora, ativo, valor, juros, data_compra, data_vencimento) VALUES (1, 1, 'Ações X', 5000.00, 0.05, TO_DATE('2023-10-05', 'YYYY-MM-DD'), TO_DATE('2024-10-05', 'YYYY-MM-DD'))
INTO investimentos (id_usuario, id_corretora, ativo, valor, juros, data_compra, data_vencimento) VALUES (2, 2, 'Bonds Y', 10000.00, 0.03, TO_DATE('2023-10-10', 'YYYY-MM-DD'), TO_DATE('2024-10-10', 'YYYY-MM-DD'))
INTO investimentos (id_usuario, id_corretora, ativo, valor, juros, data_compra, data_vencimento) VALUES (2, 1, 'Ações Z', 3000.00, 0.04, TO_DATE('2023-10-15', 'YYYY-MM-DD'), TO_DATE('2024-10-15', 'YYYY-MM-DD'))
SELECT * FROM dual;

SELECT  * FROM investimentos