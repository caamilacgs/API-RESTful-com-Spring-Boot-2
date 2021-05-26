# Spring-Boot-Minha-Primeira-API-REST
 
Projeto desenvolvido para entender a estrutura de um projeto java com spring boot e a criação de uma api com get, post, put e delete. 

### Com esse projeto e possivel:
- Consultar um usuario por id;
- Consultar a lista de usuarios;
- Atualizar um usuario;
- Deletar um usuario;

### Foi ultizado nesse projeto:
- Java: 11
- Maven: 3.8
- Banco de dados: H2
- Teste da API: Postman

### Para rodar o projeto:

- Clone o repositório:
```bash
$ git clone https://github.com/caamilacgs/API-RESTful-com-Spring-Boot-2
```
- Entre dentro da pasta:
```bash
$ cd API-RESTful-com-Spring-Boot-2
```
- Acesse o projeto por uma IDE de sua preferência: INTELIJ, ECLIPSE, VSCODE etc.
- Consulte o arquivo aplication.properties para definir as configurações de acesso local ao banco.
- Para compilar o projeto vá até a pasta onde se encontra o arquivo `pom.xml` e execute no terminal o comando: `mvn clean install`
- Se o resultado do build for `BUILD SUCCESS`, rode o projeto usando: `mvn exec:java`
- Logo após, abra o seu navegador e acesse a pagina inicial: `http://localhost:8080/`
- Para Conectar no banco acesso o caminho: http://localhost:8080/h2
- Informe os dados de login definidos no arquivo application.properties
