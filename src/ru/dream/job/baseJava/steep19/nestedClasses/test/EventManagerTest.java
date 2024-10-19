package ru.dream.job.baseJava.steep19.nestedClasses.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.dream.job.baseJava.steep19.nestedClasses.EventManager;

public class EventManagerTest {

    @Test
    @DisplayName("Тест обработки события")
    void processEventTest() {
        EventManager eventManager = new EventManager();

        EventManager.EventHandler handler = new EventManager.EventHandler() {
            @Override
            public void handle() {
                System.out.println("Обработано событие!");
            }
        };
    }

    @Test
    @DisplayName("Тест обработки события с лямбда-выражением")
    void processEventWithLambdaTest() {
        EventManager eventManager = new EventManager();

        eventManager.processEvent("Кнопка нажата", () -> System.out.println("Обработано событие через лямбда!"));
    }
}
