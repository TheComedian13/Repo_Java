public class Question2 {
    static void arrayRemover(int y[], int x){
        for (int i : y[]){
            y[].remove(x);
            return y[];
        }
    }
    public static void main(String[]args){
        int[] numsOne = {32,14,24,98,24,56,148,24,78,24};
        int[] numTwo = {1,2,4,3,1,6,1};
        int[] numThree = {1,2,4,3,1,6,1};

        arrayRemover(numsOne, 24);
        arrayRemover(numTwo, 1);
        arrayRemover(numThree, 3);
    }
}

