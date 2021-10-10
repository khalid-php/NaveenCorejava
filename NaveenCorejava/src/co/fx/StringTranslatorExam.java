package co.fx;
/** W A P to translate String to any International language or
 * local Language*/
import java.lang.reflect.Field;

public class StringTranslatorExam {
	static {
		try {
			Field value=String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("Hello",value.get("أهلا"));
			value.set("good morning",value.get("صباح الخير"));
			value.set("thank you",value.get("اشكرك"));
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("good morning");
		System.out.println("thank you");
	}

}
