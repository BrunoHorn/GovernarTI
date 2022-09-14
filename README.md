### Upload de Arquivos CSV

### ?? Sobre o projeto
Upload de arquivos CSVs e consultas de pilotos e corridas

### ?? Funcionalidades

- [x] GET drivers/upload-csv:
  - [x] Adicionar Todos os arquivos csvs no banco de dados;
- [x] GET drivers/winning;
  - [x] Pilotos que j� venceram ao menos 1 corrida
- [x] GET drivers/nationalities/wins;
  - [x] Lista de todas as nacionalidades, em ordem decrescente de vit�rias

### ?? T�cnologias e padr�o utilizadas

- Arquitetura padr�o MVC;
- Spring Data;
- Java 11;
- Maven;
- Docker;
- Flyway;
- Postgres;
- Lombok;

### ?? Rodando a aplica��o

#### Requisitos
Adicionar os arquivos CSVs em uma pasta com o caminho "C:\governarti"

#### Clonar o reposit�rio do projeto

```sh
git clone 
```
Importar o projeto na IDE de sua prefer�ncia.

#### Dentro do diret�rio do projeto, buildar com o Maven
```sh
mvn clean install
```

O projeto baixar� as depend�ncias necess�rias e buildar� com sucesso. Caso n�o complete com sucesso, verifique o log do build para encontrar poss�veis erros.

#### Configurar o DB Postgres localmente com o Docker
Com o terminal dentro do diret�rio do projeto, executar o docker-compose abaixo
```sh
docker-compose up
```

Conectar-se ao DB com o manager de sua prefer�ncia. O usu�rio e senha do DB podem ser consultados no arquivo application.yml
   