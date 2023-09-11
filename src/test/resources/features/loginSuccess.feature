@LoginSuccess
Feature: Login senaryosu

  Scenario: Basarili login senaryosu
    Given Cerezler kabul edilir
    And "senakorkmaz06@hotmail.com" ve "12Karakter!" ile giriş yapılır
    And Basarili giris sonrasi "Hoş geldiniz" yazisi kontrol edilir



