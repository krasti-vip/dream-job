package ru.dream.job.baseJava.steep19.nestedClasses;

public class EventManager {

    public interface EventHandler {
        void handle();
    }

    public void processEvent(String event, EventHandler handler) {
        System.out.println("Произошло событие: " + event);
        handler.handle(); //бывают ли анонимные методы? чтобы не перепутать
    }
}

