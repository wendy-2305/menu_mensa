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
		menuRepository.save(new Menu(1L,"Pasta","image1", 2.5));
		menuRepository.save(new Menu(2L,"macaroni","image2", 3.0));
		menuRepository.save(new Menu(3L,"pizza","image3",4.00));
		menuRepository.save(new Menu(4L,"burger","image4",4.00));
		
		
		for (Menu menu : menuRepository.findAll()) {
			System.out.println(menu.toString());
		}
		
	}











}
