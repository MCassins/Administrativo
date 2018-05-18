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
import com.moduloseguranca.dominio.LogErros;
import com.moduloseguranca.repository.LogBDRepository;
import com.moduloseguranca.repository.LogErrosRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ModulosegurancaApplication.class)
public class LogErrosCrud {

	@Autowired
	LogErrosRepository logerrosrepository;
		
		@Test
		public void TesteCrud() {
			//Caso precise formatar para apresentar para o usuário
			//SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			//Date dataAtual = new Date();
			System.out.println("\n*************insert os LOGS *************");
			java.sql.Date data;
			data = new java.sql.Date(new java.util.Date().getTime());
			logerrosrepository.save(new LogErros(data, "usuario", 1,5,3,"procedurex ", "23","deuerro"));
			 System.out.println("\n*************Todos os LOGS *************");
			 List<LogErros> logs = new ArrayList<>();
			 logs = (List<LogErros>) logerrosrepository.findAll();
			// for(LogErros log : logs) {
				// System.out.println(log.Usuario+" "+ log.ErroNum +" "+ log.MensagemErro);
			 //}
			 
		
		
		}

}
