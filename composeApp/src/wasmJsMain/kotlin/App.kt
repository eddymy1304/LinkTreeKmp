import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import linktreekmp.composeapp.generated.resources.Res
import linktreekmp.composeapp.generated.resources.img_principal
import org.jetbrains.compose.resources.painterResource

@Composable
fun App() {
    MaterialTheme {
        BodyApp()
    }
}

@Composable
fun BodyApp(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(colors = BackgroundColor)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(32.dp))
        Image(
            modifier = Modifier
                .height(100.dp)
                .clip(CircleShape),
            painter = painterResource(Res.drawable.img_principal),
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = "@Eddymendoza",
            fontSize = 36.sp,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = getRubik()
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = "Android Developer",
            fontSize = 18.sp,
            color = Color.White,
            fontFamily = getRubik()
        )
        Spacer(modifier = Modifier.size(32.dp))
        LazyColumn {
            items(LinkProvider.items) { item ->
                ButtonLink(item = item)
            }
        }
    }
}

@Composable
fun ButtonLink(
    modifier: Modifier = Modifier,
    item: LinkItem
) {
    //para abrir links, navegar
    val uriHandler = LocalUriHandler.current

    val interactionSource = remember { MutableInteractionSource() }
    val isHovered by interactionSource.collectIsHoveredAsState()

    val backgroundColor by animateColorAsState(
        if (isHovered) item.backgroundHoverColor
        else item.backgroundColor
    )

    val textColor by animateColorAsState(
        if (isHovered) item.textHoverColor
        else item.textColor
    )

    val elevation by animateDpAsState(
        if (isHovered) 12.dp
        else 0.dp
    )

    Button(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp, horizontal = 48.dp)
            .height(52.dp),
        onClick = { uriHandler.openUri(item.url) },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor
        ),
        interactionSource = interactionSource,
        elevation = ButtonDefaults.elevation(elevation)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                modifier = Modifier
                    .size(24.dp)
                    .fillMaxSize(1.0f),
                painter = painterResource(item.icon),
                contentDescription = null,
                tint = textColor
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = item.name,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = textColor,
                fontFamily = getRubik()
            )
        }
    }
}