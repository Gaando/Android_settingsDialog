package com.jooik.settingsdialog.fragments;


import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.jooik.settingsdialog.R;

/**
 * Settings fragment adapter...
 */
public class SettingsFragment extends PreferenceFragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}
