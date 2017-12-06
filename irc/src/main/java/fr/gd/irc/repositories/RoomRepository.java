package fr.gd.irc.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.gd.irc.entities.Room;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "room", path = "room")
// collectionResourceRel = liens vers la table de la base "room"
// path= chemin dans l'url room

public interface RoomRepository extends PagingAndSortingRepository<Room, Integer> {

	List<Room> findByName(@Param("name") String name);
}
