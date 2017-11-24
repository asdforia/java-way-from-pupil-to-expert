package ru.duplo.clinic.actions;

import ru.duplo.calc.Validator;
import ru.duplo.clinic.Client;
import ru.duplo.clinic.IClinic;

public class SearchPetAction implements Action {
    @Override
    public void execute(IClinic clinic, Validator validator) {
        String key = validator.getString("Enter pet name for searching : ");
        for (Client client : clinic.searchPet(key)) {
            System.out.println(client);
        }
    }

    @Override
    public String intro() {
        return String.format("%s - search pet by name", key());
    }

    @Override
    public int key() {
        return 8;
    }
}
