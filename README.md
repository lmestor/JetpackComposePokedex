# JetpackComposePokedex
A dive-in to Android development straight right into using Kotlin and Jetpack Compose based off of Philipp Lackner's [tutorial](https://www.youtube.com/watch?v=v0of23TxIKc&list=PLQkwcJG4YTCTimTCpEL5FZgaWdIZQuB7m]).

While he used a plugin from Android Studio's marketplace to generate JSON to Kotlin data class files, I opted to use an online generator from https://json2kt.com. Due to this, there is currently an issue when loading certain Pokemons as the Pokemon that was initially selected to generate files didn't include held_items values and the parser couldn't read the response properly when there is one.

I've updated to more recent dependencies as of Q4 2022, and a lot of deprecations/changes have happened since then. Most notable:

  ```implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"``` no longer needed

  ```implementation 'com.android.support:palette-v7:28.0.0'``` replaced by ```implementation 'androidx.palette:palette-ktx:1.0.0'```

  ```implementation "io.coil-kt:coil:1.1.1"``` replaced by ```implementation 'io.coil-kt:coil-compose:2.2.2'```

  ```CoilImage()``` being replaced by ```Image()``` or ```.capitalize(LOCALE.ROOT)``` to ```.replaceFirstChar { it.uppercase() }```
