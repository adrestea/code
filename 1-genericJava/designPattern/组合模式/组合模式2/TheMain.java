package 组合模式.组合模式2;

import java.util.ArrayList;

public class TheMain {
    public static void main(String[] args) {
//首先是组装一个组织结构出来
        Branch ceo = Utils.compositeCorpTree();
//首先把CEO的信息打印出来
        System.out.println(ceo.getInfo());
//然后是所有员工信息
        System.out.println(getTreeInfo(ceo));
    }

    //遍历整棵树,只要给我根节点,我就能遍历出所有的节点
    public static String getTreeInfo(Branch root) {
        ArrayList<ICorp> subordinateList = root.getSubordinate();
        String info = "";
        for (ICorp s : subordinateList) {
            if (s instanceof Leaf) { //是员工就直接获得信息
//                info = info + s.getInfo() + "\n";
                System.out.println(s.getInfo());
            } else if (s instanceof Branch) { //是个小头目
//                info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
                System.out.println(" ===================================== ");
                System.out.println(s.getInfo());
                getTreeInfo((Branch) s);
            } else {
                throw new RuntimeException("class type is error:" + s.getClass());
            }
        }
        return info;
    }
}
