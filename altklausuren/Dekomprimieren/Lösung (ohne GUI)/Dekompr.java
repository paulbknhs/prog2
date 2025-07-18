import java.util.regex.*;
public class Dekompr{
    String input;

    public String dekom(){
        Pattern pattern = Pattern.compile("\\*(\\d+)(.)\\*");
        Matcher matcher = pattern.matcher(input);
        StringBuilder str = new StringBuilder();
        int lastIndex = 0;
        while(matcher.find()){
            str.append(input,lastIndex,matcher.start());
            //str.append(matcher.start());
            int repeat = Integer.parseInt(matcher.group(1));
            char Char = matcher.group(2).charAt(0);
            str.append(String.valueOf(Char).repeat(repeat));
            lastIndex = matcher.end();
        }
        str.append(input.substring(lastIndex));
        return str.toString();
    }

    public static void main(String[] args){
        Dekompr x = new Dekompr();
        x.input = "Ein Bürger ** gewann 1*90* Euro im Lotto *5!*";
        String output = x.dekom();
        System.out.println(output);

    }
}
