package auth;

import java.util.ArrayList;
import java.util.Arrays;
import offerings.Item;

public class User {
  String Username;
  String Password;
  Item[] Items;

  public User(String Username, String Password) {
    this.Username = Username;
    this.Password = Password;
  }

  public String getUsername() {
    return this.Username;
  }

  public Item[] getItems() {
    return this.Items;
  }

  public String getPassword() {
    return this.Password;
  }

  public void setUsername(String newUsername) {
    this.Username = newUsername;
  }

  public void setPassword(String newPassword) {
    this.Password = newPassword;
  }

  public boolean removeItem(Item item) {
    ArrayList items = new ArrayList<>(Arrays.asList(this.Items));
    return items.remove(item);
  }

  public boolean addItem(Item item) {
    ArrayList items = new ArrayList<>(Arrays.asList(this.Items));
    return items.add(item);
  }

}
