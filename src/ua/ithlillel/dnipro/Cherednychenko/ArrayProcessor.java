package ua.ithlillel.dnipro.Cherednychenko;

public class ArrayProcessor <T> {
    private T [] array;

    public  ArrayProcessor(T[] array) {
        this.array = array;
    }

    public void process(ElementProcessor <T> element){
        for (T arrayElement:array){
            element.run(arrayElement);
        }
    }
}
