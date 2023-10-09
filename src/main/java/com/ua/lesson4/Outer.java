package com.ua.lesson4;

//nested - static and non-static, inner - only non-static
class Outer {
    private int outerField;

    static class Nested {
        private int nestedField;

        public void nestedMethod() {
            // Доступ до поля nestedField
            System.out.println("nestedField: " + nestedField);
        }
    }

    class Inner {
        private int innerField;

        public void innerMethod() {
            // Доступ до поля innerField
            System.out.println("innerField: " + innerField);
        }
    }

    public void test() {
        Nested nested = new Nested();
        System.out.println(nested.nestedField);

        Inner inner = new Inner();
        System.out.println(inner.innerField);
    }
}
