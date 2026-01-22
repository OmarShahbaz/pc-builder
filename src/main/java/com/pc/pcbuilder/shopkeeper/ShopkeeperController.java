package com.pc.pcbuilder.shopkeeper;

import com.pc.pcbuilder.request.ShopkeeperRequest;
import com.pc.pcbuilder.response.ShopkeeperResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
public class ShopkeeperController {

    private final ShopkeeperService shopkeeperService;

    public ShopkeeperController(ShopkeeperService shopkeeperService) {
        this.shopkeeperService = shopkeeperService;
    }

    @PostMapping("/open")
    public ShopkeeperResponse openShop(@RequestBody ShopkeeperRequest shopkeeperRequest){
        return shopkeeperService.openShop(shopkeeperRequest);
    }
}
