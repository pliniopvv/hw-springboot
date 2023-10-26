## Curso Spring Boot aula 01: Iniciando uma aplicação Spring Boot

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

fonte: https://www.youtube.com/watch?v=OHn1jLHGptw&list=PL8iIphQOyG-DHLpEx1TPItqJamy08fs1D

## Curso Spring Boot aula 02: Criando as camadas MVC (Model, View e Controller)

Classes criadas:

- [X] Evento.java
- [X] EventoController.java
- [X] formEvento.html

fonte: https://www.youtube.com/watch?v=8nw7qeCr1MM&list=PL8iIphQOyG-DHLpEx1TPItqJamy08fs1D&index=2

