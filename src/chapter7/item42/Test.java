package chapter7.item42;

public class Test {
    public static void main(String[] args) {

        // Using FunctionalInterface
        TestInterface test = new TestInterface(){
            @Override
            public void doTest() {
                System.out.println("doTest!!");
            }
        };

        test.doTest();
    }
}
