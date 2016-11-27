// Sometimes it is required to develop meaningful exceptions based on our application requirements.
// In this case, we can create our own exceptions by extending 'Exception' class.

package coreJava;

public class CreateCustomException {

	public static void main(String[] args) {

		try {
			CreateCustomException.myTest(null);
		} catch (MyAppException mae) {
			System.out.println("Inside catch block: " + mae.getMessage());
		}
	}

	static void myTest(String str) throws MyAppException {
		if (str == null) {
			throw new MyAppException("String value is null");
		}
	}
}

class MyAppException extends Exception {
	private String message = null;

	public MyAppException() {
		super();
	}

	public MyAppException(String message) {
		super(message);
		this.message = message;
	}

	public MyAppException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}

//
//Output
//-------
//Inside catch block: String value is null
