package com.pc.pcbuilder.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopkeeperRequest {

    private String username;

    private String shopName;

    private String location;
}
