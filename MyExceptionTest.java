package coreJava;

public class MyExceptionTest {

    public void testRuntimeException(){
        throw new MyException();
    }

    public static void main(String[] args) {
    	
        try{
            new MyExceptionTest().testRuntimeException();
        }catch(Exception e){
            System.out.println(e.getClass().getName());
        }
    }
}    

class MyException extends RuntimeException{
    public MyException(){
        super();
    }
}

//
//Output
//========
//coreJava.MyException
