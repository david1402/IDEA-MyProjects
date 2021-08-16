import java.lang.reflect.*;

public class Demo {

    public static void main(String[] args) throws Exception {
        Class clazz1 = Class.forName("Test");
        Test test = new Test();
        Class clazz2 = test.getClass();
        Class clazz3 = Test.class;


        System.out.println("Class name is " + clazz1.getName());
        System.out.println("SuperClass name is " + clazz1.getSuperclass().getName());

        Class[] classInterfaces = clazz2.getInterfaces();
        System.out.println("Implemented interfaces are:");
        for (Class c : classInterfaces) {
            System.out.print(c.getName() + " ");
        }
        System.out.println();
        int modifiers = clazz2.getModifiers();
        System.out.println("Access Modifiers are " + Modifier.toString(modifiers));

        System.out.println("********now info about Variables from class Test*****");

        Field[] fields = clazz2.getFields();
        Field[] declaredFields = clazz2.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println("Variable name  " + f.getName());
            System.out.println("Variable type  "+f.getType());

            int modifier = f.getModifiers();
            System.out.println("Variable's access modifier  "+Modifier.toString(modifier));
           // System.out.println("Variable's value"+f.get(f));

        }

        System.out.println("********now info about Methods from class Test*****");

        Method[] methods = clazz2.getMethods();
        Method[] declaredMethods = clazz2.getDeclaredMethods();
        for (Method m:declaredMethods){
            System.out.println(m.getName());
            System.out.println(m.getReturnType() );
            int modifierListMethods = m.getModifiers();
            System.out.println(Modifier.toString(modifierListMethods));
            Class[] parameterTypes = m.getParameterTypes();
            for (Class c:parameterTypes){
                System.out.println("Parametertypes   "+c.getName()+"  ");

            }System.out.println("--------");
        }

        System.out.println("********now info about Constructors from class Test*****");

        Constructor[] constructors = clazz2.getConstructors();
        for (Constructor con:constructors){
            System.out.println("Con name " +con.getName());
            int i =con.getModifiers();
            System.out.println(("Modifier "+Modifier.toString(i)));
            Class[] parameterTypes = con.getParameterTypes();
            for (Class par:parameterTypes){
                System.out.println("Parameter   "+par.getName());
            }
           Class[]excep= con.getExceptionTypes();
            for (Class e:excep){
                System.out.println("Exceptions"+e.getName());
            }
        }


        Field field = clazz1.getDeclaredField("s");
        field.setAccessible(true);
        field.set(test,"JAVA");
        System.out.println("***variable set 'java'***  "+test);


        Method methodinvoke1 = clazz3.getDeclaredMethod("method1");
        methodinvoke1.invoke(test);

        Method methodinvoke2 = clazz2.getDeclaredMethod("method2",int.class);
        methodinvoke2.setAccessible(true);
        methodinvoke2.invoke(test,10);

        System.out.println("*****ARRAY*****");

int[] arr = new int[0];
        Class<? extends int[]> aClass = arr.getClass();
        System.out.println(aClass.isArray());
        int[] anInt = aClass.newInstance();//does not work.No constructor.
        System.out.print(anInt.length);
        Array.newInstance(float.class,5);//should work

    }
}
