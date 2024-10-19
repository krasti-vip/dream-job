package ru.dream.job.org.example.rental.dao;

import ru.dream.job.org.example.rental.model.Human;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HumanDao implements Dao<Human> {
    private List<Human> dataBase = new ArrayList<>();

    @Override
    public void save(Human obj) {
        dataBase.add(obj);
        System.out.println(obj.toString() + " \n save!");
    }

    @Override
    public Human get(Human obj) {
        return dataBase.stream()
                .filter(human -> human.getPhoneNumber().equals(obj.getPhoneNumber()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean update(Human obj) {
        if (obj == null || obj.getPassportId() == null || obj.getFirstName() == null ||
                obj.getLastName() == null || obj.getPhoneNumber() == null || obj.getPassportId() == null) {
            return false;
        }

        Optional<Human> existingHuman = dataBase.stream()
                .filter(human -> human.getPassportId().equals(obj.getPassportId()))
                .findFirst();

        if (existingHuman.isPresent()) {
            int index = dataBase.indexOf(existingHuman.get());
            dataBase.set(index, obj);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(Human obj) {
        if (obj == null || obj.getPassportId() == null || obj.getFirstName() == null ||
                obj.getLastName() == null || obj.getPhoneNumber() == null || obj.getPassportId() == null) {
            return false;
        }

        return dataBase.removeIf(human ->
                human.getLastName().equals(obj.getLastName()) &&
                        (human.getPhoneNumber().equals(obj.getPhoneNumber()) ||
                                human.getPassportId().equals(obj.getPassportId())));
    }
}
