package com.mdm.service.service;

import com.mdm.service.dto.CreateDeviceInfoDto;

public interface DeviceService {
    CreateDeviceInfoDto save(CreateDeviceInfoDto deviceInfoDto);
}
