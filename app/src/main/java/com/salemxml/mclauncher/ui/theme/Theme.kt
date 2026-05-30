package com.salemxml.mclauncher.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryGreen,
    onPrimary = Color(0xFF000000),
    primaryContainer = PrimaryDark,
    onPrimaryContainer = PrimaryGreen,
    secondary = SecondaryGray,
    onSecondary = Color(0xFFFFFFFF),
    tertiary = Color(0xFF4DB8FF),
    onTertiary = Color(0xFFFFFFFF),
    error = ErrorRed,
    onError = Color(0xFFFFFFFF),
    background = DarkBackground,
    onBackground = TextPrimary,
    surface = DarkSurface,
    onSurface = TextPrimary,
)

@Composable
fun MCLauncherTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}
