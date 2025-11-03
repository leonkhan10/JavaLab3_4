public class Protagonist {
    String name;

    public Protagonist(String name) {
        this.name = name;
    }

    public void performCookingShenanigans() {
        System.out.println("...только из его стараний ничего не выходило.");
        System.out.println(name + " положил купленные яйца на стул, а потом сел на них.");
        System.out.println("Пакет с маслом уронил на пол, тут же наступил на него ногой...");
        System.out.println("...и, поскользнувшись, упал да зацепился рукой за чайник с горячей водой...");
        System.out.println("...и выплеснул ее себе прямо на лысину!");
    }

    public void struggleInKitchen() {
        System.out.println("Весь вечер он бился на кухне...");
    }

    public void sleepInChest() {
        System.out.println("...наконец свалился в пустой сундук и заснул в нем.");
    }

    public void goToWork() {
        System.out.println("А наутро побежал устраиваться на работу.");
    }
}