package telran.homework.algorithms;


    public enum AlphabetSort {
        public static void main(String[] args) {
            String input = "poiuytrewqlkjhgfdsamnbvcxz";
            char[] charArray = input.toCharArray();

            // Использование быстрой сортировки для сортировки массива символов
            quickSort(charArray, 0, charArray.length - 1);

            // Преобразование отсортированного массива в строку и перевод в верхний регистр
            String sortedString = new String(charArray).toUpperCase();

            // Вывод отсортированной строки
            System.out.println(sortedString);
        }

        public static void quickSort(char[] array, int low, int high) {
            if (low < high) {
                int pi = partition(array, low, high);

                quickSort(array, low, pi - 1);
                quickSort(array, pi + 1, high);
            }
        }

        public static int partition(char[] array, int low, int high) {
            char pivot = array[high];
            int i = (low - 1);

            for (int j = low; j < high; j++) {
                if (array[j] < pivot) {
                    i++;
                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            char temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            return i + 1;
        }
    }

