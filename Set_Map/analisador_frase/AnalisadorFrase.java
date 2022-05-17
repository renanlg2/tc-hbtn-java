import java.util.TreeMap;

public class AnalisadorFrase {
   public static TreeMap contagemPalavras(String texto){
      TreeMap<String, Integer> listaPalavras = new TreeMap<>();

      String[] palavras = texto.split(" ");

      for (String palavra : palavras) {
         String palavraMinuscula = palavra.toLowerCase().replace("!","").replace(".","").replace("?","");

         if (listaPalavras.get(palavraMinuscula) == null) {
            listaPalavras.put(palavraMinuscula, 1);
         } else {
            listaPalavras.put(palavraMinuscula, listaPalavras.get(palavraMinuscula) + 1);
         }
      }

      return listaPalavras;
   }

}
