
Feature: Ürünler tabı kontrolü

  Scenario Outline: Ürünler tabı kontrolü
    Given Cerezler kabul edilir
    And <Urunler> ürününden <Alturunler> alttablara tiklanir

    Examples:
      | Urunler                              | Alturunler                                                                                                |
      | "Buzdolapları ve Derin Dondurucular" | "Ankastre Buzdolapları ve Derin Dondurucular%%%Solo Buzdolapları ve Derin Dondurucular%%%Şarap Dolapları"     |
      | "Çamaşır & Kurutma Makineleri"       | "Çamaşır Makineleri%%%Kurutma Makineleri%%%Kurutmalı Çamaşır Makineleri%%%Çamaşır Makinesi Ürün Seçim Asistanı" |
#      | "Bulaşık Makineleri"                 |                                                                                                                       |
#      | "Pişirme Grubu"                      |                                                                                                                       |
#      | "Ankastre"                           |                                                                                                                       |
#      | "Elektrikli Süpürgeler"              |                                                                                                                       |
#      | "Kahve Makineleri"                   |                                                                                                                       |
#      | "Mutfak Aletleri"                    |                                                                                                                       |
#      | "Klimalar"                           |                                                                                                                       |
#      | "Su Isıtma Grubu"                    |                                                                                                                       |
#      | "Su Sebilleri"                       |                                                                                                                       |
#      | "Temizlik ve Bakım Ürünleri"         |                                                                                                                       |
#      | "Aksesuarlar"                        |                                                                                                                       |
#      | "Kampanyalı Ürünler"                 |                                                                                                                       |
#      | "Home Connect Ürünler"               |                                                                                                                       |