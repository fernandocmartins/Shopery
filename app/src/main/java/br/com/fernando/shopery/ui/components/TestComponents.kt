package br.com.fernando.shopery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fernando.shopery.R
import br.com.fernando.shopery.ui.theme.Purple500
import br.com.fernando.shopery.ui.theme.ShoperyTheme
import br.com.fernando.shopery.ui.theme.Teal500


//@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text("Texto 1")
        Text("Texto 2")
    }
}

//@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row {
        Text("Texto 1")
        Text("Texto 2")
    }
}

//@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        Text("Texto 1")
        Text("Texto 2")
    }
}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomLayoutPreview() {
    Column(
        Modifier
            .padding(8.dp)
            .background(color = Color.Blue)
            .padding(all = 10.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 16.dp)
                .background(Color.Green)
                .fillMaxWidth(0.5f)
                .align(Alignment.CenterHorizontally),
            horizontalArrangement = Arrangement.Center
        )
        {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box(
            Modifier
                .padding(8.dp)
                .background(color = Color.Red)
                .padding(all = 10.dp)
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .padding(8.dp)
                    .background(color = Color.Cyan)
                    .padding(all = 10.dp)
            ) {
                Text(text = "Texto 5")
                Text(text = "Texto 6")
            }
            Column(
                Modifier
                    .padding(8.dp)
                    .background(color = Color.Yellow)
                    .padding(all = 10.dp)
            ) {
                Text(text = "Texto 7")
                Text(text = "Texto 8")
            }
        }
    }
}


@Composable
fun MyFirstComposable() {
    Box {
        Text("Alfred Sisley")
        Text("3 minutes ago")
    }
}

//@Preview
@Composable
fun MyFirstComposablePreview() {
    ShoperyTheme {
        Surface {
            MyFirstComposable()
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun Challenge() {
    Row(
        modifier = Modifier
            .height(80.dp)
            .width(200.dp)
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .height(80.dp)
                .width(60.dp)
                .background(Color.Blue)
        )
        Column()
        {
            Row(
                Modifier
                    .width(200.dp)
                    .height(30.dp)
                    .background(Color.Gray))
            {
                Text(text = "Test 1", Modifier.padding(all = 5.dp))
            }
            Text(text = "Test 2", Modifier.padding(all = 5.dp))

        }

    }
}

//@Preview(showBackground = true)
@Composable
fun Challenge2() {
    Surface(
        Modifier.padding(8.dp),
        shape = RoundedCornerShape(10.dp),
        shadowElevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .height(120.dp)
                .width(250.dp)
                .background(Color.White)
        ) {
            Box(
                modifier = Modifier
                    .heightIn(120.dp, 120.dp)
                    .width(60.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Purple500,
                                Teal500
                            )
                        )
                    )
            )
            Column()
            {
                Row(
                    Modifier
                        .width(200.dp)
                        .height(30.dp)
                )
                {
                    Text(text = "eu lhiamo")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductsSections() {
    Column {
        Text(
            text = "Promoções",
            Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .padding(
                    top = 8.dp,
                    bottom = 16.dp
                )
                .fillMaxWidth()
                .horizontalScroll(ScrollState(0))
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ProductItem()
            ProductItem()
            ProductItem()
        }
    }
}

@Composable
fun ProductItem() {
    Surface(
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 4.dp
    ) {
        Column(
            Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
        )
        {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .height(imageSize)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple500,
                                Teal500
                            )
                        )
                    )
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    Modifier
                        .size(imageSize) //size deixa alt e larg iguais
                        .offset(y = imageSize / 2)
                        .clip(CircleShape)
                        .align(Alignment.BottomCenter)
                )
            }
            Spacer(modifier = Modifier.height(imageSize/2))
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "R$ 14,99",
                    Modifier.padding(top = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }

        }
    }

}