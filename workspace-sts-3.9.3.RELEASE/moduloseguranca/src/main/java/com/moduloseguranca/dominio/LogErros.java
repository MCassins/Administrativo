package com.moduloseguranca.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "logerros")
public class LogErros {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int IDlogErro;
	@Column
	Date Hora;
	@Column
	String Usuario;
	@Column
	int ErroNum;
	@Column
	int ErrorSeverity;
	
	@Column
	int ErrorState;
	@Column
	String ErrorProcedure;
	@Column
	String LinhaErro;
	@Column
	String MensagemErro;
	public LogErros(Date hora, String usuario, int erroNum, int errorSeverity, int errorState, String errorProcedure,
			String linhaErro, String mensagemErro) {
		super();
		Hora = hora;
		Usuario = usuario;
		ErroNum = erroNum;
		ErrorSeverity = errorSeverity;
		ErrorState = errorState;
		ErrorProcedure = errorProcedure;
		LinhaErro = linhaErro;
		MensagemErro = mensagemErro;
	}
	public LogErros() {
		super();
	}
	@Override
	public String toString() {
		return "LogErros [IDlogErro=" + IDlogErro + ", Hora=" + Hora + ", Usuario=" + Usuario + ", ErroNum=" + ErroNum
				+ ", ErrorSeverity=" + ErrorSeverity + ", ErrorState=" + ErrorState + ", ErrorProcedure="
				+ ErrorProcedure + ", LinhaErro=" + LinhaErro + ", MensagemErro=" + MensagemErro + "]";
	}
	
}
