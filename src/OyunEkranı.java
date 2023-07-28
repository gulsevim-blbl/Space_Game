
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class OyunEkranı extends JFrame{

    public OyunEkranı(String title) throws HeadlessException {
        super(title);
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        OyunEkranı ekran = new OyunEkranı("Uzay Oyunu");
        
        ekran.setResizable(false);
        
        ekran.setFocusable(false);
        
        ekran.setSize(800,600);
        
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        Oyun oyun = new Oyun();
        
        oyun.requestFocus(); // klavye işlemleri anlaması için
        
        oyun.addKeyListener(oyun); // klavyeden işlemleri almayı sağlıyor
        
        oyun.setFocusable(true);
        
        oyun.setFocusTraversalKeysEnabled(false); // klavye işlemi için gene
        
        ekran.add(oyun);
        
        ekran.setVisible(true);
        
        //fonksiyonların sırası önemlidir.
        
        
    }
    
}
