Feature: Parametre Kullanimi
  @gp1
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given kulanici "faceUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'in "facebook" icerdigini test edelim
    And sayfayi kapatir

    @gp2
  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given kulanici "google" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'in "google" icerdigini test edelim
    And sayfayi kapatir

      @gp1
  Scenario: TC03 Parametre kullaniminda ConfigReader Kullanimi
    Given kulanici "brcUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'in "blue" icerdigini test edelim
    And sayfayi kapatir

        @gp2
  Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
    Given kulanici "amznUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'in "amazon" icerdigini test edelim
    And sayfayi kapatir




