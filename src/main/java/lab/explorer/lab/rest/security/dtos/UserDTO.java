package lab.explorer.lab.rest.security.dtos;

import lab.explorer.lab.rest.security.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private Integer id;

    private String name;

    private String username;

    private List<String> roles = new ArrayList<>();

    public UserDTO(Integer id, String name, String username, List<String> roles) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.roles = roles;
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.username = user.getUsername();
        this.roles = user.getRoles();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
