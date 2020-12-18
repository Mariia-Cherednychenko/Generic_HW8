package ua.ithlillel.dnipro.Cherednychenko;

public class ExampleClass {
    int exampleNumber;
    String exampleString;

    public ExampleClass(int exampleNumber, String exampleString) {
        this.exampleNumber = exampleNumber;
        this.exampleString = exampleString;
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "exampleNumber=" + exampleNumber +
                ", exampleString='" + exampleString + '\'' +
                '}';
    }
}
