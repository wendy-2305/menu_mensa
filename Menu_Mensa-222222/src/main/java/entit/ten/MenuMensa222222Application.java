package entit.ten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class MenuMensa222222Application implements CommandLineRunner{

	@Autowired
	private Menu_Repository menuRepository;

	public static void main(String[] args) {
		SpringApplication.run(MenuMensa222222Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		menuRepository.save(new Menu(1L,"Pasta","Pasta", 2.5));
		menuRepository.save(new Menu(2L,"maccaroni","Mccaroni and cheese", 3.0));
		menuRepository.save(new Menu(3L,"pizza","Pizza",4.00));
		menuRepository.save(new Menu(4L,"burger","Bürger",6.00));
		menuRepository.save(new Menu(5L,"Fisch","Fisch",8.00));
		menuRepository.save(new Menu(6L,"Schwein","schwein",4.00));
		menuRepository.save(new Menu(7L,"gulasch-vom-kalb-mit-spaetzle","Rindf",9.70));
		menuRepository.save(new Menu(8L,"salat","salat",7.00));
		menuRepository.save(new Menu(9L,"Vegaan burger","Bürger",12.00));
		menuRepository.save(new Menu(10L,"Reis","tomatenreis",10.00));
		
		
		for (Menu menu : menuRepository.findAll()) {
			System.out.println(menu.toString());
		}
		
	}











}
