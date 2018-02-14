package 备忘录模式.备忘录模式4;

import java.util.HashMap;

public class Memento {
    //接受HashMap作为状态
    private HashMap<String, Object> stateMap;

    //接受一个对象,建立一个备份
    public Memento(HashMap<String, Object> map) {
        this.stateMap = map;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}

