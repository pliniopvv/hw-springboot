## Curso Spring Boot aula 01: Iniciando uma aplicação Spring Boot
<a href="https://www.youtube.com/watch?v=OHn1jLHGptw&list=PL8iIphQOyG-DHLpEx1TPItqJamy08fs1D">Ir para o tutorial</a>

Foi criado, apenas a classe abaixo, nesta aula.

```java
@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}

```

## Curso Spring Boot aula 02: Criando as camadas MVC (Model, View e Controller)
<a href="https://www.youtube.com/watch?v=8nw7qeCr1MM&list=PL8iIphQOyG-DHLpEx1TPItqJamy08fs1D&index=2">Ir para o tutorial</a>

Classes criadas:

- :white_check_mark: Evento.java
- :white_check_mark: EventoController.java
- :white_check_mark: formEvento.html

## Curso Spring Boot aula 03: Criando e configurando um banco de dados MySQL
<a href="https://www.youtube.com/watch?v=FHRYijYhJYA&list=PL8iIphQOyG-DHLpEx1TPItqJamy08fs1D&index=3">Ir para o tutorial</a>

Banco de dados trocado do MySQL para o H2 Database conforme documentação auxiliar do H2 Database. [aqui](https://www.geeksforgeeks.org/spring-boot-h2-database/).

Adicionado as dependências:

- :white_check_mark: Spring Boot – H2 Database

## Curso Spring Boot aula 04: Salvando dados do formulário no banco de dados
[Ir para o tutorial](https://www.youtube.com/watch?v=miN5ygzFhtI)

- Criação da classe `EventoRepository` extendida da `CrudRepository` do Spring JPA;
- :white_check_mark: Recebendo entidade JPA `Evento` via formulário do método POST.

## Curso Spring Boot aula 05: Realizando buscas no banco de dados MySQL
[Ir para o tutorial](https://www.youtube.com/watch?v=1hMDBrvGpEY)

- Atualização do arquivo template `index`
- Adição de `th:each="evento : ${eventos}"` em tag div e configuração no método.

## Live Coding: CRUD com Java Spring - Aprendendo na prática
[Ir para o tutorial](https://www.youtube.com/watch?v=tP6wtEaCnSI&t=408s)

Código refatorado com as exigências para a realização do conteúdo do tutorial informado.
- Arquivos no pacote `fk` de Fernada Kipper
-- Criado entidade `Product`, controlador de ORM e API REST.
- implementado `@PostMapping`
- implementado `@GetMapping`
- iniciado `@PutMapping`

## Live Coding: Continuação API REST com Java Spring
[Ir para continuação](https://www.youtube.com/watch?v=HanaSiIlMVY)

... Refatoração continuará no package `fk`
- Explicado sobre a tag `@Transactional` 14:38.
- corrigido erro no `@PutMapping`
- criação do método `findAllByActiveTrue` no repositório `ProductRepository`
- implementado `@DeleteMapping`

## Uploading Files
[Ir para tutorial](https://spring.io/guides/gs/uploading-files/)

- Os endereços mapeados no root `/` foram redirecionados para `/springUpload` para evitar conflito com os outros tutoriais executados anteriormente neste projeto.

