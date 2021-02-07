package entit.ten;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Menu_Repository extends JpaRepository<Menu,Long>{
	
	public Menu findByName(String name);
	
	

}

