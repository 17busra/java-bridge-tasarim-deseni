# Java OOP - Bridge Tasarım Deseni 🌉

Bu proje, yapısal tasarım desenlerinden (Structural Design Patterns) biri olan **Bridge (Köprü)** deseninin kullanımını göstermektedir. Proje, mesajlaşma uygulamaları (WhatsApp, E-posta) ile bu uygulamalar üzerinden gönderilen mesajların formatları (Normal, Şifreli) arasındaki bağımlılığı ortadan kaldırmayı hedefler.

Bridge deseni, "Miras (Inheritance) yerine Bileşim (Composition) kullan" prensibini temel alır. Eğer bu desen kullanılmasaydı; `WhatsappNormalMesaj`, `WhatsappSifreliMesaj`, `EpostaNormalMesaj` gibi her ihtimal için ayrı bir sınıf (alt sınıf patlaması) oluşturmak gerekecekti.

**İçerilen OOP ve Tasarım Prensipleri:**
* **Implementor (Uygulayıcı Arayüz) - `UygulamaFormat`:** Alt sistemin (mesaj formatının) nasıl çalışacağını belirleyen arayüz.
* **Concrete Implementor (Somut Uygulayıcılar) - `NormalMesaj` & `SifreliMesaj`:** Formatlama işlemini kendi içlerinde farklı yollarla halleden sınıflar.
* **Abstraction (Soyutlama) - `Uygulama`:** İstemcinin doğrudan muhatap olduğu ana sınıf. İçerisinde `UygulamaFormat` arayüzünü bir özellik (property) olarak tutarak platform ile format arasında "köprü" kurar.
* **Refined Abstraction (Geliştirilmiş Soyutlama) - `Whatsapp` & `Eposta`:** Temel uygulamayı miras alarak kendi platformlarına özgü davranışları ekleyen, ancak asıl gönderme işini (delegation) formata bırakan sınıflar.

**Kullanılan Dil:**
* Java
