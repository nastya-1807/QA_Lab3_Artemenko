package com.company;

import java.util.Scanner;
/**
 * @brief Класс, представляющий совокупность нескольких элементов.
 */
public class Furniture {
    private String name;/**< Название мебели. */
    private FurniturePart part1, part2, part3;/**< Первый, второй и третий элемент. */
    private double assemblyCost;/**< Стоимость сборки. */
    /**
     * @brief Конструктор класса.
     */
    public Furniture() {
        this.name = "";
        this.part1 = new FurniturePart(0, 0.0);
        this.part2 = new FurniturePart(0, 0.0);
        this.part3 = new FurniturePart(0, 0.0);
        this.assemblyCost = 0.0;
    }
    /**
     * @brief Инициализация данных об элементах.
     * @param objectName Название мебели.
     * @param p1 Первый элемент.
     * @param p2 Второй элемент.
     * @param p3 Третий элемент.
     * @param assemblyCost Стоимость сборки.
     */
    public void init(String objectName, FurniturePart p1, FurniturePart p2, FurniturePart p3, double assemblyCost) {
        this.name = objectName;
        this.part1 = p1;
        this.part2 = p2;
        this.part3 = p3;
        this.assemblyCost = assemblyCost;
    }
    /**
     * @brief Считывание данных о мебели с клавиатуры.
     */
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя объекта: ");
        this.name = scanner.nextLine();

        System.out.print("Введите вес и цену за грамм для элемента 1: ");
        int weight1 = scanner.nextInt();
        double pricePerGram1 = scanner.nextDouble();
        this.part1 = new FurniturePart(weight1, pricePerGram1);

        System.out.print("Введите вес и цену за грамм для элемента 2: ");
        int weight2 = scanner.nextInt();
        double pricePerGram2 = scanner.nextDouble();
        this.part2 = new FurniturePart(weight2, pricePerGram2);

        System.out.print("Введите вес и цену за грамм для элемента 3: ");
        int weight3 = scanner.nextInt();
        double pricePerGram3 = scanner.nextDouble();
        this.part3 = new FurniturePart(weight3, pricePerGram3);

        System.out.print("Введите цену сборки: ");
        this.assemblyCost = scanner.nextDouble();
    }
    /**
     * @brief Вывод информации о мебели.
     */
    public void display() {
        System.out.println("Имя объекта: " + name);
        System.out.println("Элемент 1 - Вес: " + part1.getWeight() + ", Цена за грамм: " + part1.getPricePerGram());
        System.out.println("Элемент 2 - Вес: " + part2.getWeight() + ", Цена за грамм: " + part2.getPricePerGram());
        System.out.println("Элемент 3 - Вес: " + part3.getWeight() + ", Цена за грамм: " + part3.getPricePerGram());
        System.out.println("Стоимость сборки: " + assemblyCost);
        System.out.println("Общая стоимость: " + calculateTotalCost());
        System.out.println("Максимальная стоимость элемента: " + getMaxCostPart());
    }
    /**
     * @brief Вычисление общей стоимости мебели.
     * @return Общая стоимость.
     */
    private double calculateTotalCost() {
        return part1.calculateCost() + part2.calculateCost() + part3.calculateCost() + assemblyCost;
    }
    /**
     * @brief Вывод элемента с максимальной стоимостью.
     */
    private double getMaxCostPart() {
        double maxCost = part1.calculateCost();
        maxCost = Math.max(maxCost, part2.calculateCost());
        maxCost = Math.max(maxCost, part3.calculateCost());
        maxCost = Math.max(maxCost, assemblyCost);
        return maxCost;
    }
}
