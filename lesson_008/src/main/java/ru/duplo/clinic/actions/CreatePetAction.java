package ru.duplo.clinic.actions;

import ru.duplo.calc.Validator;
import ru.duplo.clinic.Cat;
import ru.duplo.clinic.Dog;
import ru.duplo.clinic.IClinic;
import ru.duplo.clinic.Pet;

import java.util.Arrays;
import java.util.List;

public class CreatePetAction implements Action {
    /**
     * Executed Action
     *
     * @param clinic    Clinic
     * @param validator User input validator
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        int clientId = validator.getInt("Select client ID : ");
        int petType = validator.getIntFromList("Select pet: 1 - Dog; 2 - Cat : ", Arrays.asList(1, 2));
        String nick = validator.getString("Enter pet nick : ");
        Pet pet = petType == 1 ? new Dog(nick) : new Cat(nick);
        clinic.getById(clientId).addPet(pet);
    }

    /**
     * Executed action's description
     *
     * @return Description
     */
    @Override
    public String intro() {
        return String.format("%s - create pet", this.key());
    }

    /**
     * Key - action's ID
     *
     * @return Key
     */
    @Override
    public int key() {
        return 2;
    }
}
