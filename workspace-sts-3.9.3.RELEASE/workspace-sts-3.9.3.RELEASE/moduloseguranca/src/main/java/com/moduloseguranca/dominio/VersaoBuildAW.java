package com.moduloseguranca.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



//import org.springframework.data.annotation.Id;



@Entity
@Table(name = "VersaobuildAW")
public class VersaoBuildAW {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int IDInfoSistema;
	@Column
	String VersaoBD;
	@Column
	Date DataVersao;
	@Column
	Date DataModificacao;
	public VersaoBuildAW(String versaoBD, Date dataVersao, Date dataModificacao) {
		super();
		VersaoBD = versaoBD;
		DataVersao = dataVersao;
		DataModificacao = dataModificacao;
	}
	public VersaoBuildAW() {
		super();
		
	}
	
}
