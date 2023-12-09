package ma.xproce.inventoryservice.App.mapper;

import ma.xproce.inventoryservice.App.dao.entities.Video;
import ma.xproce.inventoryservice.App.dtos.VideoDto;
import org.modelmapper.ModelMapper;

public class VideoMapper {
    private ModelMapper mapper;
    public VideoMapper(){
        mapper = new ModelMapper();
    }
    public VideoDto toVideo(Video video){
        return this.mapper.map(video,VideoDto.class);
    }
    public Video fromVideoDto(VideoDto videoDto){
        return this.mapper.map(videoDto,Video.class);
    }
}
