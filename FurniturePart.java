package com.company;
/**
 * @brief Класс Часть мебели: является элементом, имеющим свою цену за грамм и вес.
 */
public class FurniturePart {
    private int weight;/**< Вес элемента. */
    private double pricePerGram;/**< Цена за грамм. */
    /**
     * @brief Конструктор класса.
     * @param weight Вес элемента.
     * @param pricePerGram Цена за грамм.
     */
    public FurniturePart(int weight, double pricePerGram) {
        this.weight = weight;
        this.pricePerGram = pricePerGram;
    }
    /**
     * @brief Вычисление общей стоимости элемента.
     * @return Общая стоиомсть элемента.
     */
    public double calculateCost() {
        return weight * pricePerGram;
    }
    /**
     * @brief Вывод веса элемента.
     * @return Вес элемента.
     */
    public int getWeight() {
        return weight;
    }
    /**
     * @brief Вывод цены  за грамм элемента.
     * @return Цена за грамм.
     */
    public double getPricePerGram() {
        return pricePerGram;
    }
}
