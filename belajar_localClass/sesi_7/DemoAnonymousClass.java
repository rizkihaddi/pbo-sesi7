package belajar_localClass;

public class DemoAnonymousClass {
    public static void main(String[] args) {
        Thread anonymous = new Thread() {
            @Override
            public void run() {
                System.out.println("This is example anonymous class in Java");
            }
        };
        anonymous.start();
    }
}