import java.util.*;

interface UygulamaFormat{
  void gonder(String mesaj);
  
}

class NormalMesaj implements UygulamaFormat{
  
  @Override
  public void gonder(String icerik){
    System.out.println("Normal mesaj gonderildi: \n" + icerik +"\n");
    
  }
}

class SifreliMesaj implements UygulamaFormat{
  
  @Override
  public void gonder(String icerik){
    System.out.println("Sifreli mesaj gonderildi: \n" + icerik+ "\n");
    
  }
}


abstract class Uygulama {
  protected UygulamaFormat format;
  
  public Uygulama(UygulamaFormat format){
    this.format = format;
    
  }
  abstract void gonder(String mesaj);
}



class Whatsapp extends Uygulama {
  public Whatsapp(UygulamaFormat format){
    super(format);
  }
  @Override
  void gonder(String mesaj){
    System.out.println(" whatsapp mesajlari: ");
    format.gonder(mesaj);
    
  }
}
class Eposta extends Uygulama {
  public Eposta(UygulamaFormat format){
    super(format);
  }
  void gonder(String mesaj){
    System.out.println(" Eposta mesajlari: ");
    format.gonder(mesaj);
    
  }
}




public class Main {
    public static void main(String[] args) {
    
    Uygulama u1 = new Whatsapp(new NormalMesaj());
    u1.gonder("selam");
    
    Uygulama u2 = new Whatsapp(new SifreliMesaj());
    u2.gonder("selam dunya");
    
    Uygulama u3 = new Eposta(new NormalMesaj());
    u3.gonder("selam");
    
    Uygulama u4 = new Eposta(new SifreliMesaj());
    u4.gonder("selam dunya");
    
    }
}
