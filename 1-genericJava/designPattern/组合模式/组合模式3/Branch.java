package 组合模式.组合模式3;

import java.util.ArrayList;

public class Branch extends Corp {
    ArrayList<Corp> subordinate;

    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
        subordinate = new ArrayList<>();
        subordinate.clear();
    }

    //能够增加小兵(树叶节点)或者是经理(树枝节点)
    public void addSubordinate(Corp corp) {
        subordinate.add(corp);
    }

    public int hasChildCount() {
        int count = 0;
        for (Corp c : subordinate) {
            if (c instanceof Branch) {
                count++;
            }
        }
        return count;
    }

    //我还要能够获得下属的信息
    public ArrayList<Corp> getSubordinate() {
        return subordinate;
    }

    //删除下属
    public void deleteSubordinate(Corp corp) {
        subordinate.remove(corp);
    }
}