package uk.ac.tees.scedt.mad.w9610281.milkit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

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
    var name: String = "default"
    var pw: String = "*****"
    Column {
        Login(name = name)
        Password(pw = pw)
        Row {
            SignIn()
            Signup()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(name: String) {
    OutlinedTextField(
        value = name,
        onValueChange = {},
        label = { Text(text = "Name")}
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Password(pw: String) {
    OutlinedTextField(
        value = pw,
        onValueChange = {},
        label = { Text(text = "Password")}
    )
}

@Composable
fun Signup() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Sign up")
    }
}

@Composable
fun SignIn() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Sign in")
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Main()
//    MilkitTheme {
//        Greeting("Android")
//    }
}