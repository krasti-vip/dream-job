package ru.dream.job.constructorTask.television;

public class InfoTelevision {
    public static void main(String[] args) {
/**
 * проверка конструктора по умолчанию, что он пустой, затем создание телевизора и вывода информации о нем с
 * использованием мотода displayInfo()
 */
        Television tv1 = new Television();
        tv1.displayInfo();
        System.out.println();
        tv1.setBrand("LG");
        tv1.setScreenSize(65);
        tv1.setPermission("4K UHD");
        tv1.displayInfo();
        System.out.println();

        // Использование конструктора с брендом и размером экрана
        Television tv2 = new Television("Samsung", 55);
        tv2.displayInfo();
        System.out.println();

        // Использование конструктора с полным набором параметров
        Television tv3 = new Television("LG", 65, "4K UHD");
        tv3.displayInfo();
    }

}
