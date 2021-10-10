package hu.iit.me.felevesfeladat;

import java.util.List;

public class EngineServiceImpl implements EngineService {
    private final int MAXIMUM_ENGINE_COUNT = 10;
    private final EngineRepository engineRepository;

    public EngineServiceImpl(EngineRepository engineRepository) {
        this.engineRepository = engineRepository;
    }

    @Override
    public List<EngineDto> findAll() {
        return engineRepository.findAll();
    }

    @Override
    public EngineDto getById(Long id) {
        return engineRepository.getById(id);
    }

    @Override
    public Long save(EngineDto articleDto) {
        if (engineRepository.findAll().size() >= MAXIMUM_ENGINE_COUNT) {
            throw new TooMuchEngineException();
        }
        return engineRepository.save(articleDto);
    }

    @Override
    public void deleteById(Long id) {
        engineRepository.deleteById(id);
    }
}
