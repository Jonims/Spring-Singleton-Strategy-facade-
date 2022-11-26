package spring.springpadraoprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringPadraoProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPadraoProjetoApplication.class, args);
	}

}
