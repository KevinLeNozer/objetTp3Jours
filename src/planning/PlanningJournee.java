package planning;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlanningJournee {
    private LocalDate date;
    List<MiniExcursionPlanifie> miniExcursionPlanifies = new ArrayList<>();

    public PlanningJournee(LocalDate date, List<MiniExcursionPlanifie> miniExcursionPlanifies) {
        // définit le constructeur avec les éléments passés en paramètres
        this.setDate(date);
    }

    public List<MiniExcursionPlanifie> getMiniExcursionsPlanifies() {
        //  retourne les mini excursions planifiées
        return miniExcursionPlanifies;
    }

    public void setMiniExcursionsPlanifies(List<MiniExcursionPlanifie> miniExcursionPlanifies) {
        //  redéfinit les mini excursions planifiées
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
