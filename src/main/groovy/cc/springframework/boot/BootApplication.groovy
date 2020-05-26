package cc.springframework.boot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BootApplication {

	static void main(String[] args) {
		SpringApplication.run BootApplication, args
		println "Server started..."
	}

}