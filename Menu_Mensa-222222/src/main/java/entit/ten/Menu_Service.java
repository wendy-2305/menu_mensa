package entit.ten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
	@RequestMapping("/api")
	public class Menu_Service {
		
		@Autowired
		private Menu_Repository menuRepository;
		
		
		@GetMapping(path = "/menu" , produces = {MediaType.APPLICATION_JSON_VALUE})
		public List<Menu> getMenu() {
			return menuRepository.findAll();
		}
		
		@GetMapping(path = "/Menu/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
		public Menu getOneUbung(@PathVariable(value = "id") Long id) {
			return menuRepository.findById(id).get();
		}
		
		@GetMapping(path = "/Menu/getName/{name}", produces = {MediaType.APPLICATION_JSON_VALUE})
		public Menu getOneMenu(@PathVariable(value = "name") String name) {
			return menuRepository.findByName(name);
		}
		
		@PostMapping(path = "/menu", produces = {MediaType.APPLICATION_JSON_VALUE})
		public Menu save(@RequestBody Menu menu) {
			return menuRepository.save(menu);
		}
		
		@PutMapping(path = "/menu/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
		public Menu save(@RequestBody Menu menu, @PathVariable(value = "id") Long id) {
			menu.setId(id);
			return menuRepository.save(menu);
		}
		
		@DeleteMapping(path = "/menu/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
		public boolean delete(@PathVariable Long id) {
			
			try {
				menuRepository.deleteById(id);
				return true;
				
			}catch (Exception e) {
				return false;
			}
		}
		
	}
