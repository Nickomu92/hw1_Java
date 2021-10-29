package exercise3.nikomu;

// Класс для представляющий сущность ёлочка
public class TreeBuilder {
    int height;     // Поле (переменная класса) для хранения высоты верхнего яруса
    int count;      // Поле для хранения количества ярусов

    // Конструктор
    public TreeBuilder(int count, int height) {
        this.height = height;
        this.count = count;
    }

    // Метод для отображения ёлочки
    public void ShowTree() {
        // Переменная для хранения значения максимальной ширины ёлочки
        int treeWidth = 2 * (this.height + this.count - 2) + 1;

        // Цикл для создания всех ярусов ёлочки
        for (int i = 0; i < this.count; i++) {
            // Цикл для создания каждого яруса (отвечает за строки)
            for (int j = 0; j < this.height + i; j++) {
                // Цикл для создания столбцов в строке
                for (int k = 0; k < treeWidth; k++) {
                    // Переменная для хранения "координаты" середины (оси симметрии) ёлочки
                    int middle = treeWidth / 2;
                    // Прорисовка ёлочки
                    // Если текущая "координата" представляет контур елки, то отображаем "*" + "пробел"
                    if (k >= middle - j && k <= middle + j) {
                        System.out.print("*" + " ");
                    }
                    // Иначе - 2 х "пробел"
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
