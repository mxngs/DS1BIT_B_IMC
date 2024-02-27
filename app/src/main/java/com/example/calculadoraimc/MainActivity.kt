package com.example.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadoraimc.ui.theme.CalculadoraIMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting( )
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
    ) {

        Card(

            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            shape = RectangleShape,
            colors = CardDefaults.cardColors(containerColor = Color(0xFF5E0C18))

        ) {

            Image(

                painter = painterResource(id = R.drawable.bmi), contentDescription = "bmi",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(top = 10.dp),

                contentScale = ContentScale.Fit

            )
            Text(
                text = "Calculadora IMC",
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )

        }

        Card(

            modifier = Modifier
                .size(width = 400.dp, height = 480.dp)
                .padding(40.dp)
                .offset(
                    x = 0.dp,
                    y = (-65.dp)
                ),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xFFD6DDE0))
        ) {

            Column(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Text(
                    text = "Seus dados",
                    textAlign = TextAlign.Center,

                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 40.dp),
                    color = Color(0xFF5E0C18)

                )

                Text(
                    text = "Seu Peso:",
                    textAlign = TextAlign.Start
                )

                OutlinedTextField(value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "Digite seu peso em kg")
                    },
                    colors = OutlinedTextFieldDefaults.
                    colors(
                        focusedBorderColor = Color(0xFF5E0C18),
                        unfocusedBorderColor =  Color(color = 0xFF5E0C18),
                    ))
                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "Sua Altura:")

                OutlinedTextField(value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "Digite sua altura em cm")
                    },
                    colors = OutlinedTextFieldDefaults.
                    colors(
                        focusedBorderColor = Color(0xFF5E0C18),
                        unfocusedBorderColor =  Color(color = 0xFF5E0C18),
                    ))

                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5E0C18)
                    )){
                    Column {
                        Text(text = "CALCULAR")
                    }
                }
            }

        }

        Card(colors = CardDefaults.cardColors(containerColor = Color(0xFF1C8321)),
            modifier = Modifier
                .width(280.dp)
                .height(430.dp)
                .offset(x = 60.dp, y = -30.dp),
            elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Text(
                text = "Resultado",
                fontSize = 15.sp,
                color = Color.White,
                modifier = Modifier.offset(x = 40.dp, y = 35.dp)
            )
            Text(text = "Peso Ideal",
                fontSize = 25.sp,
                color = Color.White,
                modifier = Modifier.offset(x = 20.dp, y = 35.dp)
            )
            Text(
                text = "21.3",
                fontSize = 40.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.offset(x = 180.dp, y = -20.dp)
            )
        }
    }

}



    @Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraIMCTheme {
        Greeting()
    }
}