package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaveArrayListOfDoubles {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<Double>() {{
            addAll(Arrays.asList(5.3, 36.52, 11.23, 4.1, 0.14, 23.6, 56.9));
        }};

        doublesNumSave(doubles);
        doublesLoad(doubles.size());
    }
    public static void doublesNumSave(List<Double> doubles) {
        try(ObjectOutputStream destination = new ObjectOutputStream(new FileOutputStream("res/doubles.list"))) {
            for (Double aDouble : doubles) {
                destination.writeDouble(aDouble);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doublesLoad(int numOfItems) {
        try(ObjectInputStream source = new ObjectInputStream(new FileInputStream("res/doubles.list"))) {
            for (int i = 0; i < numOfItems; i++) {
                System.out.println(source.readDouble());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
