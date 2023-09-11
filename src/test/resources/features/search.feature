@Search
Feature: Arama senaryosu

  Scenario Outline: Arama senaryosu
    Given Cerezler kabul edilir
    And Arama iconuna tiklanir
    And Arama kutusuna <Urun adi> yazilir ve entera basilir
    And Arama sonucu başlığı <Urun adi> ile kontrol edilir
    And İlk ürünün detayına gidilir
    Examples:
      | Urun adi |
      | "Çamaşır Makinesi" |