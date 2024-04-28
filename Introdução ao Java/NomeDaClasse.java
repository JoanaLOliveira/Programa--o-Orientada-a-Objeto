import java.util.Scanner;

public class NomeDaClasse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.next();
        String str2=input.nextLine();
        double numd=input.nextDouble();
        int numi=input.nextInt();
        float numf=input.nextFloat();
        System.out.printf("%s %g %d %f %n",str,numd,numi,numf);
        input.close();
    }
}
