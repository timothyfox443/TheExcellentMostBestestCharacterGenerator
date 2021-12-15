package com.example.theexcellentmostbestestcharactergenerator;

import android.app.Application;

import com.example.theexcellentmostbestestcharactergenerator.CharacterDao;

public class CharacterRepository
{
    private CharacterDao characterDao;
    private CharacterRoomDatabase db;

    public CharacterRepository(Application application)
    {
        db = CharacterRoomDatabase.getDatabase(application);
        characterDao = db.characterDao();
    }
}
