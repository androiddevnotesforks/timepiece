package com.shreekaram.timepiece.presentation.alarm

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun AlarmScreen(){
	Column(modifier = Modifier
		.fillMaxSize()
		.wrapContentSize(Alignment.Center)) {
		Text(text = "Alarm Screen")
	}
}