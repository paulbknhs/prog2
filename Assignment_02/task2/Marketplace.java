import auth.User;
import offerings.Item;

public class Marketplace {
  User[] users;

  public boolean addUser(User user) {
    if (users == null) {
      users = new User[10];
      users[0] = user;
      return true;
    }
    for (int i = 0; i < users.length; i++) {
      if (users[i] != null && users[i].getUsername().equals(user.getUsername()))
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
    if (users == null) {
      return "No users";
    }
    for (User user : users) {
      if (user != null) {
        Item[] userItems = user.getItems();
        if (userItems == null) {
          continue;
        }
        for (Item item : userItems) {
          if (item != null) {
            items += "[";
            items += "Item: " + item.getName() + " ";
            items += "Preis: " + item.getVerkaufspreis() + " ";
            items += "Verkäufer: " + item.getVerkaeufer().getUsername() + " ";
            items += "Beschreibung: " + item.getBeschreibung();
            items += "]\n";
          }
        }
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
