package ru.duplo.clinic;

import ru.duplo.calc.Validator;
import ru.duplo.clinic.actions.Action;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClinicUI {
    private final IClinic clinic;
    private final Validator validator;
    private final Map<Integer, Action> actions = new ConcurrentHashMap<>();

    public ClinicUI(IClinic clinic, Validator validator) {
        this.clinic = clinic;
        this.validator = validator;
    }

    public void loadAction(final Action action) {
        this.actions.put(action.key(), action);
    }

    public void show() {
        this.intro();
        do {
            doAction(validator);
        } while (validator.compare("Do you want to continue? (y)", "y"));
    }

    private void doAction(final Validator validator) {
        this.actions.get(
                validator.getIntFromList(
                        "Choose the operation : ",
                        this.actions.keySet()
                )
        ).execute(this.clinic, validator);
    }

    private void intro() {
        System.out.println("Welcome to clinic!");
        for (Action action : this.actions.values()) {
            System.out.println(action.intro());
        }
    }
}
