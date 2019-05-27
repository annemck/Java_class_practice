public class Printer {

    private int pages;
    private int tonerVolume;

    public Printer(int pages, int toner){
        this.pages = pages;
        this.tonerVolume = toner;
    }

    public int pagesLeft(){
        return this.pages;
    }

    public void print(int pages, int copies){
        int totalPages = pages * copies;
        if (totalPages <= this.pages){
            this.pages -= totalPages;
            this.tonerVolume -= totalPages;
        }
    }

    public int checkToner(){
        return this.tonerVolume;
    }

}
