package com.stackleader.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;


@Entity(name = "entity")
@XmlRootElement //FIXME: include this
@Table(name = "property")
public class JPAModel implements Serializable {

    private static final long serialVersionUID = 1L;
//
//    id integer NOT NULL DEFAULT nextval('public.property_id_seq'::regclass),
//    name text NOT NULL,
//    image_url text,
//    uuid uuid NOT NULL DEFAULT uuid_generate_v4(),
//    disabled boolean NOT NULL DEFAULT false,
//    business_id integer,
//    address_id integer,
//    portfolio_id integer NOT NULL,
//    facilitator_fee_as_percent numeric(12,4) NOT NULL,
//    facilitator_fee_as_fixed numeric(12,2) NOT NULL,
//    facilitator_fee_is_percent bool NOT NULL,
//    facilitator_id integer,
//    CONSTRAINT property_id_pk PRIMARY KEY (id)
    //id | name | image_url | uuid | disabled | business_id | address_id | portfolio_id | facilitator_fee_as_percent | facilitator_fee_as_fixed | facilitator_fee_is_percent
    // | facilitator_id | bank_statement_name | email_reply_to | invoice_url_prefix | theme_template_id | stripe_account_id | twilio_subaccount_sid | twilio_key | twilio_secret

    @Id
    @NotNull
    private Integer id;

    @NotNull
    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    @NotNull
    private UUID uuid;

    private boolean disabled;

    @Column(name = "business_id")
    private Integer businessId;

    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "portfolio_id")
    private Integer portfolioId;

    @Column(name = "facilitator_fee_as_percent")
    private BigDecimal facilitatorFeeAsPercent;

    @Column(name = "facilitator_fee_as_fixed")
    private BigDecimal facilitatorFeeAsFixed;

    @Column(name = "facilitator_fee_is_percent")
    private boolean facilitatorFeeIsPercent;

    @Column(name = "facilitator_id")
    private Integer facilitatorId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(int portfolioId) {
        this.portfolioId = portfolioId;
    }

    public BigDecimal getFacilitatorFeeAsPercent() {
        return facilitatorFeeAsPercent;
    }

    public void setFacilitatorFeeAsPercent(BigDecimal facilitatorFeeAsPercent) {
        this.facilitatorFeeAsPercent = facilitatorFeeAsPercent;
    }

    public BigDecimal getFacilitatorFeeAsFixed() {
        return facilitatorFeeAsFixed;
    }

    public void setFacilitatorFeeAsFixed(BigDecimal facilitatorFeeAsFixed) {
        this.facilitatorFeeAsFixed = facilitatorFeeAsFixed;
    }

    public boolean isFacilitatorFeeIsPercent() {
        return facilitatorFeeIsPercent;
    }

    public void setFacilitatorFeeIsPercent(boolean facilitatorFeeIsPercent) {
        this.facilitatorFeeIsPercent = facilitatorFeeIsPercent;
    }

    public int getFacilitatorId() {
        return facilitatorId;
    }

    public void setFacilitatorId(int facilitatorId) {
        this.facilitatorId = facilitatorId;
    }
}

