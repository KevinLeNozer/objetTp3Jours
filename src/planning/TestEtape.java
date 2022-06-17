package planning;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TestEtape {
    public static void main(String[] args) {

        Etape testDuneEtapeSeule=new Etape("Le chemin du Java",128);
        System.out.println("L'étape nommée "+testDuneEtapeSeule.getDescriptionPrevue()+" a une " +
                "durée égale à "+testDuneEtapeSeule.donneDureePrevueHHMM().format(DateTimeFormatter.ofPattern("HH:mm")));
        List<Etape> lesEtapes = new ArrayList<>();
        lesEtapes.add(testDuneEtapeSeule);lesEtapes.add(new Etape("La modélisation objet",14));
        MiniExcursion maMiniExc = new MiniExcursion("le parcours objet", 15,lesEtapes);
        lesEtapes.add(new Etape("Le blabla du payant",14));System.out.println("La mini excursion nommée "+maMiniExc.getLibelleMiniExcursion()+" a une durée égale à "+maMiniExc.donneDureePrevueHHMM().format(DateTimeFormatter.ofPattern("HH:mm")));
        MiniExcursionPayante maMiniExcPay = new MiniExcursionPayante("le parcours Java extraordinaire", 15,lesEtapes,1240);
        System.out.println("La mini excursion payante nommée "+maMiniExcPay.getLibelleMiniExcursion()+" a une durée égale à " + maMiniExcPay.donneDureePrevueHHMM().format(DateTimeFormatter.ofPattern("HH:mm"))+ " et coute: "+maMiniExcPay.getTarif()+" euros");

        MiniExcursionPlanifie maMiniExcPlanifA=new MiniExcursionPlanifie(LocalDate.now(),15,maMiniExcPay);
        if (maMiniExcPlanifA.estComplete() == true)
        {
            System.out.println("La mini excursion planifiee est complête");
        }
        else {
            System.out.println("Il reste des places pour la mini excursion planifiee");
        }

        MiniExcursionPlanifie maMiniExcPlanifB = new MiniExcursionPlanifie("08:15:00",14,maMiniExc);
        List<MiniExcursionPlanifie> lesMini = new ArrayList<>();
        lesMini.add(new MiniExcursionPlanifie(LocalDate.now(),3,maMiniExc));
        lesMini.add(maMiniExcPlanifA);PlanningJournee monPlanningJournee = new PlanningJournee(LocalDate.now(), lesMini);
        System.out.println("Le planning de la journée :"+monPlanningJournee.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yy"))+" aura pour excursion(s):"); for(MiniExcursionPlanifie miniExc : monPlanningJournee.getMiniExcursionsPlanifies());
    }

}
