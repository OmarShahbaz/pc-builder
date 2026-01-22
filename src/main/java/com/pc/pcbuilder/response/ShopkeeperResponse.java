package com.pc.pcbuilder.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopkeeperResponse {

    private String username;

    private String shopName;

    private String location;
}
