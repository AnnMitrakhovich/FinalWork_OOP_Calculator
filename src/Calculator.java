import Operations.Operation;

public class Calculator {
    double a;
    double b;
    Operation operation;
    double memory = 0;

    public Calculator(double a, double b, Operation operation, double memory) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        this.memory = memory;
    }

    public double getMemory() {
        return memory;
    }


}
