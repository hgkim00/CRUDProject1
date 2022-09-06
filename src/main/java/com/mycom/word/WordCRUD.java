package com.mycom.word;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD {
    ArrayList<Word> list;
    Scanner s;

    public WordCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }
     /*
        => 난이도(1,2,3) & 새 단어 입력: 1 driveway
        뜻 입력: 차고 진입로
        새 단어가 단어장에 추가되었습니다.
     */
    @Override
    public Object add() {
        // 사용자에게 입력 받는 메소드
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력: ");
        int level = s.nextInt();
        String word = s.nextLine();

        System.out.print("뜻 입력: ");
        String meaning = s.nextLine();

        return new Word(0, level, word, meaning);
    }

    public void addWord() {
        // add()에서 받은 데이터를 리스트에 넣는 메소드
        Word word = (Word) add();
        list.add(word);
        System.out.println("단어가 성공적으로 추가되었습니다!!");
    }

    @Override
    public void selectOne(Object obj) {

    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    /*

    => 원하는 메뉴는? 1
    ----------------------------------
    1 ***       superintendent  관리자, 감독관
    2 *               electric  전기의, 전기를 생산하는
    3 **             equipment  장비, 용품
    ----------------------------------

     */
    public void listAll() {
        System.out.println("-----------------------------------");
        for (int i=0; i<list.size(); i++) {
            System.out.print(i+1 + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("-----------------------------------");
    }
}
