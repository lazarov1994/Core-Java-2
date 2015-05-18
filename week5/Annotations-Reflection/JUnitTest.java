
package week5;


import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;

/**
 * @author Lazarov94
 *
 */
public class JUnitTest {
	Class classForTest;
	Method[] allMethods;
	HashMap<Class, Type> methods;
	
	JUnitTest(Class yourClass){
		classForTest = yourClass;
		getMethods();
		
	}
	
	void getMethods(){
		Class reflectClass = classForTest.getClass();
		allMethods = reflectClass.getMethods();
		//allMethods[0].getP		
	}
	
	void testMethod(Method m ){
		
	}
	
	static void testerOfMethods(Class JU) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		Method[] methods = JU.getMethods();
		for(int i = 0; i < methods.length; i++){
			Annotation[] annotationOfMethod = methods[i].getAnnotations();
			for(int j =  0 ; j < annotationOfMethod.length ; j++){
				if(annotationOfMethod[i].annotationType().getSimpleName() == "Test"){
					
					methods[i].invoke(JU);
				} 
			}
			
		}
		
	}
	
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class a = JUnitTestCase.class;
		testerOfMethods(a);
	}

}
