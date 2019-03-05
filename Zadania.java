import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadania {
    private int licznik=0,liczba,pomoc=0;

    public void CwiczenieJeden(){

        List<Integer> liczby=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj 10 liczb:");

        for(int i=0;i<10;i++){
            liczba=scan.nextInt();
            liczby.add(liczba);
        }
        for(int a:liczby){
            if(liczby.indexOf(a)==liczby.lastIndexOf(a)){
                licznik++;
            }
        }
        System.out.println("Liczba unikatowych elementow: "+licznik);
    }

    public void CwiczenieDwa(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj ciag zer oraz jedynek:");
        String sequence=scan.nextLine();
        System.out.println(sequence);
        Pattern pattern=Pattern.compile("10+1");
        Matcher matcher=pattern.matcher(sequence);
        while(matcher.find(pomoc)) {
            licznik++;
            pomoc = matcher.end() - 1;
        }System.out.println("Liczba dziur to: "+licznik);
    }

    public void CwiczenieTrzy(){
        Scanner wpisz=new Scanner(System.in);
        Set<Integer> zbiorA=new HashSet<Integer>();
        Set<Integer>zbiorB=new HashSet<Integer>();
        System.out.println("Podaj zbior A (5 liczb): ");
        for(int i=0;i<5;i++){
            zbiorA.add(wpisz.nextInt());
        }
        System.out.println("Podaj zbior B (5 liczb) ");
        for(int j=0;j<5;j++){
            zbiorB.add(wpisz.nextInt());
        }
        System.out.println("Podane zbiory to: \n"+zbiorA +"\n"+zbiorB);
        Set<Integer>suma=new HashSet<>(zbiorA);
        suma.addAll(zbiorB);

        Set<Integer>common=new HashSet<>(zbiorA);
        common.retainAll(zbiorB);

        Set<Integer> difference=new HashSet<>(zbiorA);
        difference.removeAll(zbiorB);

        Set<Integer>symmetrical_difference=new HashSet<>(zbiorA);
        symmetrical_difference.addAll(zbiorB);
        symmetrical_difference.removeAll(common);

        System.out.println("Suma zbiorów to: "+suma+"\nRoznica zbiorow to: "+ difference+"\nCzesc wspolna zbiorow to: "+common+"\nRoznica symetryczna zbiorow to: "+symmetrical_difference);

    }

}




