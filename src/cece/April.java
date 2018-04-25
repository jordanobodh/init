package cece;

import genpackage.GenOb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kusumakar on 25/4/18.
 */
public class April {
    public void problemOne() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nInput = reader.readLine();
        String priceStr = reader.readLine();
        String typeStr = reader.readLine();
        Integer n = Integer.parseInt(nInput);
        String [] priceArray = priceStr.split(" ");
        String [] typeArray = typeStr.split(" ");
        GenOb gob = new GenOb();
        Integer [] p = gob.toIntArray(priceArray);
        Integer [] t = gob.toIntArray(typeArray);

        int translator = 0;
        int auth = 0;
        int authTranslator = 0;
        for(int i = 0; i<p.length; i++){
            if(t[i] == 1){
                if((translator !=0 && p[i] < translator) || translator == 0){
                    translator = p[i];
                }
            } else if(t[i] == 2){
                if((auth !=0 && p[i] < auth) || auth == 0){
                    auth = p[i];
                }
            } else {
                if((authTranslator !=0 && p[i] < authTranslator) || authTranslator == 0){
                    authTranslator = p[i];
                }
            }
        }

        System.out.println(((auth+translator) < authTranslator) ? (auth+translator) : authTranslator);
    }
}
