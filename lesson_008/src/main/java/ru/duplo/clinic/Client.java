package ru.duplo.clinic;

import java.util.List;

public class Client {
    private int id;
    private String name;
    private List<Pet> pets;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return this.pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    public Pet getPetById(int petId) {
        Pet result = null;
        for (Pet pet : this.pets) {
            if (pet.getId() == petId) {
                result = pet;
                break;
            }

        }
        return result;
    }

    public void editPet(Pet result) {
        this.pets.remove(this.getPetById(result.getId()));
        this.pets.add(result);
    }

    void deletePet(int petId) {
        this.pets.remove(this.getPetById(petId));
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
