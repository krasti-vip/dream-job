package ru.dream.job.org.example.rental.dao;
import ru.dream.job.org.example.rental.dao.model.BankCard;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankCardDao implements Dao<BankCard> {
    private List<BankCard> bankCards = new ArrayList<>();

    @Override
    public void save(BankCard bankCard) {
        bankCards.add(bankCard);
    }

    @Override
    public BankCard get(BankCard bankCard) {
        // Поиск карты с использованием Stream API
        return bankCards.stream()
                .filter(bcard -> bcard.equals(bankCard))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean update(BankCard bankCard) {
        if (bankCard == null || bankCard.getCardNumber() == null) {
            return false;
        }

        Optional<BankCard> existingCard = bankCards.stream()
                .filter(bcard -> bcard.getCardNumber().equals(bankCard.getCardNumber()))
                .findFirst();

        if (existingCard.isPresent()) {
            int index = bankCards.indexOf(existingCard.get());
            bankCards.set(index, bankCard);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(BankCard bankCard) {
        return bankCards.removeIf(bcard -> bcard.equals(bankCard));
    }
}
