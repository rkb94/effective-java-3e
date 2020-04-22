package chapter7.item44;

@FunctionalInterface
public interface SimpleFunctionInterface {
    void doWork();

    default void defaultDoWork() {
        System.out.println("defaultDoWork!!");
    }
}
