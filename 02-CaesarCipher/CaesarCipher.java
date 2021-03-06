import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CaesarCipher{
    
  public CaesarCipher (int shift){
     this.shift=shift;
  }
    
  public void enkripsi (String sumber, String sasaran) throws IOException{
    FileInputStream masukan = null;
        FileOutputStream keluaran = null;
        

     try {
            // Object stream untuk masukkan
            masukan = new FileInputStream(sumber);
            // Object stream untuk masukkan
            keluaran = new FileOutputStream(sasaran);
            
            // Coba baca  dari stream
            int karakter = masukan.read();
            // Selama masih ada data yang bisa dibaca
            while (karakter != -1) {
                // Kirim ke keluaran
                karakter += shift;
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = masukan.read();
            }
      } 
     finally {
            // Tutup stream masukan
            if (masukan != null)
                masukan.close();
            // Tutup stream keluaran
            if (keluaran != null)
                keluaran.close();
      }
    }
    
      public void dekripsi (String sumber, String sasaran)
         throws IOException{
    FileInputStream masukan = null;
        FileOutputStream keluaran = null;
        

     try {
            // Object stream untuk masukkan
            masukan = new FileInputStream(sumber);
            // Object stream untuk masukkan
            keluaran = new FileOutputStream(sasaran);
            
            // Coba baca  dari stream
            int karakter = masukan.read();
            // Selama masih ada data yang bisa dibaca
            while (karakter != -1) {
                // Kirim ke keluaran
                karakter -= shift;
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = masukan.read();
            }
      } 
     finally {
            // Tutup stream masukan
            if (masukan != null)
                masukan.close();
            // Tutup stream keluaran
            if (keluaran != null)
                keluaran.close();
      }  
    }
    
  private int shift;
  }