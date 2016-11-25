package com.chechel.spring.Function;


import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        User user = new User("cusromer", "123456789");
        /* F U N C T I O N S */
        ConvertUser convertUser = new ConvertUser();
        MaskPass maskPass = new MaskPass();
        /*==================*/
        UserDto userDto = convertUser
                .andThen(maskPass)
                .apply(user);

        System.out.println(userDto);
    }
}

class User {
    public User(String pass, String name) {
        this.pass = pass;
        this.name = name;
    }

    String name;
    String pass;
}

class UserDto {
    String name;
    String pass;

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}

class ConvertUser implements Function<User, UserDto> {
    @Override
    public UserDto apply(User user) {
        UserDto dto = new UserDto();
        dto.name = user.name;
        dto.pass = user.pass;
        return dto;
    }


}

class MaskPass implements Function<UserDto, UserDto> {
    @Override
    public UserDto apply(UserDto userDto) {
        int passLength = userDto.pass.length();
        String mask = "";
        for (int i = 0; i < passLength; i++) {
            mask += "*";
        }
        userDto.pass = mask;
        return userDto;
    }
}