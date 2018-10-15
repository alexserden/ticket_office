package repository.io;


import model.Ticket;
import model.Type;
import repository.TicketRepository;
import repository.buider.TicketBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class JavaIOSearchTicketRepositoryImpl implements TicketRepository {

    Path path = Paths.get("src/main/resource/tickets.csv");

    @Override
    public void save(Ticket t) throws IOException {
        String text;
        if(t.getType()==Type.Business) {
             text = "\n" + t.getId()+","+t.getRoute().getRoute()+","+t.getRoute().getDeparture()+","+
                     t.getRoute().getArrival()+","+t.getRoute().getDeparture().getDate()+","+t.getRoute().getArrival().getDate()+", Business Class";
        }else{
             text = "\n"+ t.getId()+","+t.getRoute().getRoute()+","+t.getRoute().getDeparture()+","+
                    t.getRoute().getArrival()+","+t.getRoute().getDeparture().getDate()+","+t.getRoute().getArrival().getDate() + ", Economy Class";

        }
        Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
    }

    @Override
    public void update(Ticket ticket) throws IOException, ParseException {
        List<Ticket> ticketList = new ArrayList();
        BufferedReader reader = Files.newBufferedReader(path);
        while(reader.ready()){
            TicketBuilder ticketBuilder = new TicketBuilder();
            String[] massTickets = reader.readLine().split(",");

            ticketBuilder.createTicket(Long.parseLong(massTickets[0]),massTickets[1],massTickets[2],massTickets[3],massTickets[4],massTickets[5],massTickets[6]);
               if(ticket.equals(ticketBuilder.getTicket())) {
                   ticketList.add(ticket);
               }else{
                   ticketList.add(ticketBuilder.getTicket());
               }
            }
        BufferedWriter writer = Files.newBufferedWriter(path);
        for(Ticket t : ticketList){
            if(t.getType()==Type.Business){
                writer.write(t.getId()+","+t.getRoute().getRoute()+","+t.getRoute().getDeparture()+","+
                        t.getRoute().getArrival()+","+t.getRoute().getDeparture().getDate()+","+t.getRoute().getArrival().getDate()+", Business Class");
            }else{
                writer.write(t.getId()+","+t.getRoute().getRoute()+","+t.getRoute().getDeparture()+","+
                        t.getRoute().getArrival()+","+t.getRoute().getDeparture().getDate()+","+t.getRoute().getArrival().getDate()+", Economy Class");

            }

        }
        reader.close();
        writer.close();
        }


    @Override
    public void delete(Long id) throws IOException, ParseException {
       List<Ticket> ticketList = new ArrayList();
        BufferedReader reader = Files.newBufferedReader(path);
         while(reader.ready()){
             TicketBuilder ticketBuilder = new TicketBuilder();
             String[] massTickets = reader.readLine().split(",");
             if(Long.parseLong(massTickets[0])!=id){
                 ticketBuilder.createTicket(Long.parseLong(massTickets[0]),massTickets[1],massTickets[2],massTickets[3],massTickets[4],massTickets[5],massTickets[6]);
                 ticketList.add(ticketBuilder.getTicket());
             }
         }

        BufferedWriter writer = Files.newBufferedWriter(path);
         for(Ticket t : ticketList){
             if(t.getType()==Type.Business){
                 writer.write(t.getId()+","+t.getRoute().getRoute()+","+t.getRoute().getDeparture()+","+
                         t.getRoute().getArrival()+","+t.getRoute().getDeparture().getDate()+","+t.getRoute().getArrival().getDate()+", Business Class");
             }else{
                 writer.write(t.getId()+","+t.getRoute().getRoute()+","+t.getRoute().getDeparture()+","+
                         t.getRoute().getArrival()+","+t.getRoute().getDeparture().getDate()+","+t.getRoute().getArrival().getDate()+", Economy Class");

             }

         }
         reader.close();
         writer.close();

    }

  @Override
   public Ticket getById(Long id) throws IOException, ParseException {

        BufferedReader reader = Files.newBufferedReader(path);
       Ticket ticket = null;
        while(reader.ready()) {
            TicketBuilder ticketBuilder = new TicketBuilder();
            String[] massTickets = reader.readLine().split(",");
            if(Long.parseLong(massTickets[0])==id){
                ticketBuilder.createTicket(Long.parseLong(massTickets[0]),massTickets[1],massTickets[2],massTickets[3],massTickets[4],massTickets[5],massTickets[6]);
                ticket = ticketBuilder.getTicket();
                }
        }
        reader.close();

       return ticket;
    }

    @Override
    public List<Ticket> getAll() throws IOException, ParseException {

        List<Ticket> ticketsList = new ArrayList<>();
        BufferedReader reader = Files.newBufferedReader(path);
        Ticket ticket;
        while(reader.ready()){
           TicketBuilder ticketBuilder = new TicketBuilder();

           String [] massTickets = reader.readLine().split(",");
         ticketBuilder.createTicket(Long.parseLong(massTickets[0]),massTickets[1],massTickets[2],massTickets[3],massTickets[4],massTickets[5],massTickets[6]);
        ticket =  ticketBuilder.getTicket();
           ticketsList.add(ticket);
        }
        reader.close();
        return ticketsList;
    }
}