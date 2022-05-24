package az.iktlab.msads.service;

import az.iktlab.msads.dao.entities.AdsEntity;
import az.iktlab.msads.dao.repo.AdsRepository;
import az.iktlab.msads.model.AdsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdsService {

    private final AdsRepository adsRepository;

    public AdsService(AdsRepository adsRepository) {
        this.adsRepository = adsRepository;
    }

    public void add(AdsDto adsDto) {

        System.out.println(adsDto);

        AdsEntity adsEntity = new AdsEntity();
        adsEntity.setDescription(adsDto.getDescription());
        adsEntity.setImage(adsDto.getImage());
        adsEntity.setName(adsDto.getName());

        adsRepository.save(adsEntity);
    }

    public List<AdsDto> getAll() {
        return adsRepository.getAllData();
    }

}
