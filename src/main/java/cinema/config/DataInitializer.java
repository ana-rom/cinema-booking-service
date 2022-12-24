package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.ShoppingCartService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final ShoppingCartService shoppingCartService;
    private final UserService userService;

    public DataInitializer(RoleService roleService,
                           ShoppingCartService shoppingCartService,
                           UserService userService) {
        this.roleService = roleService;
        this.shoppingCartService = shoppingCartService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);

        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);

        User testAdmin = new User();
        testAdmin.setEmail("testadmin@gmail.com");
        testAdmin.setPassword("123456789");
        testAdmin.setRoles(Set.of(adminRole));
        userService.add(testAdmin);

        User testUser = new User();
        testUser.setEmail("testuser@gmail.com");
        testUser.setPassword("987654321");
        testUser.setRoles(Set.of(userRole));
        userService.add(testUser);
        shoppingCartService.registerNewShoppingCart(testUser);
    }
}
