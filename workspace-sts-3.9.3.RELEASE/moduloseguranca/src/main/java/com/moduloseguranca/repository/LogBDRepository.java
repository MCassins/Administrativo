package com.moduloseguranca.repository;
import org.springframework.data.repository.CrudRepository;

import com.moduloseguranca.dominio.LogBD;

public interface LogBDRepository extends CrudRepository<LogBD, Integer> {
	
}
