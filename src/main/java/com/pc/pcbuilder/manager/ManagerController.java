package com.pc.pcbuilder.manager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    private final ManagerService managerService;

    public String activateShopkeeper(){
        return managerService.activateShopkeeper();
    }

    public String deactivateShopkeeper(){
        return managerService.disableShopkeeper();
    }


}
