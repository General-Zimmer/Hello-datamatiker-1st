package modul.opgave3;

import java.util.List;

public class Util {

    public static double getAverage(double[] grades) {

        double i = 0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
            i++;
        }
        return sum/i;
    }

    public static int getcorrectAnswers(Student.answers[] answers, Student.answers[] correctAnswers) {
        int correctAnswersCount = 0;


        for (int i = 0; i < correctAnswers.length; i++)
            if (answers[i] == correctAnswers[i])
                correctAnswersCount++;

        return correctAnswersCount;
    }

    public static Team getTeam(Team[] teams, String teamName) {
        for (Team team : teams) {

            if (team != null && teamName.equalsIgnoreCase(team.getName()))
                return team;

        }
        return null;
    }

}
