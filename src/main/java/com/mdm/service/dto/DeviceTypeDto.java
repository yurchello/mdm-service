package com.mdm.service.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//this annotations will add getters/setters, constructors, equals, hashCode and even Sl4j if you need. after compile automatically
//add lombok plugin in idea settings
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class DeviceTypeDto {
    private String type;
}
