import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {
    private String name;
    private int storageСapacity;
    private int randomAccessMemory;
    private String operationSystem;
    private String processor;
    private static Map<Integer, String> mapCriteria = new HashMap<>();
    private List<Object> listOperation = new ArrayList<>();

    public Product(String name, int storageСapacity, int randomAccessMemory, String operationSystem, String processor) {
        this.name = name;
        this.storageСapacity = storageСapacity;
        this.randomAccessMemory = randomAccessMemory;
        this.operationSystem = operationSystem;
        this.processor = processor;
    }

    public String GetName() {
        return name;
    }

    public Integer GetStorageСapacity() {
        return storageСapacity;
    }

    public Integer GetRandomAccessMemory() {
        return randomAccessMemory;
    }

    public String GetOperationSystem() {
        return operationSystem;
    }

    public String GetProcessor() {
        return processor;
    }

    public static Map<Integer, String> CreatMapCriteria() {
        mapCriteria.put(1, "Имя");
        mapCriteria.put(2, "Объем накопителя");
        mapCriteria.put(3, "Объем оперативной памяти");
        mapCriteria.put(4, "Опирационная система");
        mapCriteria.put(5, "Процессор");
        return mapCriteria;
    }

    public List<Object> CreatListOperaion() {
        listOperation.add(GetName());
        listOperation.add(GetStorageСapacity());
        listOperation.add(GetRandomAccessMemory());
        listOperation.add(GetOperationSystem());
        listOperation.add(GetProcessor());
        return listOperation;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %s, %s", name, storageСapacity, randomAccessMemory, operationSystem,
                processor);
    }

}
