package level07.lecture01;

/**
 * Created by Kgrebenyuk on 04.02.2019.
 */
public class lecture01 {

//1) Java массив состоит из множества ячеек.
//
//2) Доступ к конкретной ячейке идёт через указание её номера.
//
//3) Все ячейки одного типа.
//
//4) Начальное значение для всех ячеек – null, для примитивных типов – 0, 0.0 (для дробных), false (для типа boolean).
//    Точно такое же, как и у простых неинициализированных переменных.
//
//5) String[] list — это просто объявление переменной. Сначала нужно создать массив (контейнер) и положить его в эту переменную,
//    а потом уже им пользоваться. См. пример ниже.
//
//6) Когда мы создаём объект массив (контейнер), нужно указать, какой он длины – сколько в нем ячеек. Это делается командой вида: new TypeName[n];



    public static void main(String[] args){

        String[] list = new String[5];	//Создание массива на 5 элементов типа «строка»
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);
        System.out.println(list[4]);	//На экран будет выведено пять значений “null”.
       // Чтобы получить значение, которое хранится в определенной ячейке массива, используйте квадратные скобки и номер ячейки

        int listCount = list.length; //получит значение 5 – количество ячеек в массиве  length хранит длину(количество ячеек) массива.

        list[1] = "Mama";
        String s = list[1];

        System.out.println(s);

        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }

        int [ ] a = new int[100];
        for (int i = 0; i < 100; i++)
            a[i] = i; // Заполняет массив числами от 0 до 99

        //for (int i = 0; i < a.length; i++, System.out.println (a[i])); //exception OUT OF ARRAY


        /*создают два массива, а затем копируют последние четыре элемента первого массива во второй.
        Копирование начинается со второй позиции в исходном массиве, а копируемые элементы помещаются в целевой массив, начиная с третьей позиции.*/
        int[] smailPrimes = {2, 3, 5, 7, 11, 13};
        int[] luckyNumbers = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        System.arraycopy(smailPrimes, 2, luckyNumbers, 3, 4);
        for (int i = 0; i < luckyNumbers.length; i++)
            System.out.println(i + ": " + luckyNumbers[i]);
    }

}
