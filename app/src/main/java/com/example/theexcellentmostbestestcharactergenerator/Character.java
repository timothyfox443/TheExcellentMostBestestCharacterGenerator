package com.example.theexcellentmostbestestcharactergenerator;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "characters")
public class Character
{
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "characterId")
    private int charId; // this is the primary key for the Character class

    @ColumnInfo(name = "Name")
    private String charName;  // this is the character's strength (Str) attribute

    @ColumnInfo(name = "Strength")
    private int charStr;  // this is the character's strength (Str) attribute

    @ColumnInfo(name = "Dexterity")
    private int charDex; // this is the character's dexterity (Dex) attribute

    @ColumnInfo(name = "Agility")
    private int charAgi; // this is the character's Agility (Agi) attribute

    @ColumnInfo(name = "Endurance")
    private int charEnd; // this is the character's Endurance (End) attribute

    @ColumnInfo(name = "Intelligence")
    private int charInt; // this is the character's Intelligence (Int) attribute

    @ColumnInfo(name = "Wisdom")
    private int charWis; // this is the character's Wisdom (Wis) attribute

    public Character(String charName, int charStr, int charDex, int charAgi, int charEnd, int charInt, int charWis)
    {
        this.charId = charId;
        this.charName = charName;
        this.charStr = charStr;
        this.charDex = charDex;
        this.charAgi = charAgi;
        this.charEnd = charEnd;
        this.charInt = charInt;
        this.charWis = charWis;
    }


    public int getCharId()
    {
        return this.charId;
    }

    public String getCharName() { return this.charName; }

    public int getCharStr()
    {
        return this.charStr;
    }

    public int getCharDex()
    {
        return this.charDex;
    }

    public int getCharAgi()
    {
        return this.charAgi;
    }

    public int getCharEnd()
    {
        return this.charEnd;
    }

    public int getCharInt()
    {
        return this.charInt;
    }

    public int getCharWis()
    {
        return this.charWis;
    }

    public void setCharId(@NonNull int charId)
    {
        this.charId = charId;
    }

    public void setCharStr(int charStr)
    {
        this.charStr = charStr;
    }

    public void setCharDex(int charDex)
    {
        this.charDex = charDex;
    }

    public void setCharAgi(int charAgi)
    {
        this.charAgi = charAgi;
    }

    public void setCharEnd(int charEnd)
    {
        this.charEnd = charEnd;
    }

    public void setCharInt(int charInt)
    {
        this.charInt = charInt;
    }

    public void setCharWis(int charWis)
    {
        this.charWis = charWis;
    }
}

