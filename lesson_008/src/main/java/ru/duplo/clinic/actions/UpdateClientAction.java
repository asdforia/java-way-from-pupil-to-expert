package ru.duplo.clinic.actions;

import ru.duplo.calc.Validator;
import ru.duplo.clinic.Client;
import ru.duplo.clinic.IClinic;

public class UpdateClientAction implements Action {
    /**
     * Executed Action
     *
     * @param clinic    Clinic
     * @param validator User input validator
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        final int clientId = validator.getInt("Enter client ID : ");
        final String name = validator.getString("Enter client name : ");
        final Client client = clinic.getById(clientId);
        client.setName(name);
        clinic.editClient(client);
    }

    /**
     * Executed action's description
     *
     * @return Description
     */
    @Override
    public String intro() {
        return String.format("%s - update client", this.key());
    }

    /**
     * Key - action's ID
     *
     * @return Key
     */
    @Override
    public int key() {
        return 3;
    }
}
