Android_settingsDialog
======================

Disclaimer: application has not been intended to be used for beauty-screen-contest...so figure on the code and not the crappy UI! ;)

Creating Android application will cause you pretty soon to store some global settings, you could do this either your own freestyle Android way (there are many paths...) or the official Android settings way - which is, adding a settings view to your application and the "somehow" setting and applying these properties.

If you know how to do so it's easy...if you dont you will keep struggeling for hours until your first sample keeps running correctly. Notice a view things:

1) it's essentially to have your main view contents in a fragment - if your view is defined in the activity.xml directly the settings menu will always be displayed as an overlay (so the main view is still visible in the background) - until now we did not find a fix for this behavior but it seems FragmentTransactions have diddiculties calling .replace on an activity

2) apply the .addToBackStack to the settings view - this enables you to navigate using Android device buttons...unfortunately a manual hack is required to handle this behavior, this hack is decribed below.

Applying these two little hacks/knowledge will result in a proper working settings application - have fun!

![ScreenShot](images/phones.png)

# What do we do here?

In our example we have an image in our main fragment view which can be displaye/hidden using settings property - whao...rocket science! ;)

## Setup main view

As already said, we use a fragment to encapsulated the contents of our main view...so somewhere in your application ther should be around sth like **fragment_main.xml** and **MainFragment.java**:

**fragment_main.xml**
```xml
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.jooik.settingsdialog.fragments.MainFragment">

    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:orientation="vertical"
        android:gravity="center"
        android:layout_gravity="center">
        <ImageView
            android:id="@+id/iv_submarine"
            android:layout_width="200dp"
            android:layout_height="200dp"
            android:src="@drawable/submarine"
            android:layout_gravity="center"
            />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textAppearance="?android:attr/textAppearanceLarge"
            android:gravity="center"
            android:text="I am the main view -\nuse device settings buttons\n in order to display settings view"
            android:id="@+id/textView"
            android:layout_gravity="center_horizontal"/>
    </LinearLayout>

</FrameLayout>

```
(Nothin to worry...make sure the ImageView has an ID in order to interact with the view later on)


**MainFragment.java**
```java
public class MainFragment extends Fragment
{
    public MainFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_main, container, false);

        ImageView ivSubmarine = (ImageView)view.findViewById(R.id.iv_submarine);
        // we will do sth with the ImageView later on...
        
        return view;
    }
}

```

## Create Settings screen

In Android there is a pretty simple way of defining a settings screen: simply create a preferences.xml file and add the contents using Android XML elements, there are couple of elements available (Checkbox, Toggle, Text etc.) - see [Android documentation](http://developer.android.com/guide/topics/ui/settings.html)

So add a preferences.xml file to your project and, if necessary the surrounding xml folder - below you can see our example project structure:

![Structure](images/structure.png)



```java
```

```java
```

```java
```

```java
```
