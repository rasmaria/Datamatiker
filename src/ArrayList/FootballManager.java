package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FootballManager {
        private ArrayList<String> spillere;

        // Du må gerne erstatte med andre fodboldspillere hvis du har nogle favoritter :)
        public FootballManager() {
            this.spillere = new ArrayList<>();
            spillere.add("Alexia Putellas");
            spillere.add("Sam Kerr");
            spillere.add("Aitana Bonmatí");
            spillere.add("Caroline Graham Hansen");
            spillere.add("Ada Hegerberg");
            spillere.add("Megan Rapinoe");
            spillere.add("Alex Morgan");
            spillere.add("Wendie Renard");
        }

        public void visSpillere() {
            System.out.println("\n⚽ FootballManager - Dit Hold:");
            // lav et flot print der fortæller hvilke spillere der er på dit hold
            // Sørg for at give en fejl, hvis der ingen spillere er på holdet
            for (String spiller : spillere) {
                System.out.println(spillere);
                break;
            }
        }

        public void tilføjSpiller(String navn) {
            // Sørg her for at metoden tilføjer en spiller på holdet med parameter: navn
            spillere.add(navn);
            System.out.println("⚽ " + navn + " er tilføjet til holdet!");
        }


        public void søgSpiller(String navn) {
            // Her skal laves en metode der leder efter en bestemt spiller og fortæller om spilleren er på holdet
            // Der skal også gives besked hvis spilleren ikke er på holdet
            for (int i = 0; i < spillere.size(); i++) {
                if (spillere.get(i).equalsIgnoreCase(navn)) {
                    System.out.println(navn + " is on the list at index " + i);
                    return;
                } else {
                    continue;
                }
            }
            System.out.println(navn + " is not on your team.");
        }

        public void sorterSpillere() {
            // Implementer her en metode der returnerer en sorteret liste af spillere
            System.out.println(" Spillere er nu sorteret alfabetisk!");
            Collections.sort(spillere);  //
            for (String i : spillere) {
                System.out.println(i);
            }
        }
    }
