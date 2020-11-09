package id.putraprima.viewmodelpushupcouter.models;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.viewmodelpushupcouter.models.Investing;

    public class InvestingViewModel extends ViewModel {
        private MutableLiveData<Investing> InvestingMutableLiveData = new MutableLiveData<>();
        private Investing investing;

        public investingViewModel(Investing investing){
            this.investing = investing;
            this.investingMutableLiveData.setValue(this.investing)

        }

        public LiveData<Investing> investingLiveData(){
            return this.investingMutableLiveData;
        }
    }