package model.dataStructures.myFileTable;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import MyException.MyException;


public class MyFileTable<K, V> implements MyFileTable<K, V>{

    private Map<K, V> fileTable;

    public MyFileTable() {
        this.fileTable = new HashMap<K, V>();
    }

    @Override
    public boolean isDefined(K key) {
        return this.fileTable.containsKey(key);
    }
}
