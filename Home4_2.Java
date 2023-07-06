// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class QueueUsingLinkedList<T> {
    LinkedList<T> queue;

    public QueueUsingLinkedList() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        return queue.pollFirst();
    }

    public T first() {
        return queue.peekFirst();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList<String> queue = new QueueUsingLinkedList<>();

        // Добавляем элементы в очередь
        queue.enqueue("Элемент 1");
        queue.enqueue("Элемент 2");
        queue.enqueue("Элемент 3");

        // Выводим первый элемент
        System.out.println("Первый элемент: " + queue.first());

        // Удаляем и выводим первый элемент
        String dequeuedElement = queue.dequeue();
        System.out.println("Удален первый элемент: " + dequeuedElement);

        // Выводим первый элемент
        System.out.println("Первый элемент: " + queue.first());
    }
}
