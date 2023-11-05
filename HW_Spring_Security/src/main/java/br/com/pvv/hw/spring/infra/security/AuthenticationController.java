package br.com.pvv.hw.spring.infra.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pvv.hw.spring.domain.user.User;
import br.com.pvv.hw.spring.domain.user.UserRepository;
import br.com.pvv.hw.spring.domain.user.UserRole;
import jakarta.validation.Valid;

@RestController
@RequestMapping("auth")
public class AuthenticationController {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private TokenService tokenService;
	
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data) {
		var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
		var auth = this.authenticationManager.authenticate(usernamePassword);
		
		var token = tokenService.generateToken((User) auth.getPrincipal());
		
		return ResponseEntity.ok(new LoginResponseDTO(token));
	}
	
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody @Valid RegisterDTO data) {
		if (this.repository.findByLogin(data.login()) != null) return ResponseEntity.badRequest().build();
		
		String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
		
		System.out.println("#########"+encryptedPassword+"#########");
		
		UserRole uR = data.role().equals("ADMIN") ? UserRole.ADMIN : UserRole.USER;
		
		User nU = new User(data.login(), encryptedPassword, uR);
		
		this.repository.save(nU);
		return ResponseEntity.ok().build();
	}
}
