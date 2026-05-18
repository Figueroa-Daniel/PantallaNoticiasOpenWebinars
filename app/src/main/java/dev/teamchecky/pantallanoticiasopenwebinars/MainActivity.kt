package dev.teamchecky.pantallanoticiasopenwebinars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Close
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import dev.teamchecky.pantallanoticiasopenwebinars.model.WeatherConditionType
import dev.teamchecky.pantallanoticiasopenwebinars.ui.theme.PantallaNoticiasOpenWebinarsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PantallaNoticiasOpenWebinarsTheme {

            }
        }
    }
}


@Composable
fun HeaderNews(
    title: String, description:String, imageUrl:String, modifier: Modifier = Modifier
){
    Box(
        modifier = Modifier.clip(shape = RoundedCornerShape(16.dp))
    ){
        AsyncImage(
            model = imageUrl,
            modifier = Modifier.fillMaxWidth().sizeIn(maxHeight = 300.dp),
            contentScale = ContentScale.FillWidth,
            contentDescription = null
        )
        Column(
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .padding(8.dp)
                .background(
                    color = Color.White.copy(alpha = 0.6f),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = title.uppercase(),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    shadow = Shadow(
                        color = Color.White,
                        offset = Offset(1f, 1f),
                        blurRadius = 2f
                    )
                    ),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis

            )
            Text(
                text = description,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    shadow = Shadow(
                        color = Color.White,
                        offset = Offset(1f, 1f),
                        blurRadius = 2f
                    )
                ),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis

            )
        }
    }

}

@Composable
fun WeatherInfo(
    weatherConditionType: WeatherConditionType,
    temperature: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Card(modifier = Modifier) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(getWeatherIcon(weatherConditionType)),
                contentDescription = null
            )
            Text(
                text = temperature,
                modifier = Modifier.padding(horizontal = 8.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Black,

                ),

            )
            Text(
                text = description,
                modifier = Modifier.weight(1f),
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Black,
                ),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis

            )
            Image(
                modifier = Modifier.size(32.dp),
                imageVector = Icons.TwoTone.Close,
                contentDescription = null
            )
        }
    }
}
@Composable
fun CategoryHeader(title: String, modifier: Modifier = Modifier){
    Text(
        text = title,
        modifier = modifier,
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )
    )
}

@Composable
fun NewsItem(
    title: String,
    description: String,
    imageUrl: String,
    date: String,
    author: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {
        AsyncImage(
            model = imageUrl,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(16.dp))
            ,
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
        Column(
            modifier = Modifier.padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = title,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                ),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = description,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(
                    fontSize = 14.sp,
                ),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = "$date - $author",
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontStyle = FontStyle.Italic,
                ),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


@Composable
fun getWeatherIcon(weatherConditionType: WeatherConditionType) = when (weatherConditionType) {
    WeatherConditionType.Sunny -> R.drawable.ic_sunny
    WeatherConditionType.Cloudy -> R.drawable.ic_cloudy
    WeatherConditionType.Rainy -> R.drawable.ic_rainy
    WeatherConditionType.Snowy -> R.drawable.ic_snowy
}

@Composable
fun HomeScreen(modifier: Modifier){
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp)
    ) {
        item {
            HeaderNews()
        }
        item {
            WeatherInfo(
                weatherConditionType = WeatherConditionType.Sunny,
                temperature = "25°C",
                description = "Soleado"
            )
        }
        CategoryHeader()
        items() {
            NewsItem(
                title = "Title",
                description = "Description",
                imageUrl = "",
                date = "01/01/2024",
                author = "Author"
            )
        }

    }
}


@Preview
@Composable
fun HeaderNewsPreview(){
    HeaderNews(
        title= "Title",
        description = "Description",
        imageUrl = ""
    )
}
