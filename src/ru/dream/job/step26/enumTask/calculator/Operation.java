package ru.dream.job.step26.enumTask.calculator;

public enum Operation {

    ADD {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public double apply(double x, double y) {
            if (y == 0) {
                throw new ArithmeticException("Деление на ноль невозможно");
            }
            return x / y;
        }
    };

    public abstract double apply(double x, double y);
}
