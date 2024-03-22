//{ Driver Code Starts
    import java.util.Scanner;
    import java.lang.Math;
    
    class Convert_To_Five {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T > 0) {
                int N = sc.nextInt();
                System.out.println(new GfG().convertfive(N));
                T--;
            }
        }
    }
    // } Driver Code Ends
    
    
    class GfG {
        int convertfive(int num) {
            // Your code here
            int res = 0;
            int j = 0;
            int temp = 0;
            while (num > 0) {
                temp = num % 10;
                if (temp == 0){
                    res += 5 * Math.pow(10, j); 
                } else {
                    res += temp * Math.pow(10, j); 
                }
                num = num / 10;
                j++;
            }
            return res;
            
        }
    }