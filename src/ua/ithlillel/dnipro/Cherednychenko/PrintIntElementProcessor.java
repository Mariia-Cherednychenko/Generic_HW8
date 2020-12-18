package ua.ithlillel.dnipro.Cherednychenko;

public class PrintIntElementProcessor <T> implements ElementProcessor<T> {
    @Override
    public void run(T element) {
        System.out.println(element);
    }
}
