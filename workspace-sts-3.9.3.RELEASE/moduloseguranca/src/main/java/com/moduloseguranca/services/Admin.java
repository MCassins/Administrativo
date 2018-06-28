package com.moduloseguranca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moduloseguranca.dominio.LogBD;
import com.moduloseguranca.dominio.LogErros;
import com.moduloseguranca.dominio.VersaoBuildAW;
import com.moduloseguranca.repository.LogBDRepository;
import com.moduloseguranca.repository.LogErrosRepository;
import com.moduloseguranca.repository.VersaoBuildAWRepository;

@Service
public class Admin {
	@Autowired
	public LogBDRepository lbdRepository;
	
	@Autowired
	public LogErrosRepository leRepository;
	
	@Autowired
	public VersaoBuildAWRepository vRepository;
	
	public Iterable<LogBD> listarLogBD(){
		return lbdRepository.findAll();
	}
	public Iterable<LogErros> listarLogErros(){
		return leRepository.findAll();
	}
	public Iterable<VersaoBuildAW> listarVersoes(){
		return vRepository.findAll();
	}
	
	public void salvarLogBD(LogBD logbd) {
	    	
	    	lbdRepository.save(logbd);
	    	
	}
	public void salvarLogErros(LogErros logerros) {
    	
    	leRepository.save(logerros);
    	
	}
	public void salvarVersao(VersaoBuildAW versao) {
    	
		vRepository.save(versao);
    	
	}
	
}
