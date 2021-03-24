/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package com.mycompany.mapper;

import static org.junit.Assert.assertEquals;

import com.mycompany.dto.UserDto;
import com.mycompany.mappers.UserMapper;
import org.junit.Test;

import com.mycompany.entities.UserModel;

public class UserMapperTest {

    @Test
    public void testToUserModel() {
        UserDto userDto = UserDto.builder().
                name("George").
                ageDto("15").
                build();

        UserModel userModel = UserMapper.MAPPER.toUserModel( userDto );
        assertEquals( "George", userModel.getName() );
        assertEquals(15, (int) userModel.getAgeModel());
    }

    @Test
    public void testToUserDto(){
        UserModel userModel = UserModel.builder().
                name("Christian").
                ageModel(25).
                build();

        UserDto userDto = UserMapper.MAPPER.toUserDto(userModel);

        assertEquals("Christian",  userDto.getName());
        assertEquals("25", Integer.toString(userModel.getAgeModel()));
    }
}
