package ma.xproce.inventoryservice.App.metier;

import ma.xproce.inventoryservice.App.dao.entities.Creator;
import ma.xproce.inventoryservice.App.dtos.CreatorDto;

public interface ICreatorService {
    Creator creatorById(Long id);
    Creator saveCreator( CreatorDto creatorDto);
}
