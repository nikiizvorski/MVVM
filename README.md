# MVVM
MVVM Dagger2 simple project

This is a simple MVVM project that have Dagger2 for the DI or also called Inversion Control and DataBinding. What Dagger does is simply handle the class creation. 

What is MVVM? 

- it is Architecture design pattern for Android like MVP but not even close. Don't think that ^^

And what is DataBinding?

- Data Binding Library to write declarative layouts and minimize the glue code necessary to bind your application logic and layouts.

How is Dagger2 handling creation? 

- It is really simple just go to the methods that dagger have and you will simply see what it does. Hint: Factory?

What are most developer thinking when they are working with Dagger2? 

- Well they think they do since they never checked what dagger actually does and they never checked the code. So they think
that dagger just simply does what people showed them on tutorials or guides.....

Okay never mind it is easy? How? Hint: Scopes? But? Check latest build if you think i am wrong or you think that what i have showed you here is wrong.

- yeah it is Dagger2 simply handle the Classes creation using Factory Pattern you can check what that means. Hint: easy?

What does Data Binding do?

- Check the support docs it is easy and well explained. And check the project please. Don't be lazy.

How is this project structured?

- Views Layer - completely dumb exactly how they are supposed to BE.

- Models Layer - data structure and interaction.

- View Model Layer - presentation layer.

Observables?

- Yep simply checking 

What is happening here?

- Don' be lazy at first but here is what is going on pretty much.

- You have the Views with the viewmodels set by the DI.

- you have the viewmodels for the presentation and interaction.

- you have the models for data structure and interactions.

- not all of the project is at best but pretty sure if you check it out you will be able to figure it out.

How is MVVM bad or good?

- Let start with Good part it is gret for couple reasons:
- Easy to use for designers they can simply do what they do best. Without you having to do all the work. And you can just leave them to play with that part of the app.
- Most companies like the approach a lot check Microsoft for example. They have a really good article about MVVM.
- MVP and MVVM are not used only for Android don't get that wrong. They can be used and are used for the best apps out there. Combined with Functional and Reactive programming. Just magic.

- Bad part is that is really easy for developers to mess it up and they just start to play with the XML part and start to add checks and code inside the views. That my friend is the first rule that doesn't have to be. NO CODE NO CHECKS NOTHING INSIDE THE VIEWS. That is what you have to undestand from the beggining if you want to write good quality code.
- How is that good for you well you save your self a lot of time by doing that since let say you go and have to write on this project again after couple monts you forgot about that project and problems start to come. Maybe you left something there maybe some colleague. Doesn't matter but it is just wrong! If a developer says otherwise well do the math.

- The wrap up is that there is no good or bad simply both are great just pick one and go. Here is a little example with some code that is mixed up. You have to do some work yourself. Read a little, play a little ^^

- There are some things left on purpose and i am pretty sure with a little reading you can manage to fix them.

More Info:

- https://developer.android.com/topic/libraries/data-binding/index.html

#### Author

- Niki Izvorski (nikiizvorski@gmail.com)


