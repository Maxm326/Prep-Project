package com.stackleader.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;


@Entity
@XmlRootElement
@Table(name = "property")
public class Property implements Serializable {

    private static final long serialVersionUID = 1L;

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

    //    EX for using hibernate to join
//    @JoinColumn(name = "portfolio_id")
//    @ManyToOne
//    private Portfolio portfolio;
    @Column(name = "portfolio_id")
    private Integer portfolioId;

    @Column(name = "facilitator_fee_as_percent")
    private BigDecimal facilitatorFeeAsPercent;

    @Column(name = "facilitator_fee_as_fixed")
    private BigDecimal facilitatorFeeAsFixed;

    @Column(name = "facilitator_fee_is_percent")
    private boolean facilitatorFeeIsPercent;

    @Column(name = "facilitator_id", columnDefinition = "default = 0")
    private Integer facilitatorId;

    @Column(name = "bank_statement_name")
    private String bankStatementName;

    @Column(name = "email_reply_to")
    private String emailReplyTo;

    @Column(name = "invoice_url_prefix")
    private String invoiceUrlPrefix;

    @Column(name = "theme_template_id")
    private Integer themeTemplateId;

    @Column(name = "stripe_account_id")
    private String stripeAccountId;

    @Column(name = "twilio_subaccount_sid")
    private String twilioSubaccountSid;

    @Column(name = "twilio_key")
    private String twilioKey;

    @Column(name = "twilio_secret")
    private String twilioSecret;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Integer portfolioId) {
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

    public Integer getFacilitatorId() {
        return facilitatorId;
    }

    public void setFacilitatorId(Integer facilitatorId) {
        this.facilitatorId = facilitatorId;
    }

    public String getBankStatementName() {
        return bankStatementName;
    }

    public void setBankStatementName(String bankStatementName) {
        this.bankStatementName = bankStatementName;
    }

    public String getEmailReplyTo() {
        return emailReplyTo;
    }

    public void setEmailReplyTo(String emailReplyTo) {
        this.emailReplyTo = emailReplyTo;
    }

    public String getInvoiceUrlPrefix() {
        return invoiceUrlPrefix;
    }

    public void setInvoiceUrlPrefix(String invoiceUrlPrefix) {
        this.invoiceUrlPrefix = invoiceUrlPrefix;
    }

    public Integer getThemeTemplateId() {
        return themeTemplateId;
    }

    public void setThemeTemplateId(Integer themeTemplateId) {
        this.themeTemplateId = themeTemplateId;
    }

    public String getStripeAccountId() {
        return stripeAccountId;
    }

    public void setStripeAccountId(String stripeAccountId) {
        this.stripeAccountId = stripeAccountId;
    }

    public String getTwilioSubaccountSid() {
        return twilioSubaccountSid;
    }

    public void setTwilioSubaccountSid(String twilioSubaccountSid) {
        this.twilioSubaccountSid = twilioSubaccountSid;
    }

    public String getTwilioKey() {
        return twilioKey;
    }

    public void setTwilioKey(String twilioKey) {
        this.twilioKey = twilioKey;
    }

    public String getTwilioSecret() {
        return twilioSecret;
    }

    public void setTwilioSecret(String twilioSecret) {
        this.twilioSecret = twilioSecret;
    }
}

