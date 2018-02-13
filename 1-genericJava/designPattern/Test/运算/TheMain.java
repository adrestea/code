package Test.运算;

public class TheMain {
    public static void main(String[] args) {
        int i = 1 << 4;//0001 0000
        int j = 1 << 1;//0000 0010
        int flags = 3; //0000 0011
        final int LAG_INSTALLED = 1 << 16;
        System.out.println("i=" + i + " ,j=" + j + " ,flags=" + flags);
        System.out.println("flags & j= " + (flags & j));
        System.out.println("flags | i= " + (flags | i));

        flags |= LAG_INSTALLED;
        System.out.println("flags |= LAG_INSTALLED =" + flags);//添加标记位
        System.out.println("flags &= LAG_INSTALLED =" + (flags & ~LAG_INSTALLED));//移除标记位
    }
}