
-- Cria tabela telefone
create table tb_telefones (
	id BIGINT generated by default as identity,
	numero VARCHAR(20) NOT NULL,
	primary key(id)
);

-- Insere dados
INSERT INTO tb_telefones (numero) values ('51 9090-9080');

INSERT INTO tb_telefones (numero) values
('51 9090-9080'),
('51 9090-9081'),
('51 9090-9091');