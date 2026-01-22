package com.pc.pcbuilder.shopkeeper;

import com.pc.pcbuilder.mapper.ShopkeeperMapper;
import com.pc.pcbuilder.request.ShopkeeperRequest;
import com.pc.pcbuilder.response.ShopkeeperResponse;
import org.springframework.stereotype.Service;

@Service
public class ShopkeeperService {

    private final ShopkeeperRepository shopkeeperRepo;
    private final ShopkeeperMapper shopkeeperMapper;

    public ShopkeeperService(
            ShopkeeperRepository shopkeeperRepo,
            ShopkeeperMapper shopkeeperMapper) {
        this.shopkeeperRepo = shopkeeperRepo;
        this.shopkeeperMapper = shopkeeperMapper;
    }

    public ShopkeeperResponse openShop(ShopkeeperRequest shopkeeperRequest) {
        Shopkeeper shopkeeper = shopkeeperMapper.toEntity(shopkeeperRequest);
        Shopkeeper entity = shopkeeperRepo.save(shopkeeper);
        return shopkeeperMapper.toResponse(entity);
    }
}
