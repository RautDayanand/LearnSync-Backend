package Project.LearnSync.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Project.LearnSync.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public boolean findUserByEmail(email,password);

}
