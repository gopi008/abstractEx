abstract class Arithmetic {
    abstract void add();
    abstract void subtract();
    abstract void multiply();
    abstract void divide();
}

class ImplementedMethod extends Arithmetic {
    @Override
    void add() {
        System.out.println("Addition");
    }

    @Override
    void subtract() {
        System.out.println("Subtraction");
    }

    @Override
    void multiply() {
        System.out.println("Multiplication");
    }

    @Override
    void divide() {
        System.out.println("Division");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        ImplementedMethod obj = new ImplementedMethod();
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}
