import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(), a, b, n;
        for(int i = 0; i < t; i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            System.out.print((a=a+b) +" ");
            for (int j = 0; j < n-1; j++) {
                System.out.printf("%d ", (a = a + (b = 2 * b)));
            }
            System.out.println();
        }
        in.close();
    }
  
  
  
Input (stdin)
2
0 2 10
5 3 5
  
Output(stdout)
2 6 14 30 62 126 254 510 1022 2046 
8 14 26 50 98 
