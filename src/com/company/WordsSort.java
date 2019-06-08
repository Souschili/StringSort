package com.company;

public class WordsSort {
    private String [] wordList;

    public WordsSort(String[] wordList) {
        this.wordList = wordList;
    }

    public String [] lowBuble()
    {

        for (int i=0;i<wordList.length-1;i++)
        {
            for (int j=i+1;j<wordList.length;j++)
            {
                if(wordList[i].length()>wordList[j].length())
                {
                    String  t=wordList[i];
                    wordList[i]=wordList[j];
                    wordList[j]=t;
                }
            }
        }

        return wordList;
    }


    public String [] higthBuble()
    {

        for (int i=0;i<wordList.length-1;i++)
        {
            for (int j=i+1;j<wordList.length;j++)
            {
                if(wordList[i].length()<wordList[j].length())
                {
                    String  t=wordList[i];
                    wordList[i]=wordList[j];
                    wordList[j]=t;
                }
            }
        }

        return wordList;
    }
}
