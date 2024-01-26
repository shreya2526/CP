public class eleven{
    public static void main(String[] args) {
        int num=1994;
        System.out.println(intToString(num));
    }
    static String intToString(int num){
        String []r={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int []value={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder res=new StringBuilder();
        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                res.append(r[i]);
                num-=value[i];
            }
        }
        return res.toString();
    }
}