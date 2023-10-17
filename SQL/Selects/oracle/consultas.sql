-- Consultar os dados de um usuário (filtrar a partir do seu código).
SELECT * FROM USUARIOS WHERE id = 1;

-- Consultar os dados de um único registro de despesa de um  usuário (filtrar a partir do código do usuário e do código da despesa).
SELECT * FROM USUARIOS  
SELECT * FROM DESPESAS 


SELECT u.id AS usuario_id, u.nome, u.email, u.data_nascimento, u.cpf, 
       d.id AS despesa_id, d.id_tipo_despesa, d.id_recorrencia, d.valor, d.descricao, d.data_vencimento
FROM USUARIOS u
INNER JOIN despesas d ON d.id_usuario = u.id
WHERE u.id = 1 AND d.id = 4;


-- Consultar os dados de todos os registros de despesas de um  usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código).
SELECT d.id AS despesa_id, d.id_tipo_despesa, d.id_recorrencia, d.valor, d.descricao, d.data_vencimento,
	   u.id AS usuario_id, u.nome, u.email, u.data_nascimento, u.cpf
       
FROM USUARIOS u
INNER JOIN despesas d ON d.id_usuario = u.id
WHERE u.id = 1 
ORDER BY d.data_vencimento DESC;

-- Consultar os dados de um único registro de investimento de um  usuário (filtrar a partir do código do usuário e do código de investimento.

SELECT u.id AS usuario_id, u.nome, u.email, u.data_nascimento, u.cpf,
       i.id AS investimento_id, i.id_corretora, i.ativo, i.valor, i.juros, i.data_compra, i.data_vencimento
FROM USUARIOS u
INNER JOIN investimentos i ON i.id_usuario = u.id
WHERE u.id = 1 AND i.id = 7; 

-- Consultar os dados de todos os registros de investimentos de um  usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código).
SELECT u.id AS usuario_id, u.nome, u.email, u.data_nascimento, u.cpf,
       i.id AS investimento_id, i.id_corretora, i.ativo, i.valor, i.juros, i.data_compra, i.data_vencimento
FROM USUARIOS u
INNER JOIN investimentos i ON i.id_usuario = u.id
WHERE u.id = 1
ORDER BY i.data_compra DESC;

-- Consultar os dados básicos de um usuário, o último investimento registrado e a última despesa registrada (filtrar a partir do código de usuário).
SELECT u.id, u.nome, u.email, MAX(i.data_compra) AS ultima_data_investimento, MAX(d.data_vencimento) AS ultima_data_despesa
FROM USUARIOS u
LEFT JOIN investimentos i ON i.id_usuario = u.id
LEFT JOIN despesas d ON d.id_usuario = u.id
WHERE u.id = 1
GROUP BY u.id, u.nome, u.email;
