package rakib.hasan.composewithclean_lifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import rakib.hasan.composewithclean_lifecycle.ui.theme.ComposeWithClean_LifecycleTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("TAG", "onCreate called!")
        setContent {
            ComposeWithClean_LifecycleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Greeting(name = "Android")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.v("TAG", "onStart called!")
    }

    override fun onResume() {
        super.onResume()
        Log.v("TAG", "onResume called!")
    }

    override fun onPause() {
        super.onPause()
        Log.v("TAG", "onPause called!")
    }

    override fun onStop() {
        super.onStop()
        Log.v("TAG", "onStop called!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("TAG", "onRestart called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("TAG", "onDestroy called!")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeWithClean_LifecycleTheme {
        Greeting("Android")
    }
}