SELECT * FROM users

SELECT u.nome, u.email, u.data_nascimento, u.cpf, 
       i.data_compra as 'Data Compra Investimento', i.valor as 'Valor Investimento', i.juros as 'Juros Investimento',
       d.valor as 'Valor Despesa', d.data_vencimento as 'Data Vencimento Despesa'
FROM usuarios u
INNER JOIN investimentos i ON u.id = i.id_usuario
INNER JOIN despesas d ON u.id = d.id_usuario
WHERE u.id = 1
ORDER BY i.id DESC, d.id DESC
LIMIT 1;