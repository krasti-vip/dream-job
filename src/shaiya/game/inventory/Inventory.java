package shaiya.game.inventory;

import java.util.*;

public class Inventory {

    private final Map<String, Lut> inventory = new HashMap<>();

    /**
     * Метод ищет в мапе по ключу (uniqName) лут у игрока, если он есть передает его
     */
    public Optional<Lut> getLut(final String uniqName) {
        if (inventory.containsKey(uniqName)) {
            if (inventory.get(uniqName).getCount() < 1) {
                inventory.remove(uniqName);
            } else {
                return Optional.of(inventory.get(uniqName));
            }
        }

        return Optional.empty();
    }

    /**
     *  Метод принимает лут, проходится по мапе если находит такой же ключ, увеличивает количество
     *  если таких ключей нет, создает его по uniqName
     */
    public void addLut(final Lut lut) {
        if (inventory.containsKey(lut.getUniqName())) {
            final var lutInInventory = inventory.get(lut.getUniqName());
            lutInInventory.setCount(lutInInventory.getCount() + lut.getCount());
        } else {
            inventory.put(lut.getUniqName(), lut);
        }
    }

    /**
     * Метод перебирает мапу циклом форэйч, записывает всё что нашел в ЭрэйЛист и возвращает весь список
     */
    public List<Lut> getAllLut() {
        ArrayList<Lut> lut = new ArrayList<>();

        for (Map.Entry<String, Lut> stringLutEntry : inventory.entrySet()) {
            lut.add(stringLutEntry.getValue());
        }

        return lut;
    }

    /**
     * Метод перебирает весь инвентарь и передает о нем информацию, ключ, количество и описание
     */
    public void printInventory() {
        for (Map.Entry<String, Lut> stringLutEntry : inventory.entrySet()) {
            System.out.println("Твой инвентарь: ");
            System.out.println(stringLutEntry.getKey() + ": " + stringLutEntry.getValue().getCount() +
                    " - " + stringLutEntry.getValue().getTitle());
        }
    }
}
