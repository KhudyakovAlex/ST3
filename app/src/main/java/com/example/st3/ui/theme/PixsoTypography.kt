package com.example.st3.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.example.st3.R

/**
 * Auto-generated from Pixso design tokens
 * Do not edit manually - run sync command in Cursor to update
 */

private val googleFontProvider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

private val ibmPlexSansFont = GoogleFont("IBM Plex Sans")

val IBMPlexSansFamily = FontFamily(
    Font(googleFont = ibmPlexSansFont, fontProvider = googleFontProvider, weight = FontWeight.Normal),
    Font(googleFont = ibmPlexSansFont, fontProvider = googleFontProvider, weight = FontWeight.Medium),
    Font(googleFont = ibmPlexSansFont, fontProvider = googleFontProvider, weight = FontWeight.SemiBold),
)

// Display styles
val DisplayLarge = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Normal,
    fontSize = PixsoDimens.Display_Display_L_Size,
    lineHeight = PixsoDimens.Display_Display_L_Line_Height,
    letterSpacing = PixsoDimens.Display_Display_L_Tracking
)

val DisplayMedium = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Normal,
    fontSize = PixsoDimens.Display_Display_M_Size,
    lineHeight = PixsoDimens.Display_Display_M_Line_Height,
    letterSpacing = PixsoDimens.Display_Display_M_Tracking
)

val DisplaySmall = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Normal,
    fontSize = PixsoDimens.Display_Display_S_Size,
    lineHeight = PixsoDimens.Display_Display_S_Line_Height,
    letterSpacing = PixsoDimens.Display_Display_S_Tracking
)

// Headline styles
val HeadlineLarge = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Normal,
    fontSize = PixsoDimens.Headline_Headline_L_Size,
    lineHeight = PixsoDimens.Headline_Headline_L_Line_Height,
    letterSpacing = PixsoDimens.Headline_Headline_L_Tracking
)

val HeadlineMedium = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Normal,
    fontSize = PixsoDimens.Headline_Headline_M_Size,
    lineHeight = PixsoDimens.Headline_Headline_M_Line_Height,
    letterSpacing = PixsoDimens.Headline_Headline_M_Tracking
)

val HeadlineSmall = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Medium,
    fontSize = PixsoDimens.Headline_Headline_S_Size,
    lineHeight = PixsoDimens.Headline_Headline_S_Line_Height,
    letterSpacing = PixsoDimens.Headline_Headline_S_Tracking
)

// Title styles
val TitleLarge = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Normal,
    fontSize = PixsoDimens.Title_Title_L_Size,
    lineHeight = PixsoDimens.Title_Title_L_Line_Height,
    letterSpacing = PixsoDimens.Title_Title_L_Tracking
)

val TitleMedium = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Medium,
    fontSize = PixsoDimens.Title_Title_M_Size,
    lineHeight = PixsoDimens.Title_Title_M_Line_Height,
    letterSpacing = PixsoDimens.Title_Title_M_Tracking
)

val TitleSmall = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Medium,
    fontSize = PixsoDimens.Title_Title_S_Size,
    lineHeight = PixsoDimens.Title_Title_S_Line_Height,
    letterSpacing = PixsoDimens.Title_Title_S_Tracking
)

// Body styles
val BodyLarge = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Normal,
    fontSize = PixsoDimens.Body_Body_L_Size,
    lineHeight = PixsoDimens.Body_Body_L_Line_Height,
    letterSpacing = PixsoDimens.Body_Body_L_Tracking
)

val BodyMedium = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Normal,
    fontSize = PixsoDimens.Body_Body_M_Size,
    lineHeight = PixsoDimens.Body_Body_M_Line_Height,
    letterSpacing = PixsoDimens.Body_Body_M_Tracking
)

val BodySmall = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Normal,
    fontSize = PixsoDimens.Body_Body_S_Size,
    lineHeight = PixsoDimens.Body_Body_S_Line_Height,
    letterSpacing = PixsoDimens.Body_Body_S_Tracking
)

// Label styles
val LabelLarge = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Medium,
    fontSize = PixsoDimens.Label_Label_L_Size,
    lineHeight = PixsoDimens.Label_Label_L_Line_Height,
    letterSpacing = PixsoDimens.Label_Label_L_Tracking
)

val LabelMedium = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Medium,
    fontSize = PixsoDimens.Label_Label_M_Size,
    lineHeight = PixsoDimens.Label_Label_M_Line_Height,
    letterSpacing = PixsoDimens.Label_Label_M_Tracking
)

val LabelSmall = TextStyle(
    fontFamily = IBMPlexSansFamily,
    fontWeight = FontWeight.Medium,
    fontSize = PixsoDimens.Label_Label_S_Size,
    lineHeight = PixsoDimens.Label_Label_S_Line_Height,
    letterSpacing = PixsoDimens.Label_Label_S_Tracking
)

// Material3 Typography with Pixso tokens
val PixsoTypography = Typography(
    displayLarge = DisplayLarge,
    displayMedium = DisplayMedium,
    displaySmall = DisplaySmall,
    headlineLarge = HeadlineLarge,
    headlineMedium = HeadlineMedium,
    headlineSmall = HeadlineSmall,
    titleLarge = TitleLarge,
    titleMedium = TitleMedium,
    titleSmall = TitleSmall,
    bodyLarge = BodyLarge,
    bodyMedium = BodyMedium,
    bodySmall = BodySmall,
    labelLarge = LabelLarge,
    labelMedium = LabelMedium,
    labelSmall = LabelSmall
)
