package br.com.satty.writeam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
public class WriteamApplication {

	public static void main(String[] args) {
		SpringApplication.run(WriteamApplication.class, args);
	}

}
