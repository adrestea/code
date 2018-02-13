package Test.拷贝.彻底的深拷贝;

class Body implements Cloneable {
    public Head head;
    public String name;

    public Body() {
    }

    public Body(Head head, String name) {
        this.head = head;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //深拷贝的关键点在这里需要处理所有对象的拷贝问题
        //要深拷贝一个对象， 这个对象必须要实现Cloneable接口，实现clone方法，并且在clone方法内部，把该对象引用的其他对象也要clone一份 ， 这就要求这个被引用的对象必须也要实现Cloneable接口并且实现clone方法
        //徹底的深拷貝（face还是指向相同的对象）
        Body newBody = (Body) super.clone();
        newBody.head = (Head) head.clone();
        return newBody;
    }
}

class Head implements Cloneable {
    public Face face;

    public Head() {
    }

    public Head(Face face) {
        this.face = face;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Head newHead = (Head) super.clone();
        newHead.face = (Face) this.face.clone();
        return newHead;
    }
}

class Face implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}



