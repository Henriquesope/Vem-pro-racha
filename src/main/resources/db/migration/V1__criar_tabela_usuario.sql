CREATE TABLE usuario (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    criado_em DATETIME(6) NOT NULL,
    primary key (id),
    constraint uk_usuario_email UNIQUE (email)
);