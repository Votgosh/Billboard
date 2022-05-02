package Kino;

public class BillboardManager {
    private String[] nameMovie = new String[0];
    private int totalMovie = 10;

    public BillboardManager() {
    }

    public BillboardManager(int totalMovie) {
        this.totalMovie = totalMovie;
    }

    public String[] getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String[] nameMovie) {
        this.nameMovie = nameMovie;
    }

    public int getTotalMovie() {
        return totalMovie;
    }

    public void setTotalMovie(int totalMovie) {
        this.totalMovie = totalMovie;
    }

    public void add(String movieAdd) {
        int length = nameMovie.length + 1;
        String[] tmp = new String[length];
        for (int i = 0; i < length - 1; i++) {
            tmp[i] = nameMovie[i];
        }
        tmp[length - 1] = movieAdd;
        nameMovie = tmp;
    }

    public void findAll() {
        getNameMovie();
    }

    public void findLast() {
        int resultLength = nameMovie.length;
        if (resultLength > totalMovie) {
            resultLength = totalMovie;
        }
        String[] tmp = new String[resultLength];
        int code = nameMovie.length - 1;
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = nameMovie[code - i];
        }
        nameMovie = tmp;
    }
}
