package com.leandroLara.travelorder.flight;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Flight extends PanacheEntity{
    
    public Long traveLongId;
    public String fromAirport;
    public String toaAirport;

    public static Flight findByTravelOrderId(Long travelOrderId){
        return find("travelOrderId", travelOrderId).firstResult();
    }
}
