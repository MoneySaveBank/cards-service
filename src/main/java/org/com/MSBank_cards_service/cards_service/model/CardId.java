package org.com.MSBank_cards_service.cards_service.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CardId implements Serializable {

    private String accountNumber;

    private String cardNumber;
}
