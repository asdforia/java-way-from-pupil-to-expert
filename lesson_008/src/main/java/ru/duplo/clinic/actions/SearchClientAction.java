package ru.duplo.clinic.actions;

import ru.duplo.calc.Validator;
import ru.duplo.clinic.Client;
import ru.duplo.clinic.IClinic;

public class SearchClientAction implements Action {
    @Override
    public void execute(IClinic clinic, Validator validator) {
        String key = validator.getString("Enter client name for searching : ");
        for (Client client : clinic.searchClient(key)) {
            System.out.println(client);
        }
    }

    @Override
    public String intro() {
        return String.format("%s - search client", key());
    }

    @Override
    public int key() {
        return 7;
    }
}
