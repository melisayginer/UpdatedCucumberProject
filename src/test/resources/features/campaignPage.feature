@Campaign
Feature: Kampanya sayfası senaryosu

  Scenario: Urunlerin odeme sayfasi kontrol edilir
    Given Cerezler kabul edilir
    And Kampanyalar tabina tiklanir
    And Kampanya detay sayfasina gidilir
    And Sepete eklenir
    And Sepete gidilir
    And Urun sayisinin "1" oldugu kontrol edilir

