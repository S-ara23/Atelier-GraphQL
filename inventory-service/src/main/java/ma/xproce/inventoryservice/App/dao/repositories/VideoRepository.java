package ma.xproce.inventoryservice.App.dao.repositories;

import ma.xproce.inventoryservice.App.dao.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
