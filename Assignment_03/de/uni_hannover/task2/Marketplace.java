package de.uni_hannover.task2;

import de.uni_hannover.task2.auth.*;
import de.uni_hannover.task2.offerings.*;

public class Marketplace {
    private User[] users;

    public Marketplace() {
        this.users = new User[10];
    }

    public String str() {
        String res = "";
        
        for(int i = 0; i < this.users.length; i++) {
            if(this.users[i] == null) {
                continue;
            }
            
            res += this.users[i].str();
            res += "\n\n";
        }

        return res;
    }

    public boolean addUser(User user) {
        for (int i = 0; i < this.users.length; i++) {
            if(this.users[i] == null) {
                this.users[i] = user;
                return true;
            }
            
        }

        return false;
    }

    public static void main(String[] args) {
        // Main Methode darf auch in Main-Klasse sein.
        Marketplace market = new Marketplace();

        User first = new User("Max", "1234");
        User second = new User("Maxine", "4321");

        Item one = new Item(
            "Sandalen",
            10,
            first,
            "Neue Sandalen schwarz. Festpreis!"
        );

        Item two = new Item(
            "Hut",
            100,
            second,
            "Toller Hut. Keine Anfragen, wie 'was letzter Preis'."
        );

        first.addItem(one);
        second.addItem(two);
        
        market.addUser(first);
        market.addUser(second);


        System.out.println(market.str());

        one.setPrice(50, first);
        market.removeUser(second);

        System.out.println(market.str());
        
    }
}

