-- Criação da tabela usuarios
CREATE TABLE usuarios (
    id NUMBER(10) PRIMARY KEY,
    nome VARCHAR2(60) NOT NULL,
    email VARCHAR2(120) NOT NULL,
    senha VARCHAR2(300) NOT NULL,
    data_nascimento DATE NOT NULL,
    foto VARCHAR2(600),
    cpf CHAR(11 CHAR) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT usuarios_email_cpf_unique UNIQUE (email, cpf)
);

-- Criação da tabela recorrencias
CREATE TABLE recorrencias (
    id NUMBER(10) PRIMARY KEY,
    descricao VARCHAR2(100) NOT NULL,
    juros NUMBER(10, 2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- Criação da tabela tipos_rendas
CREATE TABLE tipos_rendas (
    id NUMBER(10) PRIMARY KEY,
    descricao VARCHAR2(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- Criação da tabela tipos_despesas
CREATE TABLE tipos_despesas (
    id NUMBER(10) PRIMARY KEY,
    descricao VARCHAR2(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- Criação da tabela rendas
CREATE TABLE rendas (
    id NUMBER(10) PRIMARY KEY,
    id_usuario NUMBER(10) NOT NULL,
    id_tipo_renda NUMBER(10) NOT NULL,
    id_recorrencia NUMBER(10) NOT NULL,
    valor NUMBER(10, 2) NOT NULL,
    descricao VARCHAR2(100),
    data_recebimento DATE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT rendas_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    CONSTRAINT rendas_tipo_renda_fk FOREIGN KEY (id_tipo_renda) REFERENCES tipos_rendas(id),
    CONSTRAINT rendas_recorrencia_fk FOREIGN KEY (id_recorrencia) REFERENCES recorrencias(id)
);


-- Criação da tabela despesas
CREATE TABLE despesas (
    id NUMBER(10) PRIMARY KEY,
    id_usuario NUMBER(10) NOT NULL,
    id_tipo_despesa NUMBER(10) NOT NULL,
    id_recorrencia NUMBER(10) NOT NULL,
    valor NUMBER(10, 2) NOT NULL,
    descricao VARCHAR2(100),
    data_vencimento DATE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT despesas_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    CONSTRAINT despesas_tipo_despesa_fk FOREIGN KEY (id_tipo_despesa) REFERENCES tipos_despesas(id),
    CONSTRAINT despesas_recorrencia_fk FOREIGN KEY (id_recorrencia) REFERENCES recorrencias(id)
);

-- Criação da tabela metas
CREATE TABLE metas (
    id NUMBER(10) PRIMARY KEY,
    id_usuario NUMBER(10) NOT NULL,
    descricao VARCHAR2(100),
    valor_inical NUMBER(10, 2) NOT NULL, 
    valor_atual NUMBER(10, 2) NOT NULL, 
    valor_meta NUMBER(10, 2) NOT NULL,
    aporte NUMBER(10, 2) NOT NULL,
    icon VARCHAR(300),
    data_conclusao_estimada DATE NOT NULL,
    data_conclusao DATE,
    status NUMBER(1) DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT metas_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);


-- Criação da tabela economia_usuarios
CREATE TABLE economia_usuarios (
    id NUMBER(10) PRIMARY KEY,
    id_usuario NUMBER(10) NOT NULL,
    mes DATE NOT NULL,
    valor NUMBER(10, 2) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT economia_usuarios_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);




-- Criação da tabela corretoras
CREATE TABLE corretoras (
    id NUMBER(10) PRIMARY KEY,
    nome VARCHAR2(300) NOT NULL,
    bolsa VARCHAR2(300) NOT NULL,
    codigo VARCHAR2(200) NOT NULL,
    pais VARCHAR2(250) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- Criação da tabela investimentos
CREATE TABLE investimentos (
    id NUMBER(10) PRIMARY KEY,
    id_usuario NUMBER(10) NOT NULL,
    id_corretora NUMBER(10) NOT NULL,
    ativo VARCHAR2(300) NOT NULL,
    valor NUMBER(10, 2) NOT NULL,
    juros NUMBER(10, 2) NOT NULL,
    data_compra DATE NOT NULL,
    data_vencimento DATE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT investimentos_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    CONSTRAINT investimentos_corretora_fk FOREIGN KEY (id_corretora) REFERENCES corretoras(id)
);
