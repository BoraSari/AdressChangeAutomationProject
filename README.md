N11 Address Change Automation Project
Project Overview
This project provides an automated test suite for verifying the address change functionality on the N11 e-commerce website. It focuses on simulating user actions to modify delivery addresses and then validating location-specific advantage messages or offers that appear based on the new address. Developed using Java, Selenium WebDriver, and TestNG, it adheres to the Page Object Model (POM) for structured and maintainable test code.

Project Goal
The main objectives of this project are to:

Automate the navigation to the address management section on N11.

Simulate the process of adding, editing, or selecting a different delivery address.

Verify that location-specific advantage messages or promotions are correctly displayed after an address change.

Ensure the address update process is robust and accurately reflects changes in the UI.

Showcase proficiency in Java, Selenium WebDriver, and TestNG for e-commerce test automation, with a specific focus on user profile management and dynamic content validation.

Technologies Used
Programming Language: Java

Test Automation Framework: Selenium WebDriver

Testing Framework: TestNG

Design Pattern: Page Object Model (POM)

Setup and Run Instructions
To set up and run this project locally, follow these steps:

Clone the Repository:

git clone https://github.com/BoraSari/AdressChangeAutomationProject.git
cd AdressChangeAutomationProject

(Note: Replace BoraSari with your actual GitHub username if different. Adjust the repository name if it's different in your actual GitHub setup.)

Prerequisites:

Ensure Java Development Kit (JDK) 8 or higher is installed.

Have Maven (or Gradle) installed and configured for dependency management.

Download the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver) for your browser and ensure it's accessible by your test environment (e.g., via WebDriverManager or system PATH).

Ensure BaseTest class correctly initializes the WebDriver.

Build the Project:

mvn clean install

(If using Gradle, replace mvn commands with gradle commands.)

Run the Tests:
Tests are configured with TestNG. You can run them via a TestNG XML suite or directly from your IDE (e.g., IntelliJ IDEA, Eclipse).

Example testng.xml:

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="N11 Address Change Test Suite">
    <test name="Address Change Tests">
        <classes>
            <class name="N11Tests.N11Tests"/> <!-- Replace with your actual test class name if different -->
        </classes>
    </test>
</suite>

Run with Maven:

mvn test -DsuiteXmlFile=testng.xml

Or run directly from your IDE.

Test Coverage and Scenarios
This project covers the following key scenarios for N11's address change functionality:

Address Change and Advantage Message Verification:

Description: Automates the process of changing a user's delivery address on N11 and verifies that any location-specific advantage messages or offers are displayed correctly.

Flow: Navigates to the address management section, performs an address change (e.g., selecting a new address or entering new details), and asserts that the expected advantage message (e.g., "Konuma Özel Avantajlar" - Location Specific Advantages) is visible and accurate.

Screenshots/GIFs
(Lütfen buraya test yürütmesini, adres değiştirme ekranını ve konum özel avantaj mesajlarının görüntülendiği ekranları gösteren ekran görüntüleri veya GIF'ler ekleyerek projenin işlevselliğini görsel olarak sergileyin.)

License
This project is licensed under the MIT License - see the LICENSE file for details.

N11 Adres Değişikliği Otomasyon Projesi
Projeye Genel Bakış
Bu proje, N11 e-ticaret web sitesindeki adres değiştirme işlevselliğini doğrulamak için otomatik bir test paketi sunar. Teslimat adreslerini değiştirmek için kullanıcı eylemlerini simüle etmeye ve yeni adrese göre görünen konuma özel avantaj mesajlarını veya tekliflerini doğrulamaya odaklanır. Java, Selenium WebDriver ve TestNG kullanılarak geliştirilen bu proje, yapılandırılmış ve bakımı kolay test kodu için Page Object Model (POM) prensiplerine uyar.

Proje Amacı
Bu projenin temel hedefleri şunlardır:

N11'deki adres yönetimi bölümüne navigasyonu otomatikleştirmek.

Farklı bir teslimat adresi ekleme, düzenleme veya seçme sürecini simüle etmek.

Adres değişikliğinden sonra konuma özel avantaj mesajlarının veya promosyonların doğru bir şekilde görüntülendiğini doğrulamak.

Adres güncelleme sürecinin sağlam olduğundan ve UI'daki değişiklikleri doğru bir şekilde yansıttığından emin olmak.

Kullanıcı profili yönetimi ve dinamik içerik doğrulamasına özel odaklanarak e-ticaret test otomasyonu için Java, Selenium WebDriver ve TestNG'deki yetkinliği sergilemek.

Kullanılan Teknolojiler
Programlama Dili: Java

Test Otomasyon Çerçevesi: Selenium WebDriver

Test Çerçevesi: TestNG

Tasarım Deseni: Page Object Model (POM)

Kurulum ve Çalıştırma Talimatları
Bu projeyi yerel olarak kurmak ve çalıştırmak için aşağıdaki adımları izleyin:

Depoyu Klonlayın:

git clone https://https://github.com/BoraSari/AdressChangeAutomationProject.git
cd AdressChangeAutomationProject

(Not: BoraSari yerine gerçek GitHub kullanıcı adınızı yazın. GitHub'daki gerçek kurulumunuz farklıysa depo adını ayarlayın.)

Ön Koşullar:

Java Development Kit (JDK) 8 veya daha yüksek bir sürümün yüklü olduğundan emin olun.

Maven (veya Gradle) yüklü ve bağımlılık yönetimi için yapılandırılmış olmalıdır.

Tarayıcınız için uygun WebDriver'ı (örn: ChromeDriver, GeckoDriver) indirin ve test ortamınız tarafından erişilebilir olduğundan emin olun (örn: WebDriverManager veya sistem PATH aracılığıyla).

BaseTest sınıfının WebDriver'ı doğru bir şekilde başlattığından emin olun.

Projeyi Derleyin:

mvn clean install

(Gradle kullanıyorsanız, mvn komutlarını gradle komutlarıyla değiştirin.)

Testleri Çalıştırın:
Testler TestNG ile yapılandırılmıştır. Testleri bir TestNG XML paketi aracılığıyla veya doğrudan IDE'nizden (örn: IntelliJ IDEA, Eclipse) çalıştırabilirsiniz.

Örnek testng.xml:

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="N11 Adres Değişikliği Test Paketi">
    <test name="Adres Değişikliği Testleri">
        <classes>
            <class name="N11Tests.N11Tests"/> <!-- Lütfen gerçek test sınıfı adınız farklıysa değiştirin -->
        </classes>
    </test>
</suite>

Maven ile çalıştırma:

mvn test -DsuiteXmlFile=testng.xml

Veya doğrudan IDE'nizden çalıştırın.

Test Kapsamı ve Senaryoları
Bu proje, N11'in adres değiştirme işlevselliği için aşağıdaki temel senaryoları kapsar:

Adres Değişikliği ve Avantaj Mesajı Doğrulama:

Açıklama: N11'de bir kullanıcının teslimat adresini değiştirme sürecini otomatize eder ve konuma özel avantaj mesajlarının veya tekliflerinin doğru bir şekilde görüntülendiğini doğrular.

Akış: Adres yönetimi bölümüne gider, bir adres değişikliği yapar (örn: yeni bir adres seçer veya yeni detaylar girer) ve beklenen avantaj mesajının (örn: "Konuma Özel Avantajlar") görünür ve doğru olduğunu doğrular.

Ekran Görüntüleri/GIF'ler
![image](https://github.com/user-attachments/assets/cd91435a-b202-4f0a-ae5d-9bc1305aa057)

License
This project is licensed under the MIT License - see the LICENSE file for details.
