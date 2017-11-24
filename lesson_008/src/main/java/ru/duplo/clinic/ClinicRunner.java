package ru.duplo.clinic;

import ru.duplo.calc.ConsoleIO;
import ru.duplo.calc.Validator;
import ru.duplo.clinic.actions.*;

import java.util.Scanner;

public class ClinicRunner {
    public static void main(String[] args) {
        final ClinicUI ui = new ClinicUI(
                new Clinic(),
                new Validator(
                        new ConsoleIO(
                                new Scanner(System.in),
                                System.out
                        )
                )
        );

        ui.loadAction(new ShowAction());
        ui.loadAction(new CreateClientAction());
        ui.loadAction(new CreatePetAction());
        ui.loadAction(new UpdateClientAction());
        ui.loadAction(new UpdatePetAction());
        ui.loadAction(new DeleteClientAction());
        ui.loadAction(new DeletePetAction());
        ui.loadAction(new SearchClientAction());
        ui.loadAction(new SearchPetAction());
        ui.show();
    }
}
