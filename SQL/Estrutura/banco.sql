CREATE DATABASE fintech

USE fintech

CREATE TABLE usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(60) NOT NULL,
    email VARCHAR(120) NOT NULL,
    senha VARCHAR(300) NOT NULL,
    data_nascimento DATE NOT NULL,
    foto VARCHAR(600),
    cpf VARCHAR(11) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    UNIQUE (email, cpf)
)

CREATE TABLE recorencias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(100) NOT NULL,
    juros FLOAT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)

CREATE TABLE tipos_rendas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)

CREATE TABLE tipos_despesas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)

CREATE TABLE rendas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    id_tipo_renda INT NOT NULL,
    id_recorencia INT NOT NULL,
    valor FLOAT NOT NULL,
    descricao VARCHAR(100),
    data_recebimento DATE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_tipo_renda) REFERENCES tipos_rendas(id),
    FOREIGN KEY (id_recorencia) REFERENCES recorencias(id)
)

CREATE TABLE despesas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    id_tipo_despesa INT NOT NULL,
    id_recorencia INT NOT NULL,
    valor FLOAT NOT NULL,
    descricao VARCHAR(100),
    data_vencimento DATE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_tipo_despesa) REFERENCES tipos_despesas(id),
    FOREIGN KEY (id_recorencia) REFERENCES recorencias(id)
)

CREATE TABLE metas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    descricao VARCHAR(100),
    valor FLOAT NOT NULL,
    data_conclusao_estimada DATE NOT NULL,
    data_conclusao DATE NOT NULL,
    status SMALLINT DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
)

CREATE TABLE economia_usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    mes DATE NOT NULL,
    valor FLOAT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
)


CREATE TABLE corretoras (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(300) NOT NULL,
    bolsa VARCHAR(300) NOT NULL,
    codigo VARCHAR(200) NOT NULL,
    pais VARCHAR(250) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)
 

CREATE TABLE investimentos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    id_corretora INT NOT NULL,
    ativo VARCHAR(300) NOT NULL,
    valor DOUBLE NOT NULL,
    juros DOUBLE NOT NULL,
    data_compra DATE NOT NULL,
    data_vencimento DATE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_corretora) REFERENCES corretoras(id)
)