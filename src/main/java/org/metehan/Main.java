package org.metehan;

import org.metehan.Model.Flat;
import org.metehan.Model.Home;
import org.metehan.Model.SummerHouse;
import org.metehan.Model.Villa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {


    static ArrayList<Flat> flatList = new ArrayList<>();
    static ArrayList<Villa> villaList = new ArrayList<>();
    static ArrayList<SummerHouse> summerHouseList = new ArrayList<>();

    public static void main(String[] args) {

        //Defining objects

        //Flat flat1 = (Flat) Home.builder().price(330000f).m2(80f).roomType(3).build();
        // flat2 = (Flat) Flat.builder().price(681000f).m2(120f).roomType(4).build();
        //Flat flat3 = (Flat) Flat.builder().price(500000f).m2(130f).roomType(4).build();
        Flat flat1 = (Flat) new Flat(330000f, 80f,3);
        Flat flat2 = (Flat) new Flat(681000f, 120f, 4);
        Flat flat3 = (Flat) new Flat(500000f, 130f, 4);

        flatList.add(flat1);
        flatList.add(flat2);
        flatList.add(flat3);


        //Villa villa1 = (Villa) Villa.builder().price(1000000f).m2(220).roomType(6).build();
        //Villa villa2 = (Villa) Villa.builder().price(910000f).m2(180).roomType(5).build();
        //Villa villa3 = (Villa) Villa.builder().price(1700000f).m2(300).roomType(6).build();
        Villa villa1 = (Villa) new Villa(1000000f, 220, 6);
        Villa villa2 = (Villa) new Villa(910000f, 180, 5);
        Villa villa3 = (Villa) new Villa(1700000f, 300, 6);

        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);


        //SummerHouse summerHouse1 = (SummerHouse) SummerHouse.builder().price(700000f).m2(110f).roomType(4).build();
        //SummerHouse summerHouse2 = (SummerHouse) SummerHouse.builder().price(340100f).m2(70f).roomType(3).build();
        //SummerHouse summerHouse3 = (SummerHouse) SummerHouse.builder().price(502000f).m2(110f).roomType(4).build();
        SummerHouse summerHouse1 = (SummerHouse) new SummerHouse(700000f, 110f, 4);
        SummerHouse summerHouse2 = (SummerHouse) new SummerHouse(340100f, 70f, 3);
        SummerHouse summerHouse3 = (SummerHouse) new SummerHouse(502000f, 110f, 4);
        summerHouseList.add(summerHouse1);
        summerHouseList.add(summerHouse2);
        summerHouseList.add(summerHouse3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1-Evlerin toplam fiyatlar??n?? d??nen bir metot\n" +
                "2-Villalar??n toplam fiyatlar??n?? d??nen bir metot\n" +
                "3-Yazl??klar??n toplam fiyatlar??n?? d??nen metot\n" +
                "4-T??m tipteki evlerin toplam fiyat??n?? d??nen metot\n" +
                "5-Evlerin ortalama metrekaresini d??nen bir metot\n" +
                "6-Villalar??n ortalama metrekaresini d??nen bir metot\n" +
                "7-Yazl??klar??n ortalama metrekaresini d??nen metot\n" +
                "8-T??m tipteki evlerin ortalama metrekaresini d??nen metot\n" +
                "9-Oda ve salon say??s??na g??re t??m tipteki evleri filtreleyip d??nen metot\n");

        while(true){

            int input = scanner.nextInt();

            try {
                switch (input) {

                    case 1:
                        System.out.println( "\t" + getTotalFlatPrice() );
                        break;

                    case 2:
                        System.out.println( "\t" + getTotalVillaPrice() );
                        break;

                    case 3:
                        System.out.println( "\t" + getTotalSummerHousePrice() );
                        break;

                    case 4:
                        System.out.println( "\t" + getAllHousesPrice() );
                        break;

                    case 5:
                        System.out.println( "\t" + getAvgFlatM2() );
                        break;

                    case 6:
                        System.out.println( "\t" + getAvgVillaM2() );
                        break;

                    case 7:
                        System.out.println( "\t" + getAvgSummerHouseM2() );
                        break;

                    case 8:
                        System.out.println( "\t" + getAvgAllHouseM2() );
                        break;

                    case 9:
                        for(Home h : FilterByRoomType()){

                            System.out.println("\t" + (h.getClass()== Flat.class ? "Flat " + h.toString() : h.getClass()== Villa.class? "Villa "
                                    + h.toString(): "Summer House " + h.toString() ) );

                        }
                        break;
                    default:

                        System.out.println("L??tfen 1 ve 9 aras??nda bir say?? girin!");
                        break;

                }


            } catch (Error e) {
                System.out.println(e.getLocalizedMessage());
            }

        }




    }


    //Evlerin toplam fiyatlar??n?? d??nen bir metot
    public static float getTotalFlatPrice() {

        float total = 0f;

        try {
            if (flatList != null && !flatList.isEmpty()) {

                for (Flat f : flatList) {

                    total += f.getPrice();
                }

            } else {
                return total;
            }

        } catch (Error e) {

            System.out.println(e.getLocalizedMessage());
        }

        return total;
    }

    //Villalar??n toplam fiyatlar??n?? d??nen bir metot
    public static float getTotalVillaPrice() {

        float total = 0f;

        try {
            if (villaList != null && !villaList.isEmpty()) {

                for (Villa v : villaList) {

                    total += v.getPrice();
                }

            } else {
                return total;
            }

        } catch (Error e) {

            System.out.println(e.getLocalizedMessage());
        }

        return total;
    }

    //Yazl??klar??n toplam fiyatlar??n?? d??nen metot
    public static float getTotalSummerHousePrice() {

        float total = 0f;

        try {
            if (summerHouseList != null && !summerHouseList.isEmpty()) {

                for (SummerHouse s : summerHouseList) {

                    total += s.getPrice();
                }

            } else {
                return total;
            }

        } catch (Error e) {

            System.out.println(e.getLocalizedMessage());
        }

        return total;
    }

    //T??m tipteki evlerin toplam fiyat??n?? d??nen metot
    public static float getAllHousesPrice() {

        float total = 0f;

        try {
            if (flatList != null && !flatList.isEmpty()) {

                for (Flat f : flatList) {

                    total += f.getPrice();
                }

            }
            if (villaList != null && !villaList.isEmpty()) {

                for (Villa v : villaList) {

                    total += v.getPrice();
                }

            }
            if (summerHouseList != null && !summerHouseList.isEmpty()) {

                for (SummerHouse s : summerHouseList) {

                    total += s.getPrice();
                }

            }

        } catch (Error e) {

            System.out.println(e.getLocalizedMessage());
        }

        return total;


    }

    //Evlerin ortalama metrekaresini d??nen bir metot
    public static float getAvgFlatM2() {

        float total = 0f;
        float avg = 0f;
        try {
            if (flatList != null && !flatList.isEmpty()) {

                for (Flat f : flatList) {

                    total += f.getPrice();
                }
                avg = total / flatList.size();
            }

        } catch (Error e) {

            System.out.println(e.getLocalizedMessage());
        }
        return avg;
    }

    //Villalar??n ortalama metrekaresini d??nen bir metot
    public static float getAvgVillaM2() {

        float total = 0f;
        float avg = 0f;
        try {
            if (villaList != null && !villaList.isEmpty()) {

                for (Villa v : villaList) {

                    total += v.getPrice();
                }
                avg = total / villaList.size();
            }

        } catch (Error e) {

            System.out.println(e.getLocalizedMessage());
        }
        return avg;
    }

    //Yazl??klar??n ortalama metrekaresini d??nen metot
    public static float getAvgSummerHouseM2() {

        float total = 0f;
        float avg = 0f;
        try {
            if (summerHouseList != null && !summerHouseList.isEmpty()) {

                for (SummerHouse s : summerHouseList) {

                    total += s.getPrice();
                }
                avg = total / summerHouseList.size();
            }

        } catch (Error e) {

            System.out.println(e.getLocalizedMessage());
        }
        return avg;
    }

    //T??m tipteki evlerin ortalama metrekaresini d??nen metot
    public static float getAvgAllHouseM2() {

        float total = 0f;
        float avg = 0f;
        int count = 0;
        try {
            if (flatList != null && !flatList.isEmpty()) {

                for (Flat f : flatList) {

                    total += f.getPrice();
                }
                count += flatList.size();
            }
            if (villaList != null && !villaList.isEmpty()) {

                for (Villa v : villaList) {

                    total += v.getPrice();
                }
                count += villaList.size();
            }
            if (summerHouseList != null && !summerHouseList.isEmpty()) {

                for (SummerHouse s : summerHouseList) {

                    total += s.getPrice();
                }
                count += summerHouseList.size();
            }

            avg = total / count;

        } catch (Error e) {

            System.out.println(e.getLocalizedMessage());
        }
        return avg;

    }

    //Oda ve salon say??s??na g??re t??m tipteki evleri filtreleyip d??nen metot
    public static ArrayList<Home> FilterByRoomType() {
        ArrayList<Home> temp = new ArrayList<>();
        temp.addAll(flatList);
        temp.addAll(villaList);
        temp.addAll(summerHouseList);

        // Collections.sort(temp, Comparator.comparingInt(Item::getId));
        Collections.sort(temp, new SortbyRoomType());

        return temp;
    }

   static class SortbyRoomType implements Comparator<Home> {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Home a, Home b) {
            return a.getRoomType() - b.getRoomType();
        }
    }
}
