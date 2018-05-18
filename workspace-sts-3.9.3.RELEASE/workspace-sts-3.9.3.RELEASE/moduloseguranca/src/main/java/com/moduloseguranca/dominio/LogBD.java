package com.moduloseguranca.dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


import javax.persistence.Id;


@Entity
@Table(name = "LogBD")
public class LogBD {


	public int getIdLogBD() {
		return IdLogBD;
	}

	public void setIdLogBD(int idLogBD) {
		IdLogBD = idLogBD;
	}

	public Date getHoraPostagem() {
		return HoraPostagem;
	}

	public void setHoraPostagem(Date horaPostagem) {
		HoraPostagem = horaPostagem;
	}

	public String getUsuarioBD() {
		return UsuarioBD;
	}

	public void setUsuarioBD(String usuarioBD) {
		UsuarioBD = usuarioBD;
	}

	public String getEvento() {
		return Evento;
	}

	public void setEvento(String evento) {
		Evento = evento;
	}

	public String getSchema() {
		return Schema;
	}

	public void setSchema(String schema) {
		Schema = schema;
	}

	public String getObjeto() {
		return Objeto;
	}

	public void setObjeto(String objeto) {
		Objeto = objeto;
	}

	public String getTSQL() {
		return TSQL;
	}

	public void setTSQL(String tSQL) {
		TSQL = tSQL;
	}

	public String getXmlEvent() {
		return XmlEvent;
	}

	public void setXmlEvent(String xmlEvent) {
		XmlEvent = xmlEvent;
	}

	

	public LogBD() {
		super();
	}
	

	public LogBD(Date horaPostagem, String usuarioBD, String evento, String schema, String objeto,
			String tSQL, String xmlEvent) {
		super();
		HoraPostagem = horaPostagem;
		UsuarioBD = usuarioBD;
		Evento = evento;
		Schema = schema;
		Objeto = objeto;
		TSQL = tSQL;
		XmlEvent = xmlEvent;
	}

	

	@Override
	public String toString() {
		return "LogBD [IdLogBD=" + IdLogBD + ", HoraPostagem=" + HoraPostagem + ", UsuarioBD=" + UsuarioBD + ", Evento="
				+ Evento + ", Schema=" + Schema + ", Objeto=" + Objeto + ", TSQL=" + TSQL + ", XmlEvent=" + XmlEvent
				+ "]";
	}



	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int IdLogBD;
	@Column
	public Date HoraPostagem;
	@Column
	public String UsuarioBD;
	@Column
	public String Evento;
	@Column(name="Schemabd")
	public String Schema;
	@Column
	public String Objeto;
	@Column
	public String TSQL;
	@Column
	public String XmlEvent;

	




}
