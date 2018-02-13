package Test.拷贝.浅拷贝;

class Body implements Cloneable {
    public Head head;

    public Body() {
    }

    public Body(Head head) {
        this.head = head;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Head implements Cloneable {
    public Face face;

    public Head() {
    }

    public Head(Face face) {
        this.face = face;
    }
}

class Face implements Cloneable {
    public Face() {
    }
}