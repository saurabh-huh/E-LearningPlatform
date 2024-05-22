package training.day3;


@FunctionalInterface
interface Show{
    void show();
//    void fkhsd();
    default void getMyName() {
        System.out.println("This is a default method inside a functional interface:");
    }

    static void printStatic() {
        System.out.println(" This is a static method inside a interface.");
    }

}
//one way to perform operation.

//class Display implements Show{
//    public void show(){
//        System.out.println("I am here external class !");
//    }
//}

public class LambdaAndFunctional{
    //functional interface have only one abstract interface .

    public static void main(String[] args) {
//        Display display = new Display();

        // display using anonymous class implement the interface method.
//        Show display = new Show(){
//            public void show(){
//                System.out.println(" Using Anonymous class : ");
//            }
//        };

        //Writing a lambda expression to print
        Show display = () -> System.out.println(" With the help of the lambda operation:");
        display.show();
        display.getMyName();
        //static method inside the interface can be call with the call name .
        Show.printStatic();
    }
}

