package com.example.theexcellentmostbestestcharactergenerator;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = {Character.class}, version = 1)
public abstract class CharacterRoomDatabase extends RoomDatabase
{
    public abstract CharacterDao characterDao();
    private static CharacterRoomDatabase INSTANCE;

    static CharacterRoomDatabase getDatabase (final Context context)
    {
        if (INSTANCE == null)
        {
            synchronized (CharacterRoomDatabase.class)
            {
                if (INSTANCE == null)
                {
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            CharacterRoomDatabase.class, "character_database").build();
                }
            }
        }
        return INSTANCE;
    }

}
