package com.example.theexcellentmostbestestcharactergenerator;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CharacterDao

{
    @Query("SELECT * from characters")
    LiveData<List<Character>> getAllCharacters();

    @Insert
    void addCharacter(Character character);
}
