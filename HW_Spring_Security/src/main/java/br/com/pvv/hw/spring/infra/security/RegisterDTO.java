package br.com.pvv.hw.spring.infra.security;

import br.com.pvv.hw.spring.domain.user.UserRole;

public record RegisterDTO(String login, String password, String role) {

}
