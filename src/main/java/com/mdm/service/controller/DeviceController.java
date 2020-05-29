package com.mdm.service.controller;

import com.mdm.service.dto.CreateDeviceInfoDto;
import com.mdm.service.service.DeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(ApiConstants.DEVICE_CONTROLLER)
public class DeviceController {

    //in new spring you may not use @Autowired at all
    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok("Hello=" + id);//you can set status ResponseEntity.status(404);
    }

    @GetMapping
    public ResponseEntity<String> getWithoutId() {
        return ResponseEntity.ok("Hello");
    }

    //you don't have to use ResponseEntity. But if you need to set a status, then you need it.
    //by the way, you can return any object.
    @GetMapping("/no-response-entity")
    public CreateDeviceInfoDto getNoResponseEntity() {
        CreateDeviceInfoDto dto = new CreateDeviceInfoDto();
        dto.setName("sfdewvfd");
        return dto;
    }

    //you can use path vars like  in get as well. The same idea.
    //you can return any object.
    @PostMapping
    public CreateDeviceInfoDto save(@RequestBody CreateDeviceInfoDto deviceInfoDto) {
        log.info("Saving your dto...");
        CreateDeviceInfoDto saved = deviceService.save(deviceInfoDto);
        return saved;
    }
}
