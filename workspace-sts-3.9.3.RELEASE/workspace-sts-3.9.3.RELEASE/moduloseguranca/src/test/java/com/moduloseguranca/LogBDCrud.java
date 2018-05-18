package com.moduloseguranca;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.moduloseguranca.dominio.LogBD;
import com.moduloseguranca.repository.LogBDRepository;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=ModulosegurancaApplication.class)
public class LogBDCrud {

	@Autowired
	LogBDRepository logbdRepository;
		
		@Test
		public void TesteCrud() {
			//Caso precise formatar para apresentar para o usuário
			//SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			//Date dataAtual = new Date();
			System.out.println("\n*************insert os LOGS *************");
			java.sql.Date data;
			data = new java.sql.Date(new java.util.Date().getTime());
			logbdRepository.save(new LogBD(data, "johnny", "insert", "Schmo", "faturamento","CONSULTA, ", "<xml> </xml>" ));
			 System.out.println("\n*************Todos os LOGS *************");
			 List<LogBD> logs = new ArrayList<>();
			 logs = (List<LogBD>) logbdRepository.findAll();
			 for(LogBD log : logs) {
				 System.out.println(log.Evento +" "+ log.IdLogBD +" "+ log.HoraPostagem);
			 }
			 
		
		
		}
		

}
