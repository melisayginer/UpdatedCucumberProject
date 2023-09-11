@LoginFailed
Feature: Hatali login senaryosu

  Scenario Outline: Hatali login senaryosu
    Given Cerezler kabul edilir
#    And "username" ve "password" giriş yapılır
    And Login sayfasina gidilir
    And <username> ve <password> ile giriş yapılır
    And Basarisiz giris sonrasi <mesaj> yazisi kontrol edilir
    Examples:
      | username                    | password          | mesaj                                                           |
      | "senakorkmaz06@hotmail.com" | "hatasizkodolmaz" | "Verilen kullanıcı adı ve şifre ile bilinen bir kullanıcı yok." |
      | ""                          | "hatasizkodolmaz" | "Lütfen bu alanı doldurunuz."                                   |