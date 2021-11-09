import java.util.*;

public class Main {
    public static String meeting(String s) {
        TreeMap<String, List> people = new TreeMap();
        String[] persons = s.split(";");
        for(String person : persons){
            String[]  fullNames = person.split(":");
            String firstName = fullNames[1].toUpperCase();
            String secondName =  fullNames[0].toUpperCase();
            if ( !people.keySet().contains( firstName )){
                List<String> names = new ArrayList<>();
                names.add(secondName);
                people.put(firstName, names);
            }
            else {
                List<String> names = people.get( firstName );
                names.add(secondName);
                Collections.sort(names);
                people.put(firstName, names);
            }
        }
        StringBuilder result = new StringBuilder();
        Set<String> secondNames = people.keySet();
        for(String secondName : secondNames ){
            List<String> names = people.get(secondName);
            for( String name  : names ){
                result.append("(").append(secondName.toUpperCase()).append(", ").append(name.toUpperCase()).append(")");
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {

        String input = "Illya:Mulyarchuk;Alexander:Khertek;Magomed:Khalilov;Miroslaw:Kolpakov;Yaroslav:Naidenov\\" +
                ";Oleksandr:Kostyliev;Denis:Sharipov;Kirill:Mikhaylov;Ilya:Zalutskiy;Valerii:Vakhovskyi;Andrii:Horodenskyi;";
        System.out.println(meeting(input));

    }
}