# ScrollingDotsIndicator
A page indicator compatible with RecyclerView and ViewPager.

### Follow these steps to use this library:
#### In build.gradle (Project)

``` gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
``` 

And then in the other gradle file(may be your app gradle or your own module library gradle, but never add in both of them to avoid conflict.)

``` gradle
dependencies {
	  implementation 'com.github.kapilmhr:ScrollingDotsIndicator:1.0'
   }
```

# Usage

Add the `PageIndicator` to your XML file:

```xml
  <app.frantic.scrolldotsindicator.PageIndicator
      android:id="@+id/pageIndicator"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      />
```

#### RecyclerView

```kotlin
  pageIndicator.attachTo(recyclerView)
```

By default, attaching to a RecyclerView will end up updating the pageIndicator when the most visible item position changes and expect the RecyclerView items to have the same width. 
If you would like to customize this behavior, add a scroll listener to your RecyclerView and use `PageIndicator::swipeNext` and `PageIndicator::swipePrevious`; and set the pageIndicator's count

#### View Pager

```kotlin
  pageIndicator.attachTo(viewPager)
```

#### Manual
```kotlin
  pageIndicator.swipePrevious()
  pageIndicator.swipeNext()
```

# Customization

| Attribute           | Note                                      | Default     |
|---------------------|-------------------------------------------|-------------|
| piDotSpacing        | Spacing between dots                      | 3dp         |
| piDotBound          | Range in which the selected dot remains   | 40dp        |
| piSize[1-6]         | Size from smallest to largest dot         | .5dp - 6dp  |
| piAnimDuration      | Duration of animation* in ms              | 200         |
| piAnimInterpolator  | Animation interpolator*                   | decelerate  |
| piDefaultColor      | Default unselected dot color              | #B2B2B2     |
| piSelectedColor     | Selected dot color                        | #3897F0     |


*Note: the animation duration and interpolator are shared between the scroll animation and dot scaling animation.


