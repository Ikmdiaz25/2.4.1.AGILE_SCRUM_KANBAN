import java.util.Scanner;

public class menua {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String BERDEA = "\u001B[32m";
        String HORIA = "\u001B[33m";
        String URDINA = "\u001B[34m";
        String GORRIA= "\u001B[31m";
        String reset = "\u001B[0m";

        while (true) {
            System.out.println(BERDEA + "Sartu nahi nahi duzun zenbakia:");
            System.out.println(HORIA + "1." + reset + "(2.4.1 - Metodologien bilakaera Garapen Arina/Sarrera)");
            System.out.println(HORIA + "2." + reset + "(2.4.2 - Scrum Metodologia Agile-ak)");
            System.out.println(HORIA + "3." + reset + "(2.4.3 - Kanban)");
            System.out.println(HORIA + "4." + reset + "Irten");

            int aukera = sc.nextInt();

            switch (aukera) {

                case 1:


                    System.out.println(HORIA + "Hona hemen informazioa:"+ reset);




                    break;

                case 2:

                    System.out.println(HORIA + "Hona hemen informazioa:" + reset);

                    break;

                case 3:

                    System.out.println(HORIA + "Hona hemen informazioa:" + reset);

                    break;

                case 4:

                    System.out.println(HORIA +"!"+GORRIA+ "SEGURU ZAUDE IRTEN NAHI DUZULA?"+ HORIA +"!"+reset);
                    System.out.println(BERDEA+"Bai/"+GORRIA+"Ez"+reset);

                     String baiez= sc.nextLine();   

                     if(baiez.contains("Bai")){

                        System.exit(0);



                     }
                     else if(baiez.contains("Ez")){

                        break;


                     }

                    

                    break;

            }
        }

    }

}