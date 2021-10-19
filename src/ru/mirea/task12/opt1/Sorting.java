package ru.mirea.task12.opt1;

public class Sorting {
    public static void InsertionSorting(Student[] array){
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            Student value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.getId() < array[i].getId()) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
//System.out.println(Arrays.toString(array));
    }
}
