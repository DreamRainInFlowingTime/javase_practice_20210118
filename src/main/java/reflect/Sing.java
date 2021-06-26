package reflect;

public interface Sing {
    default void show(){
        System.out.println("跳");
    };
}
