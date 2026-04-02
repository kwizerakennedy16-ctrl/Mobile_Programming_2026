package ug.ac.ndejje.welcome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
                StudentIdCard()

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
        Box(modifier = Modifier.padding(10.dp)) {
            Image(

                painter = profileImage,

                contentDescription = "Student Photo",

                contentScale = ContentScale.Crop,
                        modifier = Modifier
                        . clip (RoundedCornerShape(percent = 10))

            )



            Image(

                painter = logoImage,

                contentDescription = null,
                        modifier = Modifier

                        .size(80.dp)

                    .align(Alignment.BottomEnd)

                    .padding(4.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
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
        HorizontalDivider(

            modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp),

            thickness = 1.dp,

            color = MaterialTheme.colorScheme.outlineVariant

        )

        Row(modifier = Modifier) {
// 3. Static label — the "REG NO.:" heading

            Text(

                text = "REG NO.:",

                style = MaterialTheme.typography.labelLarge,

                fontWeight = FontWeight.ExtraBold

            )
            Spacer(modifier = Modifier.width(10.dp))

// 4. The actual registration number

            Text(

                text = "24/2/314/WJ/035",

                style = MaterialTheme.typography.bodyLarge,

                fontFamily = FontFamily.Monospace

            )
        }
    }
}
@Composable

fun StudentIdCard() {

    ElevatedCard(

        modifier = Modifier

            .fillMaxWidth()

            .padding(16.dp),

        shape = RoundedCornerShape(16.dp),

        colors = CardDefaults.elevatedCardColors(

            containerColor = MaterialTheme.colorScheme.surfaceVariant

                .copy(alpha = 0.3f)

        )

    ) {

// The card's content — call our StudentInfo() here

        StudentInfo()

    }

}
    @Preview(showBackground = true)

    @Composable

    fun WelcomePreview() {

        NdejjeWelcomeAppTheme {

            StudentIdCard()

        }

    }

