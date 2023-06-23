import java.util.*;

public class First {
    public static void main(String[] args) {
        //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
        // и каждый из их узлов содержит одну цифру.
        // 1. Сложите два числа и верните сумму в виде связанного списка.
        // 2. Умножьте два числа и верните произведение в виде связанного списка.

        // Заводим 2 списка
        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new ArrayDeque<>();
        dq1.add(3);
        dq1.add(2);
        dq1.add(1);

        dq2.add(5);
        dq2.add(4);
        dq2.add(3);

        // через SB генерируем 2 числа
        StringBuilder sb1 = new StringBuilder();
        while (!dq1.isEmpty()){
            sb1.append(dq1.removeLast());
        }
        StringBuilder sb2 = new StringBuilder();
        while (!dq2.isEmpty()){
            sb2.append(dq2.removeLast());
        }
        // переводим SB в int
        int n1 = Integer.parseInt(sb1.toString());
        int n2 = Integer.parseInt(sb2.toString());
        int res = n2 * n1;
        Deque<Integer> over = new LinkedList<>();
        over.add(res);
        System.out.println(over);
        // в новом списке делаем разбиение по элементам
        List<Integer> resultList = new LinkedList<>();
        while (res > 0) {
            resultList.add(res % 10);
            res /= 10;
        }
        // реверсируем вывод
        Collections.reverse(resultList);
        System.out.println(resultList);

        // 2. Сумма
        int n3 = Integer.parseInt(sb1.toString());
        int n4 = Integer.parseInt(sb2.toString());
        int resSum = n2 + n1;
        Deque<Integer> overSum = new LinkedList<>();
        overSum.add(resSum);
        System.out.println(overSum);

        List<Integer> resList = new LinkedList<>();
        while (resSum > 0) {
            resList.add(resSum % 10);
            resSum /= 10;
        }
        Collections.reverse(resList);
        System.out.println(resList);

    }
}