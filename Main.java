import ViewModel.*;
import Model.User;
import View.UserView;
public class Main {
    public static void main(String[] args) {
        User user = new User("Mabaouj aya", 22);
        UserViewModel userViewModel = new UserViewModel(user);
        UserView userView = new UserView(userViewModel);
 
        userView.displayUser();
        userView.getUserInput();
        userView.displayUser();
    }
 }
 