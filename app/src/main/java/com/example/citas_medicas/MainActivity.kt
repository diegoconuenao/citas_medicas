package com.example.citas_medicas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.citas_medicas.ui.theme.Citas_medicasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "Login", builder = {
                composable("Login"){
                    LoginScreen(navController)
                }
                composable("Reservas"){
                    Reservas(navController)
                }

            })
            //MyComponent()
            //LoginScreen()
            //Reservas()
        }
    }
}
/*
@Composable
fun MyComponent(){
    Row (modifier = Modifier.padding(8.dp)){
        MyImage()
        MyTexts()
    }
}
@Composable
fun MyImage(){
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        "Mi imagen de prueba",
        modifier = Modifier.clip(CircleShape).background(Color.Gray)
    )
}

@Composable
fun MyTexts(){
    Column(modifier = Modifier.padding(start = 8.dp)) {
        MyText("Hola Jetpack Compose!")
        Spacer(modifier = Modifier.height(16.dp))
        MyText("Preparado?")
    }
}

@Composable
fun MyText(text: String){
    Text(text)
}

@Preview
@Composable
fun PreviewComponent(){
    MyComponent()
}

 */

/*
@Preview
@Composable
fun PreviewComponent(){
    LoginScreen()
    Reservas()
}

*/