package com.gmail.nikbenson03.aircom;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity
{
    private BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();


    final BroadcastReceiver bReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            // When discovery finds a device
            if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                // Get the BluetoothDevice object from the Intent
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);

            }
        }
    };


    //start of android live cycle
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui);

        //Bluetooth
        bluetoothAdapter.enable();
        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
        for(BluetoothDevice device : pairedDevices)
        {
            Toast.makeText(this, device.getName(), Toast.LENGTH_SHORT).show();
        }


        //I/O
        RadioGroup selectChanel = findViewById(R.id.selectChanel);
        selectChanel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                    //TODO
                    case R.id.selectChanelTeam: break;
                    case R.id.selectChanelUnit: break;
                    case R.id.selectChanelGroup: break;
                    case R.id.selectChanelTroop: break;
                }
            }
        });
    }
    @Override
    protected void onStart()
    {
        super.onStart();
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
    }
    @Override
    protected void onResume()
    {
        super.onResume();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }
    //end of android live cycle

    //Buttons
    public void onLoginSubmit(View v)
    {
        setContentView(R.layout.ui);
    }
    public void onLoginFirstSubmit(View v)
    {
        setContentView(R.layout.ui);
    }
    //end of Buttons
}
