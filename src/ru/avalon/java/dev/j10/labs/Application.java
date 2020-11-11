package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {"David", "Maria", "Boris", "Mikhail",
                                "Zulu", "Limo", "Tango", "Charlie", 
                                "Bravo", "Alpha", "Sierra", "Delta",
                                "delta", "12345", "<>?{}", "Jerry",
                                "Omega", "omega", "oMEGA", "omega1"};

	    /*
	     * +++TODO(Студент): Проинициализируйте массив persons
	     *
	     * +++1. Создайте класс, реализующий интерфейс Person.
	     *
	     * +++2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Person[20];
            
            //инициализация в цикле рандомными значениями
            for (int i = 0; i < persons.length; i++) {
                Random random = new Random();
                int r = random.nextInt(10);
                String name = "Имя_" + i*r;
                Date date = new Date(r, r*2/3, i);
                persons[i] = new ExactPerson(name, date);    
            
            }
            //чтобы убедиться, что одинаковые имена - сортируется по старшинству:
            //два неслучайных Person:
            persons[15] = new ExactPerson("Adam", new Date(1, 5, 23));
            persons[18] = new ExactPerson("Adam", new Date(3, 10, 28));

        /*
         * +++TODO(Студент): Проинициализируйте переменную sort
         *
         * +++1. Создайте класс, реализующий интерфейс Sort
         *
         * +++2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new MySort();

        /*
         * +++TODO(Студент): Проинициализируйте переменную comparator
         *
         * +++1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * +++2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new MyComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        
         
        
        sort.sort(persons);
        //проверка
        System.out.println("sort.sort(persons): \n" + Arrays.toString(persons));

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        //проверка
        System.out.println("sort.sort(strings): \n" + Arrays.toString(strings));

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        //проверка
        System.out.println("sort.sort(strings, comparator): \n" + Arrays.toString(strings));
    }
}
