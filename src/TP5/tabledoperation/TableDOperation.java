package TP5.tabledoperation;

import java.util.ArrayList;
import java.util.Random;

public class TableDOperation {

    private final int NB_CALCUL = 10;

    private OperationEnum typeOperation;
    private ArrayList<Operation> operations;

    public TableDOperation(OperationEnum o) {
        this.typeOperation = o;
    }

    private void initialisation() {
        for(int i = 0; i < NB_CALCUL; i++) {

            Random random = new Random();
            Operation operation = null;

            if(typeOperation == OperationEnum.ADDITION) operation = new Addition(random.nextInt(10), random.nextInt(10));
            if(typeOperation == OperationEnum.SOUSTRACTION) operation = new Soustraction(random.nextInt(10), random.nextInt(10));
            if(typeOperation == OperationEnum.MULTIPLICATION) operation = new Multiplication(random.nextInt(10), random.nextInt(10));

            operations.add(operation);
        }
    }

}
