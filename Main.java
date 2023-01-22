//Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable интерфейс. 
//Список должен содержать элементы со ссылкой на следующий элемент

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst("x");
        linkedList.addFirst("e");
        linkedList.addFirst("l");
        linkedList.addFirst("a");
        for (String item: linkedList) {
            System.out.println(item);
        }
        System.out.println("Первый элемент списка: " + linkedList.getFirst()); //вывод на печать первый элемент
        linkedList.removeFirst(); //удаление первого элемента
        System.out.println(linkedList); // вывод на печать списка после удаления




    }
}
