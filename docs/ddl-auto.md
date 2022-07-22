# DDL AUTO

Como o Hibernate se comporta em relação às entidades na inicialização.

## Propriedade

spring.jpa.hibernate.ddl-auto

## Opções

### create-drop

- Por padrão em bancos embutidos com o H2
- Altera o banco de fato

### none

- Por padrão em todos os outros bancos como o ORACLE/POSTGRE/MARIABD
- Não faz nenhuma verificação ou modificação no banco

### validate

- Somente verifica se o mapeamento das entidades está de acordo com o banco

### update

- Verifica se o mapeamento das entidades está de acordo com o banco
- Aplica mudanças no banco de acordo com as entidades (cria tabelas e colunas necessárias)

