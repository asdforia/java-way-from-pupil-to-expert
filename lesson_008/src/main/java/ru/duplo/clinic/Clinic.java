package ru.duplo.clinic;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Clinic implements IClinic {
    private final AtomicInteger clientIds = new AtomicInteger();
    private final AtomicInteger petIds = new AtomicInteger();
    private final Map<Integer, Client> clients = new LinkedHashMap<>();

    /**
     * Добавляет клиента
     *
     * @param client добавляемый клиент
     */
    @Override
    public void addClient(final Client client) {
        client.setId(clientIds.incrementAndGet());
        this.clients.put(client.getId(), client);
    }

    /**
     * Добавляем питомца
     *
     * @param clientId Идентификатор клиента - владельца питомца
     * @param pet      добавляемый питомец
     */
    @Override
    public void addPet(final int clientId, final Pet pet) {
        pet.setId(petIds.incrementAndGet());
        this.clients.get(clientId).addPet(pet);
    }

    /**
     * Редактируем данные клиента
     *
     * @param client редактируемый клиент
     */
    @Override
    public void editClient(final Client client) {
        this.clients.put(client.getId(), client);
    }

    /**
     * Редактируем данные питомца
     *
     * @param clientId Идентификатор клиента - владельца питомца
     * @param pet      редактируемый питомец
     */
    @Override
    public void editPet(final int clientId, final Pet pet) {
        this.clients.get(clientId).editPet(pet);
    }

    /**
     * Удаляем клиента по идентификатору
     *
     * @param clientId идентификатор удаляемого клиента
     */
    @Override
    public void deleteClient(final int clientId) {
        this.clients.remove(clientId);
    }

    /**
     * Удаляем питомца
     *
     * @param clientId Идентификатор клиента - владельца питомца
     * @param petId    идентификатор удаляемого питомца
     */
    @Override
    public void deletePet(final int clientId, final int petId) {
        this.clients.get(clientId).deletePet(petId);
    }

    /**
     * Поиск клиентов по имени
     *
     * @param name имя клиента/-ов
     * @return коллекция клиентов с заданным именем
     */
    @Override
    public Collection<Client> searchClient(final String name) {
        List<Client> result = new ArrayList<>();
        for (Client client : this.clients.values()) {
            if (client.getName().contains(name)) {
                result.add(client);
            }
        }
        return result;
    }

    /**
     * Поиск питомца по кличке
     *
     * @param nick кличка питомца
     * @return коллекция клиентов, имеющих питомцев с заданным именем
     */
    @Override
    public Collection<Client> searchPet(final String nick) {
        List<Client> result = new ArrayList<>();
        for (Client client : this.clients.values()) {
            for (Pet pet : client.getPets()) {
                if (pet.getName().contains(nick)) {
                    result.add(client);
                }
            }
        }
        return result;
    }

    /**
     * Получаем коллекцию всех клиентов
     *
     * @return коллекция всех клиентов
     */
    @Override
    public Collection<Client> getClients() {
        return new ArrayList<>(this.clients.values());
    }

    /**
     * Получаем клиента по его идентификатору
     *
     * @param clientId Идентификатор клиента
     * @return клиент
     */
    @Override
    public Client getById(int clientId) {
        return this.clients.get(clientId);
    }
}
