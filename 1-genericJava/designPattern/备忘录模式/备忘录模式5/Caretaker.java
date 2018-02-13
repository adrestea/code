package 备忘录模式.备忘录模式5;

import java.util.HashMap;

public class Caretaker {
    //备忘录对象
    private HashMap<String, IMemento> map = new HashMap<>();

    public IMemento getMemento(String key) {
        return map.get(key);
    }

    public void setMemento(String key, IMemento memento) {
        map.put(key, memento);
    }
}