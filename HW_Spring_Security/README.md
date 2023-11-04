## Autenticação e Autorização com Spring Security e JWT Tokens
[Ir para tutorial](https://www.youtube.com/watch?v=5w-YCcOjPD0&t=112s)

Tutorial de introdução ao Spring Security aplicado ao Spring Web.

- O arquivo `import.sql` ( e o `data.sql` ) é executado pelo Spring Data JPA no boot da aplicação.
A diferença entre os dois é que o import.sql é executado após a criação das tabelas pelo JPA.
- Criado o objeto `User` que implementa a interface `UserDetails` do Spring Security, classe responsável pela autenticação do usuário logado.
- As alterações realizadas pelo tutorial aos `32:15` apresentaram problemas e bugs que presicam ser analizados para correção, porém sabe-se que as mudanças realizadas na clase `SecurityConfiguration.java` não ocorreram conforme demonstrado.