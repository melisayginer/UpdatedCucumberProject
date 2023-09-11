@Basket
  Feature: Urun ekleyip cıkarma senaryosu
    Scenario: Urun ekleyip cıkarma senaryosu
      Given Cerezler kabul edilir
      And Camasir makinesi urunu sepete eklenir
      And Sepete gidilir
      And Urun sayisinin "1" oldugu kontrol edilir
      And Urunun sayisi arttirilir
      And Urun sayisinin "2" oldugu kontrol edilir
      And Urunun sayisi arttirilir
      And Urun sayisinin "3" oldugu kontrol edilir
      And Urunun sayisi azaltilir
      And Urun sayisinin "2" oldugu kontrol edilir
      And Urun sayisi "5" olarak guncellenir
      And Urun sayisinin "5" oldugu kontrol edilir
      And Urunun sepetten silinir
      And Sepetin bos oldugu "Alışveriş sepetiniz boş" yazisi ile kontrol edilir
