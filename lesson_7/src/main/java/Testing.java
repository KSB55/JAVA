import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Testing {
    public static void start() throws BeforeAfterNotUniqeException, InvocationTargetException, IllegalAccessException{
        Class<Tests> tests = Tests.class;
        Tests test = new Tests();

        Method[] methods = tests.getDeclaredMethods();
        ArrayList<Method> methodsBefore = new ArrayList<>();
        ArrayList<Method> methodsAfter = new ArrayList<>();

        for(Method o : methods
        ){
            if(o.isAnnotationPresent(BeforeSuite.class)){
                if(methodsBefore.isEmpty()) {
                    methodsBefore.add(o);
                }else {
                    throw new BeforeAfterNotUniqeException("BeforeSuite");
                }
            }

            if(o.isAnnotationPresent(AfterSuite.class)){
                if(methodsAfter.isEmpty()) {
                    methodsAfter.add(o);
                }else {
                    throw new BeforeAfterNotUniqeException("AfterSuite");
                }
            }
        }

        methodsBefore.get(0).invoke(test);

        for(int i = 0; i <= 10; i++){
            for(Method method : methods){

                if(method.isAnnotationPresent(Test.class)){
                    if(method.getAnnotation(Test.class).priority() == i){
                        method.invoke(test);
                    }
                }
            }
        }

        methodsAfter.get(0).invoke(test);

    }
}
