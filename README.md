<div align=center>
    <a><img width="350" alt="Logo" src="https://user-images.githubusercontent.com/60848932/119583549-3adcdc00-bd9d-11eb-962b-85e4a0b89f7f.png"></a>

<br>

# Spring-Boot-Minha-Primeira-API-REST
 
Projeto desenvolvido para entender a estrutura de um projeto java com spring boot e a criação de uma api com get, post, put e delete. 

</div><br>

### Com esse projeto e possivel:
- Consultar um usuario por id;
- Consultar a lista de usuarios;
- Criar um usuario;
- Atualizar um usuario;
- Deletar um usuario;


![image](https://user-images.githubusercontent.com/60848932/119597549-a9c72e80-bdb7-11eb-92e8-481858050c74.png)


<br>

### Foi ultizado nesse projeto:
- Java: 11
- Maven: 3.8
- Banco de dados: H2
- Teste da API: Postman

<br>

### Para rodar o projeto:

- Clone o repositório:
```bash
$ git clone https://github.com/caamilacgs/api-restful-com-spring-boot
```
- Entre dentro da pasta:
```bash
$ cd api-restful-com-spring-boot
```

<br>

- Acesse o projeto por uma IDE de sua preferência: INTELIJ, ECLIPSE, VSCODE etc.
- Consulte o arquivo aplication.properties para definir as configurações de acesso local ao banco.
- Para compilar o projeto vá até a pasta onde se encontra o arquivo `pom.xml` e execute no terminal o comando: `mvn clean install`
- Se o resultado do build for `BUILD SUCCESS`, rode o projeto usando: `mvn exec:java`
- Logo após, abra o seu navegador e acesse a pagina inicial: `http://localhost:8080/`
- Para Conectar no banco acesso o caminho: http://localhost:8080/h2
- Informe os dados de login definidos no arquivo application.properties
- Link da collection do postman para importar: https://www.getpostman.com/collections/e67968ed9c4bde3ddb19

<br>


<br>

