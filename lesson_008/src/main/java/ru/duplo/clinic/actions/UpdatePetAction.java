package ru.duplo.clinic.actions;

import ru.duplo.calc.Validator;
import ru.duplo.clinic.Client;
import ru.duplo.clinic.IClinic;
import ru.duplo.clinic.Pet;

public class UpdatePetAction implements Action {
    /**
     * Executed Action
     *
     * @param clinic    Clinic
     * @param validator User input validator
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        final int clientId = validator.getInt("Enter client ID : ");
        final int petId = validator.getInt("Enter pet ID : ");
        final String nick = validator.getString("Enter pet nick : ");
        final Client client = clinic.getById(clientId);
        Pet pet = client.getPetById(petId);
        pet.setName(nick);
        client.editPet(pet);
    }

    /**
     * Executed action's description
     *
     * @return Description
     */
    @Override
    public String intro() {
        return String.format("%s - edit pet", this.key());
    }

    /**
     * Key - action's ID
     *
     * @return Key
     */
    @Override
    public int key() {
        return 4;
    }
}
