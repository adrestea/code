package reference;

public class WeakReferenceTest {
    public static void main(String[] args) {
        String str = new String("Java讲义");
        java.lang.ref.WeakReference<String> ref = new java.lang.ref.WeakReference<>(str);
        str = null;
        System.out.println(ref.get());
        System.gc();
        System.runFinalization();
        System.out.println(ref.get());
    }
}
