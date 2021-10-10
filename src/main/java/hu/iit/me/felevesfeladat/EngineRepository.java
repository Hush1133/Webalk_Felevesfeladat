package hu.iit.me.felevesfeladat;


import java.util.List;

public interface EngineRepository {
    List<EngineDto> findAll();
    EngineDto getById(Long id);
    Long save(EngineDto articleDto);
    void deleteById(Long id);
}
