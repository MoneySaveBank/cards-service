package org.com.MSBank_cards_service.cards_service.business;

import org.com.MSBank_cards_service.cards_service.model.Card;
import org.com.MSBank_cards_service.cards_service.repository.CardRepository;
import org.com.MSBank_cards_service.cards_service.service.CardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public List<Card> getCardsByAccountNumber(String accountNumber) {
        return cardRepository.findByAccountNumber(accountNumber);
    }
}
