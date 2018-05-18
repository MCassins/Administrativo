package com.moduloseguranca;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.moduloseguranca.dominio.LogErros;
import com.moduloseguranca.dominio.VersaoBuildAW;
import com.moduloseguranca.repository.LogErrosRepository;
import com.moduloseguranca.repository.VersaoBuildAWRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ModulosegurancaApplication.class)
public class VersaoBuildAWCrud {

	@Autowired
	VersaoBuildAWRepository versaobuildawrepository;
	@Test
	public void TesteCrud() {
		//Caso precise formatar para apresentar para o usuário
		//SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Date dataAtual = new Date();
		System.out.println("\n*************insert os LOGS *************");
		java.sql.Date data;
		data = new java.sql.Date(new java.util.Date().getTime());
		versaobuildawrepository.save(new VersaoBuildAW( "v1.0", data, data));
		 System.out.println("\n*************Todos os LOGS *************");
		 List<VersaoBuildAW> logs = new ArrayList<>();
		 logs = (List<VersaoBuildAW>) versaobuildawrepository.findAll();
		// for(LogErros log : logs) {
			// System.out.println(log.Usuario+" "+ log.ErroNum +" "+ log.MensagemErro);
		 //}
		 
	
	
	}
}
