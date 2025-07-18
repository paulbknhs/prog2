import java.util.*;
import java.util.regex.*;
public class KE{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean weiter = true;
        ArrayList<String> zeilen = new ArrayList<>();
        while(weiter){
            String in = sc.nextLine();
            if(in.equals("stop")){
                weiter = false;
            }else{
                zeilen.add(in);
            }

        }
        String input = "";
        for(int i = 0; i < zeilen.size();i++){
            input+= zeilen.get(i)+"\n";
        }


        String out = input.replaceAll("//.*", "");
        // Remove block comments but preserve newlines within them:
        out = Pattern.compile("(?s)/\\*.*?\\*/")
                     .matcher(out)
                     .replaceAll(m -> m.group().replaceAll("[^\\n]", ""));

        // Remove any extra blank lines at line starts:
        String output = out.replaceAll("(?m)^\\s*\r?\n", "").trim();
        System.out.println(output);
    }
}

