package mesClasses;

public class HelloWord {

	public static String getMessage(String ch) {
		if(ch!=null)
		return "Hello "+ch;
		return "Hello word";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(getMessage("moussa"));
	}

}
