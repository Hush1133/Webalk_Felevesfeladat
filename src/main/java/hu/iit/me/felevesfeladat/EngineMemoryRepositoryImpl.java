package hu.iit.me.felevesfeladat;


import hu.iit.me.felevesfeladat.EngineDto;
import hu.iit.me.felevesfeladat.EngineRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

    @Component
    public class EngineMemoryRepositoryImpl implements EngineRepository {
        private final List<EngineDto> engine=new ArrayList<>();

        private int findCarById(Long id) {
            int found = -1;
            for (int i = 0; i < engine.size(); i++) {
                if (engine.get(i).getId()==id) {
                    found = i;
                    break;
                }
            }
            return found;
        }

        @Override
        public List<EngineDto> findAll() {
            return null;
        }

        @Override
        public EngineDto getById(Long id) {
            return null;
        }

        @Override
        public Long save(EngineDto EngineDto) {
            int found = findCarById(EngineDto.getId());

            if (found == -1) {
                engine.add(EngineDto);

            } else {
                EngineDto foundCar = engine.get(found);
                foundCar.setCamshaft(EngineDto.getCamshaft());
                foundCar.setPropellant(EngineDto.getPropellant());
            }
            return null;
        }

        @Override
        public void deleteById(Long id) {
            int found = findCarById(id);

            if (found != -1) {
                engine.remove(found);
            }
        }
    }

