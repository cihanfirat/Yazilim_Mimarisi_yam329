                    KONULAR

Interface Nedir?
------------------------------------------------------------------------------------
* Bir interface, Java'da yalnızca abstract metotları ve sabitleri (constants) barındırabilir.

* Metot imzaları tanımlanır, yani metotların ne yapacağı belirtilir, ama nasıl yapacağı tanımlanmaz.

* Bir sınıf, birden fazla interface'i implement edebilir, bu da Java'nın bir sınıfın yalnızca bir üst sınıfı olabileceği kısıtlamasını aşmanın bir yoludur (çoklu kalıtım).
------------------------------------------------------------------------------------

Interface Ne İşe Yarar?
------------------------------------------------------------------------------------
* Soyutlama: Bir interface, belirli bir işlevi nasıl gerçekleştireceğinizi değil, sadece neyin yapılması gerektiğini belirtir. Bu, yüksek seviyeli soyutlama sağlar ve uygulama detaylarından bağımsız olarak işlerin yürütülmesini sağlar.

* Çoklu Kalıtım: Java, bir sınıfın birden fazla sınıfı doğrudan miras almasına izin vermez. Ancak, bir sınıf birden fazla interface'i implement edebilir. Bu sayede, çoklu kalıtıma benzer bir yapı elde edilir.

* Bağlantı Noktası (Contract): Bir interface, bir sınıfın uygulaması gereken metotların bir "sözleşmesi" gibidir. Bu, sınıfın interface'deki tüm metotları tanımlaması gerektiği anlamına gelir. Interface'ler sayesinde bir sınıfın belirli bir işlevi yerine getireceği garanti altına alınır.
------------------------------------------------------------------------------------

Interface Ne Zaman Kullanılır?
------------------------------------------------------------------------------------
* Birden Fazla Kaynaktan Gelen Davranışları Birleştirmek: Eğer bir sınıf birden fazla farklı işlevi yerine getirecekse ve bu işlevler birbirinden bağımsız yapılar olabilir, interface'ler kullanarak bu işlevler sağlanabilir.

* Farklı Sınıfların Aynı Davranışı Paylaşması Gerektiğinde: Eğer farklı sınıfların aynı fonksiyonları implement etmesini istiyorsanız (örneğin, bir nesnenin karşılaştırılması gibi), interface'ler kullanılabilir.

* Bağımlılıkları Azaltmak: Bir sınıfın spesifik bir sınıfa bağlı olmadan çalışmasını sağlamak için interface'ler kullanılır. Bu da kodun esnekliğini artırır ve bağımlılıkları azaltır (loosely coupled systems).