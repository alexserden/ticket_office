package model;

public class Aircraft extends IdEntity{
   private String name;
    private int vacancies;

    public Aircraft(Long id, String name, int vacancies) {
        super(id);
        this.name = name;
        this.vacancies = vacancies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVacancies() {
        return vacancies;
    }

    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }
}
