package Miscellaneous;

public class PrintNumberWithoutLoop {
	public static void printNumbers(int start, int end) {  
        if (start <= end) {  
            System.out.print(start+"\t");  
            printNumbers(start + 1, end);  
        }  
    }  

	public static void main(String[] args) {

		int start = 1;  
        int end = 5;  
        System.out.println("Printing numbers from " + start + " to " + end + " using recursion:");  
        printNumbers(start, end); 	

	}
}
