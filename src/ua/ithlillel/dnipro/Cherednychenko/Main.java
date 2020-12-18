package ua.ithlillel.dnipro.Cherednychenko;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3};
        ElementProcessor<Integer> elementProcessor = new PrintIntElementProcessor();
        ArrayProcessor<Integer> processor = new ArrayProcessor<>(arr);
        processor.process(elementProcessor);


        String[] arrString = new String[]{"A", "B", "C"};
        ElementProcessor<String> elementProcessorString = new PrintIntElementProcessor();
        ArrayProcessor<String> processorString = new ArrayProcessor<>(arrString);
        processorString.process(elementProcessorString);


        ExampleClass[] arrExample = new ExampleClass[]
                {new ExampleClass(1, "Start"),
                new ExampleClass(2, "Process"),
                new ExampleClass(3, "Finish")};
        ElementProcessor<ExampleClass> elementProcessorExample = new PrintIntElementProcessor();
        ArrayProcessor<ExampleClass> processorExample = new ArrayProcessor<>(arrExample);
        processorExample.process(elementProcessorExample);

    }
    }
