package com.example.composesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.composesample.custom.CustomTextView

import com.example.composesample.ui.theme.ComposeSampleTheme
import me.zhanghai.android.materialratingbar.MaterialRatingBar

/**
 * This activity explains following concepts:
 * i) Aligning items in rows and columns
 * ii) Custom views in compose
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeSampleTheme {

                Column {

                    Image(
                        painter = painterResource(id = R.drawable.img_nike),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(
                        "Nike Air Max Bolt",
                        fontSize = 20.sp,
                        color = Color(0xFFff0179),
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        "Men's shoes",
                        fontSize = 15.sp,
                        color = Color(0xFFC71570),
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Spacer(modifier = Modifier.padding(30.dp))
                    //Price
                    loadRowTitleAndSubtitle(lbl = "Price", lblVal = "150$")
                    Spacer(modifier = Modifier.padding(1.dp))
                    //size
                    loadRowTitleAndSubtitle(lbl = "Size", lblVal = "UK 8")
                    Spacer(modifier = Modifier.padding(15.dp))

                    Text(
                        text = "The running-inspired Nike Air Max Bolt features rich overlays, wavy design lines and a whole lot of visible Air. The foam midsole adds responsive cushioning, while the lightweight essential",
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                    )

                    //Custom TextView
                    val customTextView = CustomTextView(LocalContext.current, "User Rating")
                    AndroidView({customTextView})

                    //Material Rating Bar
                    val customRatingBar = MaterialRatingBar(LocalContext.current)
                    customRatingBar.rating = 5f
                    AndroidView({customRatingBar}, modifier = Modifier.align(Alignment.CenterHorizontally))

                }
            }
        }
    }

    @Composable
    fun loadRowTitleAndSubtitle(lbl: String, lblVal: String) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
            horizontalArrangement = Arrangement.SpaceAround
        )
        {
            Text(
                text = lbl, fontSize = 20.sp, color = Color(0xFF615C5E), modifier = Modifier.align(
                    Alignment.CenterVertically
                )
            )
            Text(
                text = lblVal,
                fontSize = 20.sp,
                color = Color(0xFF9C9690),
                modifier = Modifier.align(
                    Alignment.CenterVertically
                )
            )
        }
    }

}


