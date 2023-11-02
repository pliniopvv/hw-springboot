package br.com.pvv.hw.spring.fk.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class RequestExceptionHandler {
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity threat404() {
		return ResponseEntity.badRequest().body("Dado não encontrado.");
	}
}
