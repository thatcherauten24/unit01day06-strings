public class ShortLongShort {
    public static void main(String[] args) {

        String small = args[0];
        String big = args[1];


        if(small.length() < big.length()){
            System.out.println(small + big + small);

        } else {
            System.out.println(big + small + big);
        }



    }
}
//commit