INSERT INTO tab_endereco (id, bairro, cep, cidade, complemento, estado, logradouro, numero ) VALUES (1, 'JD Lucelia','04865-322','São Paulo','Casa','São Paulo','Av. Paulista','100');
INSERT INTO tab_endereco (id, bairro, cep, cidade, complemento, estado, logradouro, numero ) VALUES (2, 'JD Noronha','04865-000','São Paulo','Casa','São Paulo','Av. Vergueiro','100');

INSERT INTO tab_contato (id, comercial, email, fax, movel, obs, residencial, site) VALUES (1,'11 5999-0000','comercial@comercial.com','11 5999-0000','11 99999-0000','Horário comercial','11 5999-0000','www.aa.com.br');
INSERT INTO tab_contato (id, comercial, email, fax, movel, obs, residencial, site) VALUES (2,'11 5900-0000','casa@casa.com','11 5999-0000','11 99999-0000','Horário comercial','11 5999-0000','www.a.com');

INSERT INTO tab_pessoa (id_pessoa, cpf, data_nasc, nome, rg, sexo, contato_id, endereco_id) VALUES (1, '610.568.181-07', '1990-02-02', 'Daniel Santos', '48.303.999-5', 'Masculino', 1, 1);
INSERT INTO tab_pessoa (id_pessoa, cpf, data_nasc, nome, rg, sexo, contato_id, endereco_id) VALUES (2, '557.736.336-55', '1992-03-02', 'João Fernando', '40.300.900-5', 'Masculino', 2, 2);
