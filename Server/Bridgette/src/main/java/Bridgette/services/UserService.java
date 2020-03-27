package Bridgette.services;

import Bridgette.models.BridgeUser;
import Bridgette.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String doesExist(BridgeUser user) {
        List<BridgeUser> matchingUsers = this.userRepository.findByNameAndPassword(user.name(), user.password());
        if (matchingUsers.size() > 0) {
            return "goni_hamelech_gever_retzach";
        } else {
            return "";
        }
    }
}
