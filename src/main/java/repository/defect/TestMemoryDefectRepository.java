package repository.defect;


import domain.defect.model.Defect;
import domain.repository.DefectRepository;

import java.util.HashMap;
import java.util.Map;

public class TestMemoryDefectRepository implements DefectRepository {

    private static Long id = 0L;
    private static Map<Long, Defect> memoryDB = new HashMap<>();



    @Override
    public Long save(Defect defect) {
        memoryDB.put(++id, defect);
        return id;
    }

    @Override
    public Defect find(Long id) {
        return memoryDB.get(id);
    }

    public static void printMemoryDB() {
        for (Map.Entry<Long, Defect> entry : memoryDB.entrySet()) {
            System.out.print("id = " + entry.getKey() + "/ defect = " + entry.getValue());
        }
    }


}
