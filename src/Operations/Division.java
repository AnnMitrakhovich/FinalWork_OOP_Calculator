package Operations;

public class Division implements Operation {

    @Override
    public double getResult(double a, double b) {
        if (b == 0)
            throw new RuntimeException("Деление на 0 запрещено.");
        return a/b;
    }
}

