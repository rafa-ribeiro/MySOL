package com.mysol.app.schedulinginvestors;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SchedulingInvestors {

    /**
     * Esse método recebe duas listas de valores inteiros positivos de mesmo tamanho. O tamanho das listas representa
     * a quantidade de investidores que há para serem encontrados para agendamento de reuniões.
     *
     * A lista S possui o primeiro dia disponível na agenda do investidor e a lista E o último dia disponível, assim
     * para o índice 5 de cada lista, S[5] representa o primeiro dia disponível para o investidor 5, até o dia E[5],
     * representando último dia disponível.
     *
     * Dado isso, o método tem como objetivo retornar o número máximo de reuniões que poderão ser agendadas dadas as
     * restrições de cada investidor dentro do período.
     *
     * @param s Lista contendo o primeiro dia de disponibilidade para encontro com o investidor.
     * @param e Lista contendo o último dia de disponibilidade para encontro com o investidor.
     * @return Quantidade de dias em que será possível encontrar o máximo de investidores.
     */
    public int scheduleMaxMeetings(List<Integer> s, List<Integer> e) {
        Set<Integer> schedule = new HashSet<>();
        int investorsToMeeting = s.size();

        for (int i = 0; i < investorsToMeeting; i++) {
            int firstDay = s.get(i);
            int endDay = e.get(i);

            int day = firstDay;
            boolean scheduled = false;
            while (day <= endDay && !scheduled) {
                if (!schedule.contains(day)) {
                    schedule.add(day);
                    scheduled = true;
                }
                day++;
            }
        }
        return schedule.size();
    }

}
