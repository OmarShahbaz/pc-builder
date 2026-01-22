package com.pc.pcbuilder.shopkeeper;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="shopkeepers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shopkeeper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;

    private String username;

    private String shopName;

    private String location;
}
