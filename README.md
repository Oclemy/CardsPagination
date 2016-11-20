# CardsPagination
CardView Pagination with Next/Previous buttons

# Android CardView Pagination.

#### What we do :
- Create Card s at runtime.
- These are Children of android.view.CardView baseclass.
- Page them using the next.previous type of pagination.
- We have next/previous buttons.
- we skip through the cards depending on what you have clicked.
- We also diable the buttons appropriately.
- For more visit http://camposha.info

[TOC]


![](http://)
#### Step 1 : Define a Card.
- First we create our card class by deriving from CardView.

#### Step 2 : Generate List of Cards.
- We create a list to contain our cards and fill that list with cards.

```java
 ArrayList<Card> cards=new ArrayList<>();
  for(int i=0;i<5;i++)
  {
            cards.add(Card.newInstance(this,i));
  }

```
#### Step 3 : Switch through Cards.
- We shall then add and remove cards depending on the button click.
```java
 layout.removeAllViews();
 layout.addView(Card.newInstance(MainActivity.this,i));
```

Please download the whole source above.
We have plenty of easy to understand examples in our site so make sure you visit it.


##### Author
Oclemy,Cheers.
http://camposha.info
