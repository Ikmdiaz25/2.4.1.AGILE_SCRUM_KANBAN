package src;
import java.util.Scanner;

public class menua {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String BERDEA = "\u001B[32m";
        String HORIA = "\u001B[33m";
        String URDINA = "\u001B[34m";
        String GORRIA = "\u001B[31m";
        String reset = "\u001B[0m";

        while (true) {
            System.out.println(BERDEA + "Sartu nahi nahi duzun zenbakia:");
            System.out.println(HORIA + "1." + reset + "(2.4.1 - Metodo arinak(Agileak)/Medoto tradizionalak");
            System.out.println(HORIA + "2." + reset + "(2.4.2 - Scrum Metodologia Agile-ak)");
            System.out.println(HORIA + "3." + reset + "(2.4.3 - Kanban)");
            System.out.println(HORIA + "4." + reset + "Irten");

            int aukera = sc.nextInt();

            switch (aukera) {

                case 1:
                    System.out.println(HORIA + "Hona hemen informazioa:" + reset);

                    System.out.println(URDINA +
                            "Urte askotan zehar, softwarearen garapena metodo tradizionaletan oinarritu izan da, " +
                            "hala nola ur-jauzi ereduan. Metodo honek urrats zorrotz eta ordenatuak jarraitzen ditu: " +
                            "lehenik azterketa sakona egiten da, ondoren diseinua, gero programazioa, probak eta azkenik "
                            +
                            "ezarpena eta mantentzea.\n" +
                            "Metodo honen abantaila nagusia kontrola eta planifikazio zehatza dira, baina arazo handiena "
                            +
                            "malgutasun falta da; behin urratsak hasita, zaila da aldaketak egitea proiektua guztiz aldatu gabe.\n"
                            +
                            "Metodo arinak (Agile) erantzun gisa sortu ziren, proiektuak zatika eta modu errepikakorrean "
                            +
                            "garatzeko filosofia berri gisa. Agile metodologiak helburu du aldaketetara azkar egokitzea, "
                            +
                            "talde eta bezeroaren arteko komunikazioa hobetzea eta emaitzak azkarrago eskaintzea.\n" +
                            "Horren ondorioz, abantailak dira abiadura handiagoa, gardentasuna eta malgutasuna, baina "
                            +
                            "baditu desabantailak ere: zaila da denbora eta aurrekontua zehaztasunez kalkulatzea, " +
                            "esperientzia duten taldeak behar dira eta bezeroaren parte-hartze aktiboa ezinbestekoa da "
                            +
                            "prozesu osoan zehar." + reset);
                    break;

                case 2:
                    System.out.println(HORIA + "Hona hemen informazioa:" + reset);

                    System.out.println(URDINA +
                            "Scrum metodologia arinen artean ezagunena eta erabiliena da software garapenean. " +
                            "Bere helburu nagusia da taldeei elkarrekin modu antolatuan eta eraginkorrean lan egiten laguntzea, "
                            +
                            "balioa azkar eta etengabe entregatzeko.\n" +
                            "Scrum sisteman lana Sprint izeneko ziklo laburretan banatzen da, normalean bi eta lau aste bitarteko iraupenez. "
                            +
                            "Sprint bakoitzaren hasieran egiten da Sprint Planning izeneko bilera, non taldeak erabakiko duen zer lan egingo duen, "
                            +
                            "eta ondoren egunero egiten da Daily Scrum izeneko 15 minutuko bilera laburra, non kide bakoitzak azaltzen du atzo "
                            +
                            "zer egin zuen, gaur zer egingo duen eta zer oztopo dituen.\n" +
                            "Sprintaren amaieran emaitzak berrikusten dira eta hurrengo sprinta hobetzeko hausnarketa egiten da. "
                            +
                            "Rolak funtsezkoak dira: Product Owner-ak lehentasunak ezartzen ditu, Scrum Master-ak prozesua gidatzen du eta "
                            +
                            "taldeak lana gauzatzen du. Scrum-ek autoantolaketa, komunikazio etengabea eta hobekuntza jarraitua sustatzen ditu.\n"
                            +
                            "Gainera, Planning Poker bezalako teknikak erabiltzen dira lanaren zailtasuna kalkulatzeko, eta user stories edo "
                            +
                            "erabiltzailearen istorioak funtzionalitateak azaltzeko. Scrum-en abantaila nagusia da emaitzak azkar erakustea eta "
                            +
                            "aldaketetara egokitzeko gaitasuna galdu gabe proiektuaren erritmoa mantentzea." + reset);
                    break;

                case 3:
                    System.out.println(HORIA + "Hona hemen informazioa:" + reset);

                    System.out.println(URDINA +
                            "Kanban beste metodologia arin bat da, baina Scrum baino errazagoa eta bisualagoa. " +
                            "Metodo honek lanaren fluxua bistaratzen du, normalean taula baten bidez, non zutabeak jartzen diren \"Egiteke\", "
                            +
                            "\"Lanean\" eta \"Eginda\" moduan.\n" +
                            "Proiektuaren zeregin bakoitza zutabe horietako batean kokatzen da, eta horrela uneoro ikus daiteke zein lan dagoen "
                            +
                            "martxan eta nor ari den egiten.\n" +
                            "Kanban ez da Sprints bidez lan egiten duen sistema bat, baizik eta lan jarraitua egiten du, zereginak gehituz eta "
                            +
                            "mugituz taldearen gaitasunaren arabera.\n" +
                            "Bere printzipio garrantzitsuenetako bat da lanaldi berean egiten diren zeregin kopurua mugatzea (WIP - Work In Progress), "
                            +
                            "gehiegizko lana eta \"lepo estuak\" saihesteko. Helburua da lanaren errendimendua hobetzea eta prozesua etengabe fintzea.\n"
                            +
                            "Scrum ez bezala, Kanbanek ez du rol zehatzik behar, ezta derrigorrezko bilerarik ere, nahiz eta horiek lagungarri izan daitezkeen. "
                            +
                            "Bere sinpletasunari, malgutasunari eta aplikazio errazari esker, Kanban metodologia oso erabilgarria da edozein lan-taldetan "
                            +
                            "antolaketa eta gardentasuna hobetzeko." + reset);
                    break;

                case 4:
                    System.out
                            .println(HORIA + "!" + GORRIA + " SEGURU ZAUDE IRTEN NAHI DUZULA?" + HORIA + " !" + reset);
                    System.out.println( "Idatzi:" +BERDEA +"Bai / "+GORRIA+"Ez" + reset);

                    sc.nextLine(); 

                    String erantzuna = sc.nextLine(); 
                    if (erantzuna.contains("Bai")) {
                        System.out.println(URDINA + "Programa amaitu da. Agur!" + reset);
                        System.exit(0);
                    } else if (erantzuna.contains("Ez")) {
                        System.out.println(HORIA + "Menura bueltatzen..." + reset);
                        break;
                    } else {
                        System.out.println(GORRIA + "Ez dut ulertu erantzuna. Saiatu berriro." + reset);
                    }
                    break;

            }
        }

    }

}