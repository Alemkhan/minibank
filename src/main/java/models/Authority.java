package models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorityId;

    private String authorityName;

    private Set<Role> roleSet = new HashSet<>();

}
