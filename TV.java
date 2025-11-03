public class TV {
    private TVShow currentShow;

    public void playShow(TVShow show) {
        this.currentShow = show;
        System.out.println("[Телевидение] Началась передача: " + show.title);
        this.currentShow.play();
    }

    public void stopCurrentShow() {
        if (this.currentShow != null) {
            System.out.println("[Телевидение] " + this.currentShow.title + " закончилась.");
            this.currentShow = null;
        }
    }
}