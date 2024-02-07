public class armstrong{
    public static void main(String[] args){
        int low = 200;
        int high = 2000;

        for(int i = low; i < high; i++){
            String num = Integer.toString(i);
            int length = num.length();
            double result = 0;

            for(int j = 0; j < length; j++){
                int n = Character.getNumericValue(num.charAt(j));
                result = result + Math.pow(n, 3);
            }

            if(result == i){
                System.out.println(num);
            }                       

        }
    }
}