package org.com.MSBank_cards_service.cards_service.repository;

import org.com.MSBank_cards_service.cards_service.model.Card;
import org.com.MSBank_cards_service.cards_service.model.CardId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, CardId> {

    List<Card> findByAccountNumber (String accountNumber);
}
