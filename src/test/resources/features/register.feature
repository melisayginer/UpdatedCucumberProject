@Register
Feature: Kullanici kayit senaryosu

  Scenario Outline: Kullanici kayit senaryosu
    Given Cerezler kabul edilir
    And My Brand ikonuna tiklanir
    And Kayit ola tiklanir
    And <ePosta> e posta girilir ve dogrulanir
    And <password> sifre girilir ve dogrulanir
    And <name> isim <surname> soyisim <phone> cep telefon girilir
    And <Tarih> dogum tarihi secilir
    Examples:
      | ePosta                   | password    | name    | surname | phone        | Tarih        |
      | "yavuzcicek@outlook.com" | "Adfc!1245" | "Yavuz" | "Cicek" | "5358745285" | "08.03.1995" |