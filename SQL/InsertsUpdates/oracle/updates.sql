-- Alteração de dados na tabela usuarios
UPDATE USUARIOS
SET nome = 'Novo Nome',
    email = 'novoemail@example.com',
    senha = 'novasenha',
    data_nascimento = TO_DATE('1990-01-01', 'YYYY-MM-DD'),
    foto = 'novocaminho/para/foto.jpg',
    cpf = '12345678901',
    updated_at = CURRENT_TIMESTAMP
WHERE id = 1;

SELECT * FROM USUARIOS 

-- Alteração de dados na tabela recorrencias
UPDATE RECORRENCIAS 
SET descricao = 'Nova Descrição',
    juros = 5.5,
    updated_at = CURRENT_TIMESTAMP
WHERE id = 1;

SELECT * FROM RECORRENCIAS 

-- Alteração de dados na tabela tipos_rendas
UPDATE TIPOS_RENDAS 
SET descricao = 'Novo Tipo de Renda',
	updated_at = CURRENT_TIMESTAMP
WHERE id = 1;

SELECT * FROM TIPOS_RENDAS 

-- Alteração de dados na tabela tipos_despesas
UPDATE TIPOS_DESPESAS 
SET descricao = 'Novo Tipo de Despesa',
	updated_at = CURRENT_TIMESTAMP
WHERE id = 1;

SELECT * FROM TIPOS_DESPESAS 

-- Alteração de dados na tabela rendas
UPDATE RENDAS
SET id_usuario = 2,
    id_tipo_renda = 3,
    id_recorrencia = 2,
    valor = 1500.00,
    descricao = 'Nova Descrição da Renda',
    data_recebimento = TO_DATE('2023-10-16', 'YYYY-MM-DD'),
    updated_at = CURRENT_TIMESTAMP
WHERE id = 1;

SELECT * FROM RENDAS 

-- Alteração de dados na tabela despesas
UPDATE DESPESAS 
SET id_usuario = 1,
    id_tipo_despesa = 1,
    id_recorrencia = 1,
    valor = 800.00,
    descricao = 'Nova Descrição da Despesa',
    data_vencimento = TO_DATE('2023-10-20', 'YYYY-MM-DD'),
    updated_at = CURRENT_TIMESTAMP
WHERE id = 1;

SELECT * FROM DESPESAS 

-- Alteração de dados na tabela metas
UPDATE METAS
SET id_usuario = 1,
    descricao = 'Nova Descrição da Meta',
    valor = 5000.00,
    data_conclusao_estimada = TO_DATE('2023-12-31', 'YYYY-MM-DD'),
    data_conclusao = TO_DATE('2023-11-15', 'YYYY-MM-DD'),
    status = 1,
    updated_at = CURRENT_TIMESTAMP
WHERE id = 1;

SELECT * FROM METAS 

-- Alteração de dados na tabela economia_usuarios
UPDATE ECONOMIA_USUARIOS 
SET id_usuario = 2,
    mes = TO_DATE('2023-09-01', 'YYYY-MM-DD'),
    valor = 2500.00,
    updated_at = CURRENT_TIMESTAMP
WHERE id = 1;

SELECT * FROM ECONOMIA_USUARIOS 

-- Alteração de dados na tabela corretoras
UPDATE CORRETORAS 
SET nome = 'Nova Corretora',
    bolsa = 'Nova Bolsa',
    codigo = 'NOVCOD123',
    pais = 'Novo País',
    updated_at = CURRENT_TIMESTAMP
WHERE id = 1;

SELECT * FROM CORRETORAS 

-- Alteração de dados na tabela investimentos
UPDATE INVESTIMENTOS 
SET id_usuario = 2,
    id_corretora = 1,
    ativo = 'Novo Ativo',
    valor = 3000.00,
    juros = 6.0,
    data_compra = TO_DATE('2023-08-15', 'YYYY-MM-DD'),
    data_vencimento = TO_DATE('2023-12-31', 'YYYY-MM-DD'),
    updated_at = CURRENT_TIMESTAMP
WHERE id = 1;

SELECT * FROM INVESTIMENTOS 












