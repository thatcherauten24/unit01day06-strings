public class ShortLongShort {
    public static void main(String[] args) {

        String small = args[0];
        String big = args[1];
        String sbs = args[0];

        if(small.length() < big.length()){
            sbs = small + big + small;
            System.out.println(sbs);
        } else {
            sbs = big + small + big;
            System.out.println(sbs);
        }
    }
}