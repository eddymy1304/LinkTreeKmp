import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import linktreekmp.composeapp.generated.resources.Res
import linktreekmp.composeapp.generated.resources.rubik
import org.jetbrains.compose.resources.Font


@Composable
fun getRubik(): FontFamily {
    return FontFamily(
        Font(
            resource = Res.font.rubik,
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        )
    )
}