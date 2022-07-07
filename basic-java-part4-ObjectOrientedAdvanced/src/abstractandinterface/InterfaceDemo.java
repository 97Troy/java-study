package abstractandinterface;

public interface InterfaceDemo{
    String INTERFACE_NAME = "INTERFACE";
    int AGE = 12;

    void run();

    String getName();

    int add(int a, int b);
}

interface InterfaceDemo1{
    String INTERFACE_NAME = "INTERFACE";
    int AGE = 12;

    void run();

    String getName();

    int add1(int a, int b);
}

class InterfaceDemoImplement implements InterfaceDemo{
    @Override
    public void run() {

    }

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

}

class InterfaceTest extends InterfaceDemoImplement implements InterfaceDemo1{
    @Override
    public int add1(int a, int b) {
        return 0;
    }
}
