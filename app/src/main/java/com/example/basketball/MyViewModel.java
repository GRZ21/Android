package com.example.basketball;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer>TeamA;
    private MutableLiveData<Integer>TeamB;
    private int aBack,bBack;

    public MutableLiveData<Integer> getTeamA() {
        if (TeamA == null){
            TeamA = new MutableLiveData<>();
            TeamA.setValue(0);
        }
        return TeamA;
    }

    public MutableLiveData<Integer> getTeamB() {
        if (TeamB == null){
            TeamB = new MutableLiveData<>();
            TeamB.setValue(0);
        }
        return TeamB;
    }

    public void addTeamA(int n){
        aBack = TeamA.getValue();
        bBack = TeamB.getValue();
        TeamA.setValue(TeamA.getValue()+n);
    }

    public void addTeamB(int n){
        aBack = TeamA.getValue();
        bBack = TeamB.getValue();
        TeamB.setValue(TeamB.getValue()+n);
    }
    public  void reset(){
        aBack = TeamA.getValue();
        bBack = TeamB.getValue();
        TeamA.setValue(0);
        TeamB.setValue(0);
    }

    public void undo(){
        TeamA.setValue(aBack);
        TeamB.setValue(bBack);
    }

}
