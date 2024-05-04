package com.company;
/**
 * @brief Главный класс программы.
 */
public class Main {
    /**
     * @brief Точка входа в программу.
     * @param args Аргументы командной строки.
     * \image html divan.png width=400cm
     * \f[
     * |I_2|=\left| \int_{0}^T \psi(t)
     * \left\{
     * u(a,t)-
     * \int_{\gamma(t)}^a
     * \frac{d\theta}{k(\theta,t)}
     * \int_{a}^\theta c(\xi)u_t(\xi,t)\,d\xi
     * \right\} dt
     * \right|
     * \f]
     *
     */
    public static void main(String[] args) {
        // Создание объекта класса Furniture
        Furniture furniture = new Furniture();
        // Вывод образца заполнения мебели
        furniture.init("Образец мебели", new FurniturePart(100, 0.2), new FurniturePart(150, 0.15), new FurniturePart(120, 0.18), 50.0);
        furniture.display();
        // Ввод данных для сборки мебели
        System.out.println("\nВведите детали для нового объекта мебели:");
        furniture.read();
        // Вывод всех данных о мебели
        System.out.println("\nДетали для нового объекта мебели:");
        furniture.display();
    }
}
