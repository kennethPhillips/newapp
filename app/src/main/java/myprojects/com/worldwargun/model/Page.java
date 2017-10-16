package myprojects.com.worldwargun.model;

/**
 * Created by gener on 10/1/2017.
 */

public class Page {
    private int imageId;
    private int textId;
    private int nextPage;
    private boolean isFinalPage = false;
    private String answer;

    public Page(int imageId, int textId) {
        this.imageId = imageId;
        this.textId = textId;
        this.isFinalPage = true;
    }

    public Page(int imageId, int textId, int nextPage) {
        this.imageId = imageId;
        this.textId = textId;
        this.nextPage = nextPage;
    }

    public void setFinalPage(boolean finalPage) {
        isFinalPage = finalPage;
    }



    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }


    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isFinalPage() {
        return isFinalPage;
    }

    public String getAnswer() {
        return answer;
    }

}
