package ma.xproce.inventoryservice.App.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Collection;
@Builder
@Data @Entity @AllArgsConstructor @NoArgsConstructor
public class Creator {
    @jakarta.persistence.Id
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "creator",fetch=FetchType.LAZY)
    private Collection<Video> video;



}
