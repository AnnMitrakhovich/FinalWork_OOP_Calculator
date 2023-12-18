import Operations.Operation;
import Operations.OperationService;

public class Calculator {

    double memory = 0;

    public double getMemory() {
        return memory;
    }

    public void createOpetationService() {
        OperationService operationService = new OperationService();
        operationService.inputFromConsole();
    }

}
