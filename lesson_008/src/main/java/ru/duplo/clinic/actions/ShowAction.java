package ru.duplo.clinic.actions;

import ru.duplo.calc.Validator;
import ru.duplo.clinic.Client;
import ru.duplo.clinic.IClinic;

public class ShowAction implements Action {
    @Override
    public void execute(IClinic clinic, Validator validator) {
        for (Client client : clinic.getClients()) {
            System.out.println(client);
        }
    }

    @Override
    public String intro() {
        return String.format("%s - show clients", key());
    }

    @Override
    public int key() {
        return 0;
    }
}
