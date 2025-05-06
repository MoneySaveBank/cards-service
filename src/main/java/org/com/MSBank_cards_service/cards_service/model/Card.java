package org.com.MSBank_cards_service.cards_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cards")
@IdClass(CardId.class)
public class Card {

    @Id
    private String accountNumber;

    @Id
    private String cardNumber;

    private String cardType;

    private String status;

    private String creationDate;
}
