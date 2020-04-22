package chapter7.item44;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        // 직접 만든 FunctionalInterface 사용
        SimpleFunctionInterface sfi = new SimpleFunctionInterface() {
            @Override
            public void doWork() {
                System.out.println("doWork!!");
            }
        };

        sfi.doWork();
        sfi.defaultDoWork();
    }
}
