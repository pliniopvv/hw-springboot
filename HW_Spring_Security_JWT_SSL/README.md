## Spring Security + SSL/JWT

[Tutorial](https://www.youtube.com/watch?v=kEJ8a1w4a2Q)

---

Teste de login via CURL na rota `/authenticate`:

```powershell
curl -X POST -u username:password localhost:8080/authenticate
```

Esta rota retornará um Token JWT, que deverá ser utilizado para acessar a rota `/private`:

```powershell
SET JWK=(token)
curl -H "Authorization: Bearer %JWK%" localhost:8080/private
```