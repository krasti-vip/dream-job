package ru.dream.job.step26.enumTask.season;

public enum Season {

    SPRING(18.2), SUMMER(30.6), AUTUMN(21.8), WINTER(8.9);

    private double averageTemperature;

    private Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    /**
     * на случай необходимости использования консоли
     * @return
     */
    public String getDescription() {
        switch (this) {
            case SPRING:
                return "Весна - пора пробуждения природы, средняя температура: " + averageTemperature + "°C.";
            case SUMMER:
                return "Лето - жаркая пора года, средняя температура: " + averageTemperature + "°C.";
            case AUTUMN:
                return "Осень - сезон сбора урожая и прохлады, средняя температура: " + averageTemperature + "°C.";
            case WINTER:
                return "Зима - холодное время года, средняя температура: " + averageTemperature + "°C.";
            default:
                return "Неизвестный сезон.";
        }
    }
}
