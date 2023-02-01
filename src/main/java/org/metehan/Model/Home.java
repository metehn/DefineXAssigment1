package org.metehan.Model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Home {

    float price;
    float m2;
    int roomType;

   //Evlerin toplam fiyatlarını dönen bir metot
    //Villaların toplam fiyatlarını dönen bir metot
    //Yazlıkların toplam fiyatlarını dönen metot
   // Tüm tipteki evlerin toplam fiyatını dönen metot

    //Evlerin ortalama metrekaresini dönen bir metot
    //Villaların ortalama metrekaresini dönen bir metot
   // Tüm tipteki evlerin ortalama metrekaresini dönen metot

   // Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot


    @Override
    public String toString() {
        return  "price=" + price +
                ", m2=" + m2 +
                ", roomType=" + roomType;
    }
}
