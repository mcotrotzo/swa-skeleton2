package at.qe.skeleton.ui.controllers;

import at.qe.skeleton.model.Userx;
import at.qe.skeleton.services.UserxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("view")
public class UserCreateController {
    @Autowired
    private UserxService userService;

    private Userx user;



    public void saveUser(Userx user){
        userService.saveUser(user);
    }

    public Userx getUser() {
        if(this.user == null){
            this.user = new Userx();

        }
        return this.user;



    }

    public void doSaveUser() {
        user = userService.saveUser(user);

    }
}
