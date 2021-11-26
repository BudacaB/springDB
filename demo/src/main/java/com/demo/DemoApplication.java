package com.demo;

import com.demo.bank.Bank;
import com.demo.bank.DBBank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Bank dbBank = new DBBank();
		PaymentService paymentService = new PaymentService(dbBank);
		paymentService.checkCard("asss");
		paymentService.checkCard("asssdsdsd");
	}

}
