/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package com.mycompany.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.mycompany.dto.UserDto;
import com.mycompany.entities.UserModel;

@Mapper
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper( UserMapper.class );

    @Mapping( source = "ageModel", target = "ageDto" )
    UserDto toUserDto(UserModel userModel);

    @InheritInverseConfiguration
    @Mapping(target="id", source = "id", defaultExpression = "java( UUID.randomUUID() )")
    UserModel toUserModel(UserDto s );

}
