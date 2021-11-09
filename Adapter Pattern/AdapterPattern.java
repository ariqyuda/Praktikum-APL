public class AdapterPattern {
    
    public static void main(String args[]) {
        Kucing kucing = new Meow();
        
        Bebek bebekAneh = new Kwek();
        System.out.println("Suara bebek sebelum berteman dengan kucing : ");
        bebekAneh.kwek();
        System.out.println(" ");
        bebekAneh = new MeowAdapter(kucing);
        System.out.println("Suara bebek setelah berteman dengan kucing : ");
        bebekAneh.kwek();
    }

}
