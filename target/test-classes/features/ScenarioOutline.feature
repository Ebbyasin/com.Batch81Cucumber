Feature: US007 Scenario Outline Kullanimi


  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given kullanici "<arananUrl>" sayfasina gider
    Then kullanici 3  saniye bekler
    When url'in "<arananKelime>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | amznUrl | arananKelime |
      | faceUrl | arananKelime |
      | hmcUrl= | arananKelime |
      | brcUrl= | arananKelime |
      | google= | arananKelime |
      |  | arananKelime |