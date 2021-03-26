package br.com.alura.leilao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeilaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeilaoApplication.class, args1); //trocando args por arg para provocar erro e enviar msg de email notificando pelo jenkins
		//comentario qq para fazer commit e provocar o build no jenkins
	}

}
