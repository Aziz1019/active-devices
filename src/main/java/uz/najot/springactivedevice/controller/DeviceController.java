package uz.najot.springactivedevice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.najot.springactivedevice.model.ResponseModel;
import uz.najot.springactivedevice.repository.DeviceRepository;
import uz.najot.springactivedevice.service.AppUserService;

@RestController
@RequestMapping("/device")
@RequiredArgsConstructor
public class DeviceController {
    private final DeviceRepository deviceRepository;
    private final AppUserService appUserService;


    @GetMapping
    public ResponseModel getAllDevice(){
        return ResponseModel.getSuccess(deviceRepository.findAll());
    }

    @DeleteMapping
    public ResponseModel deleteDeviceById(@RequestParam Integer deviceId){
        deviceRepository.deleteById(deviceId);
        return ResponseModel.getSuccess("Ok");
    }


}
