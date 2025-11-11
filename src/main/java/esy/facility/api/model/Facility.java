package esy.facility.api.model;

import esy.facility.api.enums.FacilityStatus;
import esy.facility.api.enums.FacilityType;
import esy.facility.api.enums.SupportedCountry;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FACILITY")
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SupportedCountry country;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String streetNumber;

    @Column(nullable = false)
    private String postCode;

    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double longitude;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FacilityType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FacilityStatus status;

    @Column(nullable = false)
    private Instant createdAt;

    @Column(nullable = false)
    private String createdBy;

    @Column(nullable = false)
    private Instant openedIn;

    @Column(nullable = false)
    private Instant updatedAt;

    @Column(nullable = false)
    private String updatedBy;
}
