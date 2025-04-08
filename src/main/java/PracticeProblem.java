public class PracticeProblem {

    public static int[] compareSearch(int[] array, int number) {
        int[] result = new int[2];
        
        result[0] = sequentialSearch(array, number);
     
        result[1] = binarySearch(array, number);
        
        return result;
    }


    public static int[] compareStringSearch(String[] array, String word) {
        int[] result = new int[2];
        
        result[0] = sequentialSearch(array, word);
        
        result[1] = binarySearch(array, word);
        
        return result;
    }


    private static int sequentialSearch(int[] array, int number) {
        int loops = 0;
        for (int i = 0; i < array.length; i++) {
            loops++;
            if (array[i] == number) {
                return loops;
            }
        }
        return loops;
    }

    private static int binarySearch(int[] array, int number) {
        int left = 0, right = array.length - 1;
        int loops = 0;
        
        while (left <= right) {
            loops++;
            int mid = left + (right - left) / 2;
            
            if (array[mid] == number) {
                return loops;
            }
            if (array[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return loops;
    }

 
    private static int sequentialSearch(String[] array, String word) {
        int loops = 0;
        for (int i = 0; i < array.length; i++) {
            loops++;
            if (array[i].equals(word)) {
                return loops;
            }
        }
        return loops;
    }

    private static int binarySearch(String[] array, String word) {
        int left = 0, right = array.length - 1;
        int loops = 0;
        
        while (left <= right) {
            loops++;
            int mid = left + (right - left) / 2;
            
            int comparison = array[mid].compareTo(word);
            if (comparison == 0) {
                return loops;
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return loops;
    }
	public static void main(String args[]){
	}
}

