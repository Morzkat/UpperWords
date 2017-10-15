package sample.DecorateText;

import sample.CreateText.printWritterDecorate;

public abstract class DecorateText extends printWritterDecorate
{
    private printWritterDecorate print;

    public abstract void setTextToUpper(String text);

}
