public class Testliu {
    public static void main(String[] args) {
        int[] a = {32, 132, 421, 42, 52, 6, 2};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]<a[j+1]){
                    int temp=0;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            System.out.print(a[i]+" ");
        }
     String[] str = new String[4];
        str[0] = "aa";
        str[1] = "bb";
        str[2] = "cc";
        System.out.println("str.length = " + str.length);

        for (int i = 0; i < 5;i++) {
            if(i == 3){
//                continue;
                break;
            }
            System.out.println(i);
        }
for (int j=0;j<5;j++) {
    for (int k = 5; k >=5-j; k--) {
        if (k==5){
            System.out.print("  ");
        }
//        System.out.print("    ");
        System.out.print("*");
    }
    System.out.println("");
}

    }

}