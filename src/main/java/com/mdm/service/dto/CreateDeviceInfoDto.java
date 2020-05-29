package com.mdm.service.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CreateDeviceInfoDto {
    private Long id;
    private String name;
    private List<String> stringList;
    private List<DeviceTypeDto> deviceTypeDtos;
}
