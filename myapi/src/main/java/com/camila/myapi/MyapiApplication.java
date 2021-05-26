package com.camila.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.camila.myapi.domain.Usuario;
import com.camila.myapi.repositories.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
		System.out.println("Executando...");
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Camila Coutinho", "camila", "1234");
		Usuario u2 = new Usuario(null, "Amanda Alves", "amanda", "1234");
		Usuario u3 = new Usuario(null, "Deborah Caroline", "deborah", "1234");
		Usuario u4 = new Usuario(null, "Mayara Leme", "mayara", "1234");
		Usuario u5 = new Usuario(null, "Taiane Barbosa", "taiane", "1234");
		Usuario u6 = new Usuario(null, "Thaila Davanço", "thaila", "1234");

		usuarioRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6));
	}

}
