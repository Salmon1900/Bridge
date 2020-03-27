package Bridgette.repositories;

import Bridgette.models.BridgeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<BridgeUser, Integer> {
    List<BridgeUser> findByNameAndPassword(String name, String password);
}
