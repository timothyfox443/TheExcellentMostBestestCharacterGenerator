package com.example.theexcellentmostbestestcharactergenerator;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import android.app.Application;

public class CharacterRepository
{
    private final MutableLiveData<List<Character>> searchResults =
            new MutableLiveData<>();
    private List<Character> results;
    private final LiveData<List<Character>> allCharacters;
    private final CharacterDao characterDao;

    public CharacterRepository(Application application)
    {
        CharacterRoomDatabase db;
        db = CharacterRoomDatabase.getDatabase(application);
        characterDao = db.characterDao();
        allCharacters = characterDao.getAllCharacters();
    }

    Handler handler = new Handler(Looper.getMainLooper())
    {
        @Override public void handleMessage(Message msg)
        {
            searchResults.setValue(results);
        }
    };

    public void insertCharacter(Character newcharacter)
    {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() ->
        {
            characterDao.addCharacter(newcharacter);
        });
        executor.shutdown();
    }

    public LiveData<List<Character>> getAllProducts() { return allCharacters; }

    public MutableLiveData<List<Character>> getSearchResults(){ return searchResults; }


}
