package opgaver.opgave2;

import java.util.ArrayList;
import java.util.List;

public class SwimmerApp {

    public static void main(String[] args) {

        ArrayList<Double> lapTimesJan = new ArrayList<>();
        lapTimesJan.addAll(List.of(1.02, 1.01, 0.99, 0.98, 1.02, 1.04, 0.99));

        Swimmer jan = new Swimmer("Jan", lapTimesJan);

        ArrayList<Double> lapTimesBo = new ArrayList<>();
        lapTimesBo.addAll(List.of(1.05, 1.01, 1.04, 1.06, 1.08, 1.04, 1.02));

        Swimmer bo = new Swimmer("Bo", lapTimesBo);

        ArrayList<Double> lapTimesMikkel = new ArrayList<>();
        lapTimesMikkel.addAll(List.of(1.03, 1.01, 1.02, 1.05, 1.03, 1.06, 1.03));

        Swimmer mikkel = new Swimmer("Mikkel", lapTimesMikkel);

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(jan);
        swimmers.add(bo);
        swimmers.add(mikkel);


        TrainingPlan planA = new TrainingPlan('a', 10, 16);
        planA.addSwimmer(mikkel);

        TrainingPlan planB = new TrainingPlan('b', 10, 6);
        planB.addSwimmer(jan);

        for (Swimmer s : swimmers) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }

        System.out.println("\nPlan A");
        for (Swimmer s : planA.getSwimmers()) {
            System.out.println(s.getName() + "'s samlede træningstid: " + planA.AllTrainingHours());
        }

        System.out.println("\nPlan B");

        for (Swimmer s : planB.getSwimmers()) {
            System.out.println(s.getName() + "'s samlede træningstid: " + planB.AllTrainingHours());
        }
    }
}
