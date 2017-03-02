// A class can define local variables with the same name as 
// the instance or class variables, also referred to as shadowing. 
// The following code defines a class variable and a local variable, softKeyboard, 
// with the same name, and an instance variable and a local variable,
// phoneNumber, with the same name, which is acceptable:

class MyPhone {
  static boolean softKeyboard = true;
  String phoneNumber;

  void myMethod() {
    boolean softKeyboard = true;
    String phoneNumber;
  }
}

