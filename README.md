# boletim-epidemiologico-java
:space_invader: Um sistema para registro de boletim epidemiológico desenvolvido em Java.

## :rocket: Tecnologias utilizadas  

O projeto foi feito utilizando as seguintes tecnologias:

- [Java 8](https://www.java.com/pt_BR/download/faq/java8.xml)
- [Java Swing](https://docs.oracle.com/javase/tutorial/uiswing/)
- [MySQL 5](https://www.mysql.com/)
- [JasperReports](https://community.jaspersoft.com/project/jasperreports-library)
{...}

## :clipboard: Pré-requisitos

- [Java 7](https://www.java.com/pt_BR/download/faq/release7_changes.xml)
- [Java 8](https://www.java.com/pt_BR/download/faq/java8.xml)
- [MySQL 5](https://www.mysql.com/)
- [iReport 5.6](https://community.jaspersoft.com/project/ireport-designer)

## :floppy_disk: Script para criação do banco de dados

```
CREATE DATABASE db_boletim;

USE db_boletim;

CREATE TABLE tb_profissional (
  id int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(250) NOT NULL,
  matricula int(11) NOT NULL,
  cargo varchar(250) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE tb_usuario (
  id int(11) NOT NULL AUTO_INCREMENT,
  email varchar(250) NOT NULL,
  senha varchar(50) NOT NULL,
  profissional_id int(11) NOT NULL,
  FOREIGN KEY (profissional_id) REFERENCES tb_profissional(id),
  PRIMARY KEY (id)
);

CREATE TABLE tb_paciente (
  id int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(250) NOT NULL,
  cpf varchar(14) NOT NULL,
  telefone varchar(15) NOT NULL,
  email varchar(250) NOT NULL,
  endereco varchar(250) NOT NULL,
  status varchar(50) NOT NULL,
  quarentena tinyint(1) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE tb_boletim (
  id int(11) NOT NULL AUTO_INCREMENT,
  suspeitos int(11) NOT NULL,
  confirmados int(11) NOT NULL,
  descartados int(11) NOT NULL,
  obitos int(11) NOT NULL,
  recuperados int(11) NOT NULL,
  PRIMARY KEY (id)
);
```

## :fire: Instalação e execução
Execute a classe `Executavel` localizada em `src/br/com/executable/Executavel.java`

## :page_facing_up: Licença 
Este projeto é desenvolvido sob a licença MIT. Veja o arquivo [LICENSE](LICENSE.md) para saber mais detalhes.

<p align="center" style="margin-top: 20px; border-top: 1px solid #eee; padding-top: 20px;">Feito com :brown_heart: por <strong> Carlos Henrique da Costa Silva </strong> </p>
