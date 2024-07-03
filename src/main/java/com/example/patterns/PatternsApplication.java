package com.example.patterns;

import com.example.patterns.adapter.Info;
import com.example.patterns.adapter.UserAdapter;
import com.example.patterns.adapter.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);

		Info info = new Info("Nikita", "Ivanov", LocalDate.of(2002, 5, 9));

		UserAdapter userAdapter = new UserAdapter(info.getNome(), info.getCognome(), info.getDataDiNascita() );

		UserData userData = new UserData(userAdapter);
		System.out.println(userData.getNomeCompleto() + " " + userData.getEta());

		//---------------------------------------------//



	}

}
