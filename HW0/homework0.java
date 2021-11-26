public class homework0{
    public static void DrawTriangle(int x){
        for(int i = 1; i <= x; i ++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int len = m.length;
        int maxnum = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            if(m[i] > maxnum){
                maxnum = m[i];
            }
        }
        return maxnum;
    }

    /** BreakContinue */
    public static void windowPosSum(int[] a, int n) {
        /**replaces each element a[i] with the sum of a[i] through a[i + n]
         * but only if a[i] is positive valued */
        int len = a.length;
        for(int i = 0; i < len; i++){
            if(a[i] <= 0){
                continue;
            }else{
                int sum = 0;
                for(int j = 0; j < n; j++){
                    if(i+j < len){
                        sum += a[i+j];
                    }
                    else{
                        break;
                    }
                }
                a[i] = sum;
            }     
        }
      }
    

    public static void main(String[] args) {
        System.out.println("----------1----------");
        DrawTriangle(10);

        System.out.println("----------2/3--------");
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println("maximum value from m:" + max(numbers));

        System.out.println("----------4----------");
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 4;
        windowPosSum(a, n);
        // Should print 4, 8, -3, 13, 9, 4 when n = 4
        System.out.println(java.util.Arrays.toString(a));
    }
}