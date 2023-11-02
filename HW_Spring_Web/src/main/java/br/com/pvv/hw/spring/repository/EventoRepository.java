package br.com.pvv.hw.spring.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.pvv.hw.spring.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long>{

}
