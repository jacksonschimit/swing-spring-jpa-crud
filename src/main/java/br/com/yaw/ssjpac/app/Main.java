package br.com.yaw.ssjpac.app;


import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
Escreva aqui os comentários técnicos
 */
public class Main {
	
	public static void main(String[] args) {
            
            String teste = "123";
		Locale.setDefault(new Locale("pt","BR"));
		new ClassPathXmlApplicationContext("META-INF/spring-config.xml");
	}

}
