package com.groundzero.mvvm.features.content.feed.ui

import androidx.lifecycle.ViewModel
import com.groundzero.mvvm.features.content.feed.data.FeedRepository
import javax.inject.Inject

class FeedViewModel @Inject constructor(repository: FeedRepository): ViewModel() {
    val feed = repository.feed
}