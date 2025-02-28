package com.cfa.disposition.Composant

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cfa.disposition.ui.theme.DispositionTheme


@Composable
fun AppMain() {
    DispositionTheme {
        Scaffold { innerPadding ->
            MainScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}

