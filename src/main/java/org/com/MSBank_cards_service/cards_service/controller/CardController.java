package org.com.MSBank_cards_service.cards_service.controller;

import org.com.MSBank_cards_service.cards_service.model.Card;
import org.com.MSBank_cards_service.cards_service.service.CardService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/{accountNumber}")
    public ResponseEntity<List<Card>> getCardsByAccountNumber(@PathVariable("accountNumber") String accountNumber){

        return new ResponseEntity<>(cardService.getCardsByAccountNumber(accountNumber),
                HttpStatusCode.valueOf(200));
    }
}
