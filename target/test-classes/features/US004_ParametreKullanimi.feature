Feature: US004 Parametre Kullanimi
  Scenario:TC01 Parametre Kullanimi
    Given kullanici "https://www.trendyol.com" sayfasinda
    Then kullanici 3 saniye bekler
    When Url'in 'trend' icerdigini test edelim
    And sayfayi kapatir