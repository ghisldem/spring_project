package fr.gd.irc.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.gd.irc.entities.User;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
// collectionResourceRel = liens vers la table de la base "user"
// path= chemin dans l'url user
//l'url qui permet d'accéder donc à cette entité "user" sera donc, dans le cadre d'un serveur local,
//http://localhost:8080/api/user

public interface UserRepository extends CrudRepository<User, Integer>, Serializable {

	List<User> findByName(@Param("name") String name);
}
