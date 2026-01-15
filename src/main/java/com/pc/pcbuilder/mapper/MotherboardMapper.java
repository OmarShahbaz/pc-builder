package com.pc.pcbuilder.mapper;

import com.pc.pcbuilder.motherboard.Motherboard;
import com.pc.pcbuilder.request.MotherboardRequest;
import com.pc.pcbuilder.response.MotherboardResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MotherboardMapper {

    @Mapping(target = "id", ignore = true)
    Motherboard toEntity(MotherboardRequest request);

    MotherboardResponse toResponse(Motherboard motherboard);

}
