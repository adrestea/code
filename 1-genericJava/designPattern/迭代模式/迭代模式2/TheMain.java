package 迭代模式.迭代模式2;

import java.util.Iterator;

public class TheMain {
    public static void main(String[] args) {
//定义一个List,存放所有的项目对象
        IProject project = new Project();
//增加项目
        project.add("星球大战项目ddddd", 10, 100000);
        project.add("扭转时空项目", 100, 10000000);
        project.add("超人改造项目", 10000, 1000000000);
        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }
//遍历一下ArrayList,把所有的数据都取出
        //IProjectIterator projectIterator = project.iterator();

        Iterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}