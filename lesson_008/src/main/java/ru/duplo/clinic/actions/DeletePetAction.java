package ru.duplo.clinic.actions;

import ru.duplo.calc.Validator;
import ru.duplo.clinic.IClinic;

public class DeletePetAction implements Action {
    /**
     * Executed Action
     *
     * @param clinic    Clinic
     * @param validator User input validator
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        int clientId = validator.getInt("Enter client ID");
        int petId = validator.getInt("Enter pet ID");
        clinic.deletePet(clientId, petId);
    }

    /**
     * Executed action's description
     *
     * @return Description
     */
    @Override
    public String intro() {
        return String.format("%s - delete pet", this.key());
    }

    /**
     * Key - action's ID
     *
     * @return Key
     */
    @Override
    public int key() {
        return 6;
    }
}
