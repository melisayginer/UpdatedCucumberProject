@deneme
Feature: Deneme senaryosu

  Scenario Outline: Deneme senaryosu
    Given Cerezler kabul edilir
    And <Urunler> ürününden <Alturunler> alttablara tiklanir
    And Ürünlere göz atın alanına tıklanır
 #   And Filtreleme alanından <Sıralama>,<Verimlilik Sınıfı>,<Tazelik> seçimleri yapılır -- Haftasonu fonksiyonu yazılacak
    And Filtreleme alanından seçim yapılır
    And İki ürün seçilip karşılaştırılır


    Examples:
      | Urunler                              | Alturunler                                    |
      | "Buzdolapları ve Derin Dondurucular" | "Ankastre Buzdolapları ve Derin Dondurucular" |
