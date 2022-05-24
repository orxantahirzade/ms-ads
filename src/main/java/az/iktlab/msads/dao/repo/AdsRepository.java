package az.iktlab.msads.dao.repo;

import az.iktlab.msads.dao.entities.AdsEntity;
import az.iktlab.msads.model.AdsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdsRepository extends JpaRepository<AdsEntity, Long> {

    @Query(value = "select new az.iktlab.msads.model.AdsDto(id,name, description, image) from AdsEntity")
    List<AdsDto> getAllData();
}
