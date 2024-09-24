import androidx.compose.ui.graphics.Color
import linktreekmp.composeapp.generated.resources.*

object LinkProvider {

    val items = listOf(
        LinkItem(
            name = "Youtube",
            url = "https://www.youtube.com/@eddymendoza4397",
            backgroundColor = Color.Red,
            icon = Res.drawable.yt
        ),
        LinkItem(
            name = "Twitter",
            url = "https://x.com/eddymy1304",
            backgroundColor = TwitterColor,
            icon = Res.drawable.tw
        ),
        LinkItem(
            name = "Facebook",
            url = "https://www.facebook.com/eddydavid.mendoza/",
            backgroundColor = FacebookColor,
            icon = Res.drawable.fb
        ),
        LinkItem(
            name = "Github",
            url = "https://github.com/eddymy1304",
            backgroundColor = GitHubColor,
            icon = Res.drawable.gh
        ),
        LinkItem(
            name = "Twitch",
            url = "https://www.twitch.tv/eddymy1304",
            backgroundColor = TwitchColor,
            icon = Res.drawable.twitch
        ),
        LinkItem(
            name = "Kick",
            url = "https://www.kickstarter.com/profile/eddymy1304",
            backgroundColor = KickColor,
            icon = Res.drawable.k
        ),
        LinkItem(
            name = "Linkedin",
            url = "https://www.instagram.com/eddymy1304/",
            backgroundColor = LinkedInColor,
            icon = Res.drawable.linkedin
        ),
        LinkItem(
            name = "TikTok",
            url = "https://www.tiktok.com/@eddymy1304",
            backgroundColor = Color.Black,
            icon = Res.drawable.tk
        ),
        LinkItem(
            name = "Instagram",
            url = "https://www.instagram.com/eddydavid.mendoza/",
            backgroundColor = InstagramColor,
            icon = Res.drawable.ins
        )

    )

}