package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Runner class ini aktive ediyor
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@All", // iki tag'i ayni anda calistirmak isterseniz "@gp1 or @gp2"
        dryRun = false

)

public class Runner {
    /*
      Runner class'i TestNG'deki XML mantigi ile calisir.Calistirmak istedigimiz senaryolara tag belirtiriz
    ve belirttigimiz tag'lari calistirir.XML'deki gibi istedigimiz testleri calistirmak icin kullaniriz.
    Runner class body'si bostur ve runner class'ini ekleyecegimiz notasyonlar aktive eder.
      Bu class'ta kullanacagimiz iki adet notasyon vardir.
      -@RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi ekler.
      Bu notasyon oldugu icin Cucumber frameworkumuzde Junit kullanmayi tercih ederiz.
      -@CucumberOptions notasyonu icinde
      features  : Runner dosyasinin feature dosyasini nereden bulacagini tarif eder
      glue      : StepDefinitions yolunu belirtiriz.
      tags      : Hangi tag'i calistirmak istiyorsak onu belli eder.

      dryRun    : İki secenek vardir
      dryRun    = true; dersek testimizi calistirmadan eksik adimlari bize verir.
      dryRun    = false,testlerimizi driver ile calistirir.
     */

}
