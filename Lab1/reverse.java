public class reverse{
    public static void main(String[] args){
        int num = 2345;
        String revNum = Integer.toString(num);

        for(int i = revNum.length() - 1; i >= 0; i--){
            System.out.print(revNum.charAt(i));
        }

        int j = revNum.length() - 1;
        System.out.print("\n");
        while (j >= 0){
            System.out.print(revNum.charAt(j));
            j--;
        }

        int k = revNum.length();
        System.out.print("\n");
        do{
            k--;
            System.out.print(revNum.charAt(k));
        }
        while(k > 0);
    }
}