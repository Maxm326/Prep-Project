package com.stackleader.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;


@Entity
@XmlRootElement
@Table(name = "property")
@Data
@Builder
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class property implements Serializable {

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

}

