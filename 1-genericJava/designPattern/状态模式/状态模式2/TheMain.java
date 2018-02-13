package 状态模式.状态模式2;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TheMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();

        //违章操作
        context.run();

        context.close();
        context.run();
        context.stop();
        System.out.println("------------------------------------");

        Class clazz = Context.class;
        try {
            Context c = (Context) Class.forName(clazz.getName()).newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                String key = field.getName();
                PropertyDescriptor descriptor = null;
                try {
                    descriptor = new PropertyDescriptor(key, clazz);
                } catch (IntrospectionException e) {
                    e.printStackTrace();
                }
                Method method = descriptor.getReadMethod();
                //Object value = method.invoke(c);

//                System.out.println(key + ":" + value);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
