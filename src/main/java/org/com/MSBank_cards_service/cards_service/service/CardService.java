package org.com.MSBank_cards_service.cards_service.service;

import org.com.MSBank_cards_service.cards_service.model.Card;

import java.util.List;

public interface CardService {

    List<Card> getCardsByAccountNumber (String accountNumber);
}
