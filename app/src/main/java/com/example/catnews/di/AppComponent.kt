package com.example.catnews.di

import android.content.Context
import com.example.catnews.activity.IndexActivity
import com.example.catnews.activity.MainActivity
import com.example.catnews.activity.StoryPageActivity
import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
    fun inject(activity: StoryPageActivity)
    fun inject(activity: IndexActivity)
    fun inject(activity: MainActivity)
}