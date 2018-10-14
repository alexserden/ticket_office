package repository.exception;

public class NoVacanciesException extends Exception {
    public NoVacanciesException(){
        System.out.println("Нет свободных мест");
    }
}