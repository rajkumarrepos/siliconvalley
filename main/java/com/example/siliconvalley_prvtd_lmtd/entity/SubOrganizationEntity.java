package com.example.siliconvalley_prvtd_lmtd.entity;

import com.example.siliconvalley_prvtd_lmtd.enumBox.CompanyType;
import com.example.siliconvalley_prvtd_lmtd.enumBox.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name="sub_organization")
public class SubOrganizationEntity {

        @Id
        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name ="uuid2", strategy = "uuid2" )
        private String id;

        @Column(length = 12,nullable = false)
        private String subOrganizationCode;

        @Column(length = 30,nullable = false)
        private String subOrganizationName;

        @Column(nullable = false)
        @Enumerated(EnumType.STRING)
        private Status status;

        @Column(length = 30,nullable = false)
        private String country;

        @Column(length = 10,nullable = false)
        private String timezone;

        @Column(nullable = false)
        @Enumerated(EnumType.STRING)
        private CompanyType companyType;

        @Column(length = 30,nullable = false)
        private String industry;

        @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
        private OrganizationEntity organizationEntity;


    }

