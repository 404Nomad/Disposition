package com.cfa.disposition.Composant

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cfa.disposition.R

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        //forcer espace au dessus et en dessous
        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier.padding(16.dp))
        HomeSection(title = R.string.align_your_body) {
            BodyRow()
        }
        Text("en attendant les composants")
        Spacer(Modifier.height(16.dp))
    }
}