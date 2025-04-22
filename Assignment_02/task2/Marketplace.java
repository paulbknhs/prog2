import auth.User;
import offerings.Item;

public class Marketplace {
  User[] users;

  public boolean addUser(User user) {
    for (int i = 0; i < users.length; i++) {
      if (users[i].getUsername() == user.getUsername())
        return false;
      else if (users[i] == null) {
        users[i] = user;
        return true;
      }
    }
    return false;
  }

  public String str() {
    String items = "";
    for (User user : users) {
      for (Item item : user.getItems()) {
        items += "[";
        items += "Item: " + item.getName() + " ";
        items += "Preis: " + item.getVerkaufspreis() + " ";
        items += "Verkäufer: " + item.getVerkaeufer() + " ";
        items += "Beschreibung: " + item.getBeschreibung();
        items += "]\n";
      }
    }
    return items;
  }

  public static void main(String[] args) {
    User newuser = new User("user1", "password1");
    Marketplace marketplace = new Marketplace();
    marketplace.addUser(newuser);
    System.out.println(marketplace.str());
    Item newitem = new Item("Item1", (float) 0.99, newuser, "Beschreibung1");
    newuser.addItem(newitem);
    System.out.println(marketplace.str());
  }
}
