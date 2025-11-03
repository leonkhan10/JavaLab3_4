public class StorySimulator {

    public static void main(String[] args) {
        
        System.out.println("--- Часть первая: история магазина. ---");

      
        Person storyteller = new Person("Он");
        Person spruts = new Person("Спрутс");

       
        Shop oldShop = new Shop();
        oldShop.addProduct("ружья");
        oldShop.addProduct("пистолеты");
        oldShop.addProduct("порох");
        oldShop.addProduct("пироксилин");
        oldShop.addProduct("динамит");
        oldShop.addProduct("другие взрывчатые вещества");

        storyteller.tellStory(spruts, oldShop.describeStory());

        System.out.println("\n--- Часть вторая: телепрограмма. ---");

        TV television = new TV();

        TVShow spaceShow = new SpaceProgram();
        television.playShow(spaceShow);
        
        television.stopCurrentShow();

        Protagonist mainCharacter = new Protagonist("какой-то бывший богач");
        TVShow comedy = new FilmComedy(mainCharacter);

        television.playShow(comedy);
    }
}