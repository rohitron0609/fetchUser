package in.dexc.fetchUser.Controller;

import in.dexc.fetchUser.Model.User;
import in.dexc.fetchUser.Repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    UserRepository userRepository;
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
