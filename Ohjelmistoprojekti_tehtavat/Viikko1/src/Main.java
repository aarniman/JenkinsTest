import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Asiakas> ll = new LinkedList<Asiakas>();
        double sum = 0;

        while(true){
            System.out.println("1: lisää, 2: poista, 3: lopeta");
            int cho = Integer.parseInt(scanner.nextLine());
            if(cho == 1){
                Asiakas a = new Asiakas();
                ll.add(a);
            } else if (cho == 2) {
                ll.getFirst().setEnd();
                double time = (double) (ll.getFirst().getEnd() - ll.getFirst().getStart()) / 1000;
                System.out.println("ID: " + ll.getFirst().getId());
                System.out.println(time + " s");
                sum += time;
                ll.removeFirst();
            } else if (cho == 3) {
                break;
            }else{
                System.out.println("Please enter a valid option");
            }
        }
        double avg = sum / ll.getLast().getId();
        System.out.println("Average time in line was " + avg + " seconds.");
    }
}