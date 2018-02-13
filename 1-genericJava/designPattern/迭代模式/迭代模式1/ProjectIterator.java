package 迭代模式.迭代模式1;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {
    //所有的项目都放在ArrayList中
    private ArrayList<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    //构造函数传入projectList
    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    //判断是否还有元素,必须实现
    @Override
    public boolean hasNext() {
        //定义一个返回值
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    //取得下一个值
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }

    //删除一个对象
    @Override
    public void remove() {
        //暂时没有使用到
    }
}