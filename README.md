Portfolio-app
=============

**SplashActivity.java**  
![Image](/Pictures/20131003_160544.jpg)

**MainActivity.java**  
![Image](/Pictures/20131003_160552.jpg)

**ProjectActivity.java**  
![Image](/Pictures/20131003_160557.jpg)

Start another Activity and send data to it
==========================================

Start by adding this code where you want to
send the user to another Activity:

    Intent intent = new Intent(this, ProjectActivity.class); // What activity we want to go to!
    // Setting Extra value to send to the activity:
    intent.putExtra("name", Person.name);
    // Go to the activity:
    startActivity(intent);

Then if you want to retrieve values in your activity that may be sent from another activity:

    Intent intent = getIntent();
    String name = intent.getStringExtra("name");

Git commands & Wiki
===================

<http://alvinalexander.com/git/git-cheat-sheet-git-reference-commands>

> Fetches the latest version of the project
> > git pull
>
> Add file contents to the index
> > git add <file>
>
> Commit added files / changes
> >git commit -a -m "Message"
>
> Uploads the files / changes to github
> > git push
>
> Revert local changes in non-committed code
> > git checkout .
