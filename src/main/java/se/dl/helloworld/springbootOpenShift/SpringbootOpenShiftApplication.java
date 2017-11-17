package se.dl.helloworld.springbootOpenShift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootOpenShiftApplication {

	public static void main(String[] args) {
		System.out.println("DENNIS SPRING BOOT");
		SpringApplication.run(SpringbootOpenShiftApplication.class, args);
	}
}

@RestController
class HomeController {

	@GetMapping("/seb")
	public String test(){
		System.out.println("SEB");
		return"HelloWorld!";
	}
}
