-- Alteração de dados na tabela usuarios
UPDATE usuarios
SET nome = 'Novo Nome',
    email = 'novoemail@example.com',
    senha = 'novasenha',
    data_nascimento = '1990-01-01',
    foto = 'novocaminho/para/foto.jpg',
    cpf = '12345678901'
WHERE id = 1;

-- Alteração de dados na tabela recorrencias
UPDATE recorrencias
SET descricao = 'Nova Descrição',
    juros = 5.5
WHERE id = 1;


-- Alteração de dados na tabela tipos_rendas
UPDATE tipos_rendas
SET descricao = 'Novo Tipo de Renda'
WHERE id = 1;


-- Alteração de dados na tabela tipos_despesas
UPDATE tipos_despesas
SET descricao = 'Novo Tipo de Despesa'
WHERE id = 1;


-- Alteração de dados na tabela rendas
UPDATE rendas
SET id_usuario = 2,
    id_tipo_renda = 3,
    id_recorencia = 2,
    valor = 1500.00,
    descricao = 'Nova Descrição da Renda',
    data_recebimento = '2023-10-16'
WHERE id = 1;


-- Alteração de dados na tabela despesas
UPDATE despesas
SET id_usuario = 2,
    id_tipo_despesa = 3,
    id_recorencia = 2,
    valor = 800.00,
    descricao = 'Nova Descrição da Despesa',
    data_vencimento = '2023-10-20'
WHERE id = 1;


-- Alteração de dados na tabela metas
UPDATE metas
SET id_usuario = 2,
    descricao = 'Nova Descrição da Meta',
    valor = 5000.00,
    data_conclusao_estimada = '2023-12-31',
    data_conclusao = '2023-11-15',
    status = 1
WHERE id = 1;


-- Alteração de dados na tabela economia_usuarios
UPDATE economia_usuarios
SET id_usuario = 2,
    mes = '2023-09-01',
    valor = 2500.00
WHERE id = 1;


-- Alteração de dados na tabela corretoras
UPDATE corretoras
SET nome = 'Nova Corretora',
    bolsa = 'Nova Bolsa',
    codigo = 'NOVCOD123',
    pais = 'Novo País'
WHERE id = 1;


-- Alteração de dados na tabela investimentos
UPDATE investimentos
SET id_usuario = 2,
    id_corretora = 3,
    ativo = 'Novo Ativo',
    valor = 3000.00,
    juros = 6.0,
    data_compra = '2023-08-15',
    data_vencimento = '2023-12-31'
WHERE id = 1;












