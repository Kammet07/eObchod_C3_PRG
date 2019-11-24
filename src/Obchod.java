public class Obchod {

    public static void main(String[] args) {
        Obchod ob = new Obchod();

        Electronics Televize = new Electronics(14490, "KD-49XG8096", "Sony Bravia");
        Electronics Mycka = new Electronics(10852, "SMS46KI03E", "BOSCH");
        Electronics Repraky = new Electronics(6585, "BDV-E2100", "Sony");

        ob.vypisElectronics(Televize);
        ob.vypisElectronics(Mycka);
        ob.vypisElectronics(Repraky);

        Drugs Mydlo = new Drugs(126, "Classic", "PRORASO");
        Drugs Sampon = new Drugs(389, "Cerafill Retaliate", "REDKEN");
        Drugs ZubPasta = new Drugs(485, "Black is White", "CURAPROX");

        ob.vypisDrugs(Mydlo);
        ob.vypisDrugs(Sampon);
        ob.vypisDrugs(ZubPasta);

        Books DenTrifidu = new Books(242, "Den Trifidu", "Wyndham John");
        Books StarecAMore = new Books(269, "Starec a more", "Hemingway Ernest");
        Books Zaklinac = new Books(332, "Zaklinac I: Posledni prani", "Sapkowski Andrzej");

        ob.vypisBooks(DenTrifidu);
        ob.vypisBooks(StarecAMore);
        ob.vypisBooks(Zaklinac);
    }

    public void vypisElectronics(Electronics el){
        System.out.println("Electronics\n\tCena: " + el.getPrice() + "\n\tNazev: " + el.getName() + "\n\tZnacka: " + el.getLabel());
    }

    public void vypisDrugs(Drugs dr){
        System.out.println("Drugs\n\tCena: " + dr.getPrice() + "\n\tNazev: " + dr.getName() + "\n\tVyrobce: " + dr.getManufacturer());
    }

    public void vypisBooks(Books bo){
        System.out.println("Books\n\tCena: " + bo.getPrice() + "\n\tNazev: " + bo.getName() + "\n\tAutor: " + bo.getAuthor());
    }

}
