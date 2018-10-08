package service;


import repository.BuyTicketRepositoryImpl;
import repository.io.JavaIOBuyTicketRepositoryImpl;

public class BuyTicketService {
   BuyTicketRepositoryImpl buyTicketService;
    public BuyTicketService() {
        buyTicketService = new JavaIOBuyTicketRepositoryImpl();
        }
       void buyTicketByID(Long id){
        buyTicketByID(id);
       }
}
