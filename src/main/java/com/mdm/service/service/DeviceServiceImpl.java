package com.mdm.service.service;

import com.mdm.service.dto.CreateDeviceInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DeviceServiceImpl implements DeviceService {

    @Override
    public CreateDeviceInfoDto save(CreateDeviceInfoDto deviceInfoDto) {
        log.info("Saving data {}", deviceInfoDto);
        //here you call the DAO layer
        //just for an example
        deviceInfoDto.setId(123L);
        log.info("Saved data {}", deviceInfoDto);
        return deviceInfoDto;
    }
}
