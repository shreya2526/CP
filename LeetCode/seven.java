// public class seven {
//     public static void main(String[] args) {

//     }

//     public String convert(String s, int numRows) {
//         char word[]=s.toCharArray();
//         for(int i =0;i<numRows;i++){
//             for(int j =0;j<;)
//         }
//     }
// }

public class seven {
    public static void main(String[] args) {
        int count = 14;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (count > 0) {
                    if (i % 2 == 0) {
                        if (j % 2 == 0){
                            System.out.print("*" + " ");
                            count--;
                        }
                        else
                            System.out.print("  ");
                    } else {
                        System.out.print("*" + " ");
                        count--;
                    }
                }

            }
            System.out.println();
        }
    }
}
