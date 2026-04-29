package rs.lazarsevic.repository;

import rs.lazarsevic.domain.User;

public interface Repository {
    boolean login(User user);

}
