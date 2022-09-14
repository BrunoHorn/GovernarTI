### Upload de Arquivos CSV

### ?? Sobre o projeto
Upload de arquivos CSVs e consultas de pilotos e corridas

### ?? Funcionalidades

- [x] GET drivers/upload-csv:
  - [x] Adicionar Todos os arquivos csvs no banco de dados;
- [x] GET drivers/winning;
  - [x] Pilotos que já venceram ao menos 1 corrida
- [x] GET drivers/nationalities/wins;
  - [x] Lista de todas as nacionalidades, em ordem decrescente de vitórias

### ?? Técnologias e padrão utilizadas

- Arquitetura padrão MVC;
- Spring Data;
- Java 11;
- Maven;
- Docker;
- Flyway;
- Postgres;
- Lombok;

### ?? Rodando a aplicação

#### Requisitos
Adicionar os arquivos CSVs em uma pasta com o caminho "C:\governarti"

#### Clonar o repositório do projeto

```sh
git clone 
```
Importar o projeto na IDE de sua preferência.

#### Dentro do diretório do projeto, buildar com o Maven
```sh
mvn clean install
```

O projeto baixará as dependências necessárias e buildará com sucesso. Caso não complete com sucesso, verifique o log do build para encontrar possíveis erros.

#### Configurar o DB Postgres localmente com o Docker
Com o terminal dentro do diretório do projeto, executar o docker-compose abaixo
```sh
docker-compose up
```

Conectar-se ao DB com o manager de sua preferência. O usuário e senha do DB podem ser consultados no arquivo application.yml
   