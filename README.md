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


