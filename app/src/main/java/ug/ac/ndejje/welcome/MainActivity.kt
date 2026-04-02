package ug.ac.ndejje.welcome

import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ug.ac.ndejje.welcome.ui.theme.NdejjeWelcomeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NdejjeWelcomeAppTheme {
                StudentInfo()

            }
        }
    }
}
@Composable

fun StudentInfo() {
    val profileImage = painterResource(R.drawable.student_photo)

    val logoImage = painterResource(R.drawable.ndu_logo)


    Column(
        modifier = Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(

            painter = profileImage,

            contentDescription = "Student Photo",

            contentScale = ContentScale.Crop

        )



        Image(

            painter = logoImage,

            contentDescription = null
        )
// 1. Student full name

        Text(

            text = "Kwizera Kennedy",

            style = MaterialTheme.typography.headlineSmall,


            fontWeight = FontWeight.Bold,

            color = MaterialTheme.colorScheme.primary

        )


// 2. Program of study (displayed in uppercase)

        Text(

            text = "Bachelor of Information Technology",

            style = MaterialTheme.typography.labelMedium,

            color = MaterialTheme.colorScheme.primary,

            modifier = Modifier.padding(vertical = 4.dp)

        )


// 3. Static label — the "REG NO.:" heading

        Text(

            text = "REG NO.:",

            style = MaterialTheme.typography.labelLarge,

            fontWeight = FontWeight.ExtraBold

        )


// 4. The actual registration number

        Text(

            text = "24/2/314/WJ/035",

            style = MaterialTheme.typography.bodyLarge,

            fontFamily = FontFamily.Monospace

        )

    }
}
    @Preview(showBackground = true)

    @Composable

    fun WelcomePreview() {

        NdejjeWelcomeAppTheme {

            StudentInfo()

        }

    }

