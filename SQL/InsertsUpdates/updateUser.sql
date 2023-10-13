UPDATE despesas
SET valor = 50.75, 
    descricao = 'Despesa Atualizada', 
    data_vencimento = '2023-12-20',
    updated_at = NOW()
WHERE id = 1;
