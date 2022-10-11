Feature: TC Verify Test Case
  Scenario: TC_07_Test_Cases

  Given Tarayıcıyı başlatarak "http://automationexercise.com" url'sine gidin
  Then Ana sayfanın başarıyla görünür olduğunu doğrulayın
  And Test Case buttonu na tıklayın
  Then Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın
  And İlgili sayfanın ekran görüntüsünü alın

    #And bizim step definitions içindeki methodları oluşturur
  #Ingilizce dilbilgisi mantığı ile hareket eder her türlü çalışır
  #Then gegelde assort yapıldığı yere konulur yani doğrulamadır
  #Given başta olur
  #And ve demek olduğu için gramere göre kullanılır
  #Given, giris kısmında, -verilen, gidilen vs  anlamında kullanılıyor,
  # Then assertion yani doğrulamalarda kullanıyoruz,
  # and tekrarlayanlarda kullanılıyor.  When zaman anlamında givenden sonra
  # bu -dığında, -dığı zaman anlamında.