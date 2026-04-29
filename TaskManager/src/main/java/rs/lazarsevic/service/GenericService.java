package rs.lazarsevic.service;

import rs.lazarsevic.dto.UserDto;

public interface Service {
    boolean login(UserDto userDto);
}
