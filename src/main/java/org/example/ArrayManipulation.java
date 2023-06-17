package org.example;

public class ArrayManipulation {
    public static int[] array(int[] array) {
        int lastFourIndex = -1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                lastFourIndex = i;
                break;
            }
        }

        if (lastFourIndex == -1) {
            throw new RuntimeException("Масив не містить жодної четвірки.");
        }

        int[] extractedArray = new int[array.length - lastFourIndex - 1];
        for (int i = lastFourIndex + 1, j = 0; i < array.length; i++, j++) {
            extractedArray[j] = array[i];

        }
        return extractedArray;
    }


    public static boolean checkArray(int[] numbers) {
        boolean numberOne = false;
        boolean numberFour = false;

        for (int i : numbers) {
            if(i == 1) {
                numberOne = true;
                
            } else if (i == 4) {
                numberFour = true;
                
            }
        }
        return numberOne && numberFour;

    }

}
