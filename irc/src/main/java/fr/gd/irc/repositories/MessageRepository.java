package fr.gd.irc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.gd.irc.entities.Message;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "message", path = "message")
// collectionResourceRel = liens vers la table de la base "message"
// path= chemin dans l'url /message

// interface de type DAO appelé ici repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
	// Le Message le integer correspond à la primary key
	List<Message> findByText(@Param("text") String text);

}
