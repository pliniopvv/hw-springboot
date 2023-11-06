## Autenticação e Autorização com Spring Security e JWT Tokens
[Ir para tutorial](https://www.youtube.com/watch?v=5w-YCcOjPD0&t=112s)

Tutorial de introdução ao Spring Security aplicado ao Spring Web.

Observações relevantes:

- O arquivo `import.sql` ( e o `data.sql` ) é executado pelo Spring Data JPA no boot da aplicação.
A diferença entre os dois é que o import.sql é executado após a criação das tabelas pelo JPA.
- Criado o objeto `User` que implementa a interface `UserDetails` do Spring Security, classe responsável pela autenticação do usuário logado.
- As alterações realizadas pelo tutorial aos `32:15` apresentaram problemas e bugs que presicam ser analizados para correção, porém sabe-se que as mudanças realizadas na clase `SecurityConfiguration.java` não ocorreram conforme demonstrado.
- Problema acima resolvido através da utilização da classe `AntPathRequestMatcher` conforme sugestão contida no próprio erro lançado.
- O endpoint de login é realizado pela classe `AuthenticationController`

Para liberar o acesso ao `/h2-console` foi necessária a liberação da rota no método `securityFilterChain`, além da adição do seguinte comando: `.headers(headers -> headers.frameOptions().disable())` que desabilita a proteção do frame;