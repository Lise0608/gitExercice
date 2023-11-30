class Elie{
    private String prenom="elie";
    public void afficher(){
        sys.out.println(prenom);
    }

    public static void main(){
        Elie elie = new Elie();
        elie.afficher();
    }
}