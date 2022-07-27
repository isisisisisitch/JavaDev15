package ca.bytetube._15_enum;

public class Test {

    public static void main(String[] args) {

        SeasonClass season = getSeason();
        String date = "Mon";
//        switch (season){
//            case Season.SPRING:
//                //
//                break;
//            case  Season.SUMMER:
//                //
//                break;
//        }

        if (season == SeasonClass.SPRING) {
            System.out.println("spr.");
        } else if (season == SeasonClass.SUMMER) {
            System.out.println("Sum.");
        }else if (season == SeasonClass.FALL) {
            System.out.println("Aaut.");
        }else {
            System.out.println("Win.");
        }

    }


    public static SeasonClass getSeason(){
        return null;
    }
}
