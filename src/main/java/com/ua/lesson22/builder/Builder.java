package com.ua.lesson22.builder;

// Продукт, який ми будуємо
class Product {
    private String part1;
    private String part2;

    void setPart1(String part1) {
        this.part1 = part1;
    }

    void setPart2(String part2) {
        this.part2 = part2;
    }

    void show() {
        System.out.println("Product: " + part1 + " " + part2);
    }
}

// Будівельник
interface Builder {
    void buildPart1();
    void buildPart2();
    Product getResult();
}

// Конкретний будівельник
class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("Part1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Part2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

// Директор
class Director {
    void construct(Builder builder) {
        builder.buildPart1();
        builder.buildPart2();
    }
}

