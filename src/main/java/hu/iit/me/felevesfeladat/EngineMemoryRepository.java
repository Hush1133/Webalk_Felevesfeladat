package hu.iit.me.felevesfeladat;

import java.util.ArrayList;
import java.util.List;

public class EngineMemoryRepository implements EngineRepository {

    private final List<EngineDto> engines = new ArrayList<>();

    private int findArticleById(Long id) {
        int found = -1;
        for (int i = 0; i < engines.size(); i++) {
            if (engines.get(i).getCamshaft().equals(id)) {
                found = i;
                break;
            }
        }
        return found;
    }

    @Override
    public List<EngineDto> findAll() {
        return engines;
    }

    @Override
    public EngineDto getById(Long id) {
        return null;
    }

    @Override
    public Long save(EngineDto articleDto) {
        int found = findArticleById(EngineDto.getId());

        if (found != -1) {
            EngineDto foundEngine = engines.get(found);
            foundEngine.setCamshaft(EngineDto.getCamshaft());
            foundEngine.setDisplacement(EngineDto.getDisplacement());
        } else {
            engines.add(EngineDto);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        int found = findArticleById(id);

        if (found != -1) {
            engines.remove(found);
        }
    }
}
