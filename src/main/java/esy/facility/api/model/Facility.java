package esy.facility.api.model;

import esy.facility.api.enums.FacilityStatus;
import esy.facility.api.enums.FacilityType;
import esy.facility.api.enums.SupportedCountry;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facility {

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
