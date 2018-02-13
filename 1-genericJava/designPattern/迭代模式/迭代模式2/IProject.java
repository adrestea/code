package 迭代模式.迭代模式2;

import java.util.Iterator;

interface IProject {
    //增加项目
    void add(String name, int num, int cost);

    //从老板这里看到的就是项目信息
    String getProjectInfo();

    //获得一个可以被遍历的对象
    Iterator iterator();
}