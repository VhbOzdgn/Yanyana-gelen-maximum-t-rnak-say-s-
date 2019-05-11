


public class Main {
    

    
    public static int yanyanaMaxTirnakSayisi(String arg){
        int maxSayi = 0;
        for(int i = 0; i<arg.length(); i++){
            int tirnakSayisi = 0;
            while (i<arg.length() && arg.charAt(i) == '\"') {                
                tirnakSayisi++;
                   i++; 
            }
            if(maxSayi < tirnakSayisi)
                maxSayi = tirnakSayisi;
        }
        return maxSayi;
    }
    
    public static void main(String[] args) {
        
        String kelime = "\"mer\"h\"\"\"\"\"\"\"\"a\"b\"\"a\"\"\"\"\"";
            System.out.println(yanyanaMaxTirnakSayisi(kelime));
        
        
        
    }
}
