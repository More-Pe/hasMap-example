package org.example;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        System.out.println(agenda);
        agenda.put("Morena", "487923874");
        agenda.put("Cris", "4793827498237");
        agenda.put("Roci", "43974923874");
        System.out.println(agenda);
        System.out.println(agenda.get("Morena"));
        agenda.put("Morena", "374723947");
        System.out.println(agenda);
        agenda.replace("Morena", "0000000000");
        System.out.println(agenda);
        agenda.replace("Harry", "743974473");
        System.out.println(agenda);
        agenda.remove("Morena");
        System.out.println(agenda);

        System.out.println(agenda.keySet());
        for (String contact : agenda.keySet() ){
            System.out.println(contact + " -> " + agenda.get(contact));
        }
    }
}
