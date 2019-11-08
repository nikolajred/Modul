public class Task1Level1 {
    public int UniqNumber(int[] array) {
        if(array == null){
            return 0;
        }
        int[]tempArray = new int[array.length];
        int result = 0;
        int countEqual = 0;
        int counter = 0;

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (tempArray[i] == 0) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        tempArray[j] = 1;
                        counter++;
                    }
                }
            }
            if (countEqual < counter) {
                countEqual = counter;
                result++;
            }
        }
        System.out.println(result);
        return result;
    }

}
