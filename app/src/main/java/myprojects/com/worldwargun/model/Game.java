package myprojects.com.worldwargun.model;

import android.content.Intent;

import myprojects.com.worldwargun.R;
import myprojects.com.worldwargun.ui.GameActivity;
import myprojects.com.worldwargun.ui.SubmitActivity;

/**
 * Created by gener on 10/1/2017.
 */

public class Game {
    private Page[] pages;

    public Game() {
        pages = new Page[20];

        pages[0] = new Page(R.drawable.p64, R.string.page_0, 1);
        pages[0].setAnswer("czech cz 52");
        pages[1] = new Page(R.drawable.fitzspecial, R.string.page_1, 2);
        pages[1].setAnswer("p64");
        pages[2] = new Page(R.drawable.albiesen, R.string.page_2, 3);
        pages[2].setAnswer("fitz special");
        pages[3] = new Page(R.drawable.winchester, R.string.page_3, 4);
        pages[3].setAnswer("al biesen rifle");
        pages[4] = new Page(R.drawable.waltherccp, R.string.page_4, 5);
        pages[4].setAnswer("winchester 1886");
        pages[5] = new Page(R.drawable.coltle6920, R.string.page_5, 6);
        pages[5].setAnswer("walther ccp");
        pages[6] = new Page(R.drawable.mossbergsilver2, R.string.page_6, 7);
        pages[6].setAnswer("colt le6920");
        pages[7] = new Page(R.drawable.m1909benetmercie, R.string.page_7, 8);
        pages[7].setAnswer("mossberg silver reserve 2");
        pages[8] = new Page(R.drawable.axelsontacticaltributerifle, R.string.page_8, 9);
        pages[8].setAnswer("k106 hotchkiss bent-mercie");
        pages[9] = new Page(R.drawable.federovavtomat, R.string.page_9, 10);
        pages[9].setAnswer("axelson tactical murphy tribute");
        pages[10] = new Page(R.drawable.beretam1918, R.string.page_10, 11);
        pages[10].setAnswer("federov avtomat");
        pages[11] = new Page(R.drawable.ak47, R.string.page_11, 12);
        pages[11].setAnswer("beretta m1918");
        pages[12] = new Page(R.drawable.ar15, R.string.page_12, 13);
        pages[12].setAnswer("ak47");
        pages[13] = new Page(R.drawable.m16, R.string.page_13, 14);
        pages[13].setAnswer("ar15");
        pages[14] = new Page(R.drawable.barrettm82, R.string.page_14, 15);
        pages[14].setAnswer("m16 assault rifle");
        pages[15] = new Page(R.drawable.rpg7, R.string.page_15, 16);
        pages[15].setAnswer("barrett m82");
        pages[16] = new Page(R.drawable.glock19, R.string.page_16, 17);
        pages[16].setAnswer("rpg7");
        pages[17] = new Page(R.drawable.uzi, R.string.page_17, 18);
        pages[17].setAnswer("glock 19");
        pages[18] = new Page(R.drawable.milkormgl, R.string.page_18, 19);
        pages[18].setAnswer("uzi");
        pages[19] = new Page(R.drawable.thatsallfolks, R.string.page_19);
        pages[19].setAnswer("milkor mgl");
    }

    public Page getPage(int pageNumber) {
        if (pageNumber >= pages.length) {
          pageNumber = 0;
        }
        return pages[pageNumber];
    }



}
