package esy.facility.api.model;

import esy.facility.api.enums.FacilityStatus;
import esy.facility.api.enums.FacilityType;
import esy.facility.api.enums.SupportedCountry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacilityDto {
    private Long id;
    private String name;
    private SupportedCountry country;
    private String city;
    private String street;
    private String streetNumber;
    private String postCode;
    private double latitude;
    private double longitude;
    private FacilityType type;
    private FacilityStatus status;
    private Instant createdAt;
    private String createdBy;
    private Instant openedIn;
    private Instant updatedAt;
    private String updatedBy;
}
