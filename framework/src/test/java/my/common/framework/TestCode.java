package my.common.framework;

public class TestCode {
    public static void main(String[] args){
        int[] inputArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int startPos = 3;
        int calValue = 0;
        for (int x = startPos-1 ; x <= inputArray.length-1 ; x++){
            calValue = calValue + inputArray[x];
        }
        for (int y = 0 ; y <= startPos-2 ; y++){
            calValue = calValue + inputArray[y];
        }
        System.out.println("Final Output :"+calValue);
    }
}
