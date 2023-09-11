@Product
Feature: Urunler senaryosu

  Scenario Outline: Urunleri sepete ekleme senaryosu
    Given "Siemens" sayfasına gidilir
    And Cerezler kabul edilir
    And <Urunler> ürününden <Alturunler> alttablara tiklanir
    And Tum urunlere goz atin tabina tiklanir
    And Ilk urun sepete eklenir
    And Ucuncu urun sepete eklenir
    And Sepete gidilir
    And Urun sayisinin <Urunsayisi> oldugu gorulur
    And Sayfa kapatılır

    Examples:
      | Urunler                              | Alturunler                                    | Urunsayisi |
      | "Buzdolapları ve Derin Dondurucular" | "Ankastre Buzdolapları ve Derin Dondurucular" | "2"        |
#      | "Çamaşır & Kurutma Makineleri"       | "Çamaşır Makineleri"                          | "2"        |
#      | "Bulaşık Makineleri"                 | "Ankastre Bulaşık Makineleri"                 |
#      | "Pişirme Grubu"                      | "Ankastre Setler"                             |
