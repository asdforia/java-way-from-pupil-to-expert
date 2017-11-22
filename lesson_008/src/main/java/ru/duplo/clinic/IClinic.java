package ru.duplo.clinic;

import java.util.Collection;

public interface IClinic {
    /**
     * Добавляет клиента
     * @param client добавляемый клиент
     */
    void addClient(Client client);

    /**
     * Добавляем питомца
     * @param clientId Идентификатор клиента - владельца питомца
     * @param pet добавляемый питомец
     */
    void addPet(int clientId, Pet pet);

    /**
     * Редактируем данные клиента
     * @param client редактируемый клиент
     */
    void editClient(Client client);

    /**
     * Редактируем данные питомца
     * @param clientId Идентификатор клиента - владельца питомца
     * @param pet редактируемый питомец
     */
    void editPet(int clientId, Pet pet);

    /**
     * Удаляем клиента по идентификатору
     * @param clientId идентификатор удаляемого клиента
     */
    void deleteClient(int clientId);

    /**
     * Удаляем питомца
     * @param clientId Идентификатор клиента - владельца питомца
     * @param petId идентификатор удаляемого питомца
     */
    void deletePet(int clientId, int petId);

    /**
     * Поиск клиентов по имени
     * @param name имя клиента/-ов
     * @return коллекция клиентов с заданным именем
     */
    Collection<Client> searchClient(String name);

    /**
     * Поиск питомца по кличке
     * @param nick кличка питомца
     * @return коллекция клиентов, имеющих питомцев с заданным именем
     */
    Collection<Client> searchPet(String nick);

    /**
     * Получаем коллекцию всех клиентов
     * @return коллекция всех клиентов
     */
    Collection<Client> getClients();

    /**
     * Получаем клиента по его идентификатору
     * @param clientId Идентификатор клиента
     * @return клиент
     */
    Client getById(int clientId);
}
