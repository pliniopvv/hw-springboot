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

