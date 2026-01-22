package com.pc.pcbuilder.mapper;

import com.pc.pcbuilder.request.ShopkeeperRequest;
import com.pc.pcbuilder.response.ShopkeeperResponse;
import com.pc.pcbuilder.shopkeeper.Shopkeeper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ShopkeeperMapper {

    @Mapping(target = "sid", ignore = true)
    Shopkeeper toEntity(ShopkeeperRequest shopkeeperRequest);

    ShopkeeperResponse toResponse(Shopkeeper shopkeeper);
}
