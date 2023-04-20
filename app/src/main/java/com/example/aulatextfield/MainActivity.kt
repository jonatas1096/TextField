package com.example.aulatextfield


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.aulatextfield.ui.theme.AulatextfieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Main()
        }
    }
}

@Composable
fun Main() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(93, 191, 216, 255))
        // .background(Color(255, 255, 255, 255)), outra cor de background
    ) {//fechamento modificador da box

        //começo conteudo da box
        val textfield: String by remember { mutableStateOf("") }

        TextField( //textfield começo
            value = textfield,
            onValueChange = {textfield},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
                .padding(horizontal = 15.dp)
                .background(Color(228, 227, 227, 255)),
            placeholder = {
                Text(
                    text = "What is the music of life?",
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,

                ) //fechamento text
            } //fechamento placeholder
        ) //fechamento textfield
    } //fechamento da Box

    Box(modifier = Modifier
        .padding(top = 85.dp)
        .padding(horizontal = 15.dp)
        .fillMaxWidth(),
    )
    { //começo textfield2
        var textfield2: String by remember { mutableStateOf("") }
        TextField(value = textfield2,
            onValueChange = {textfield2 = it},

            modifier = Modifier
                .background(Color(255, 255, 255, 255))
                .fillMaxWidth(),
            textStyle = TextStyle(fontStyle = FontStyle.Italic)
        )


            if (textfield2 == "Silence, my brother.")
            {
                Box(modifier = Modifier
                    .padding(top = 145.dp)
                    .padding(horizontal = 15.dp)
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color(117, 204, 226, 255))

                )
                {
                    Text(text = "Welcome home.",
                        modifier = Modifier.scale(1.8f)
                        .align(Alignment.Center),
                        color = Color.White,
                        fontWeight = FontWeight.Bold,

                        )
                }
            }


    } //fechamento Textfield2


} //fechamento função


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Main()
}