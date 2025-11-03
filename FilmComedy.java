public class FilmComedy extends TVShow {
    private Protagonist protagonist;

    public FilmComedy(Protagonist protagonist) {
        this.title = "Новая кинокомедия";
        this.protagonist = protagonist;
    }

    @Override
    public void play() {
        System.out.println("Показывают кинокомедию про " + protagonist.name + ", который не хотел работать.");
        System.out.println("Так как его отказались кормить в столовой, он решил готовить для себя сам...");
        
        protagonist.performCookingShenanigans();
        protagonist.struggleInKitchen();
        protagonist.sleepInChest();
        protagonist.goToWork();
    }
}