package Bridgette.Controlles;

import Bridgette.models.BridgeUser;
import Bridgette.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/check")
    public String checkUser(@RequestBody BridgeUser user) {
        return this.userService.doesExist(user);
    }
}
