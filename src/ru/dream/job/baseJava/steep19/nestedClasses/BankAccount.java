package ru.dream.job.baseJava.steep19.nestedClasses;

import jdk.jfr.DataAmount;

public class BankAccount {

    private double score = 50.036;

    public class SberOnline {
        public double replenish(double amount) {
            if (score >= amount) {
                score = score - amount;

                return score;
            } else {
                throw new IllegalArgumentException("Денег не хватает");
            }
        }

        public void replenishment(double amount) {
            score = score + amount;
        }

        public double scoreBalance() {

            return score;
        }
    }
}
