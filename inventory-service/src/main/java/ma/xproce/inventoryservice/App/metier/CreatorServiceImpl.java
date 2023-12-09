package ma.xproce.inventoryservice.App.metier;

import ma.xproce.inventoryservice.App.dao.entities.Creator;
import ma.xproce.inventoryservice.App.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.App.dtos.CreatorDto;
import ma.xproce.inventoryservice.App.mapper.CreatorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatorServiceImpl implements ICreatorService{
    @Autowired
    CreatorMapper creatorMapper ;
    @Autowired
    CreatorRepository creatorRepository;


    @Override
    public Creator creatorById(Long id) {
        return creatorRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)));
    }

    @Override
    public Creator saveCreator(CreatorDto creatorDto) {
        System.out.println(creatorDto);
        return creatorRepository.save(creatorMapper.fromCreatorDtoToCreator(creatorDto));
    }
}
