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

Banco de dados trocado do MySQL para o H2 Database conforme documentação oficial do H2DB.

Adicionado as dependências:

- :white_check_mark: Spring Boot – H2 Database




