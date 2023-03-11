package ViewModel;
import Model.User;
public class UserViewModel {
    private User user;
 
    public UserViewModel(User user) {
        this.user = user;
    }
 
    public String getUserName() {
        return user.getName();
    }
 
    public void setUserName(String name) {
        user.setName(name);
    }
 
    public int getUserAge() {
        return user.getAge();
    }
 
    public void setUserAge(int age) {
        user.setAge(age);
    }
 }
 
