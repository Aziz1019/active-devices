package uz.najot.springactivedevice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device extends BasicEntity{
    private String appName;
    private String ipAddress;
    private String deviceName;
    @ManyToOne
    private AppUser appUser;
}
