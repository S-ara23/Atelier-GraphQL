package ma.xproce.inventoryservice.App.metier;

import ma.xproce.inventoryservice.App.dao.entities.Video;

import java.util.List;

public interface IVideoService {
    Video save(Video video);
    List<Video> videoList();
}
