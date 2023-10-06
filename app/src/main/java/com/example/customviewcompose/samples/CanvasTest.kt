package com.example.customviewcompose.samples

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CanvasTest() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Cyan,
                        Color.Magenta
                    ),
                    start = Offset(100.dp.toPx(), 0F),
                    end = Offset(200.dp.toPx(), 200.dp.toPx()),
                    tileMode = TileMode.Mirror
                )
            )
    ) {
        drawPath(
            path = Path().apply {
                moveTo(
                    x = center.x,
                    y = 100.dp.toPx()
                )
                lineTo(
                    x = center.x + 25.dp.toPx(),
                    y = 150.dp.toPx()
                )
                lineTo(
                    x = center.x + 75.dp.toPx(),
                    y = 150.dp.toPx()
                )
                lineTo(
                    x = center.x + 45.dp.toPx(),
                    y = 195.dp.toPx()
                )
                lineTo(
                    x = center.x + 60.dp.toPx(),
                    y = 250.dp.toPx()
                )
                lineTo(
                    x = center.x,
                    y = 220.dp.toPx()
                )
                lineTo(
                    x = center.x - 60.dp.toPx(),
                    y = 250.dp.toPx()
                )
                lineTo(
                    x = center.x - 45.dp.toPx(),
                    y = 195.dp.toPx()
                )
                lineTo(
                    x = center.x - 75.dp.toPx(),
                    y = 150.dp.toPx()
                )
                lineTo(
                    x = center.x - 25.dp.toPx(),
                    y = 150.dp.toPx()
                )
                lineTo(
                    x = center.x,
                    y = 100.dp.toPx()
                )
            },
            color = Color.White,
            style = Fill
        )
    }
}

@Composable
fun Oleg() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        //О
        drawCircle(
            color = Color.White,
            radius = 30.dp.toPx(),
            style = Stroke(width = 1.dp.toPx()),
            center = Offset(
                x = 60.dp.toPx(),
                y = 60.dp.toPx()
            )
        )

        //Л
        drawLine(
            color = Color.White,
            start = Offset(
                x = 135.dp.toPx(),
                y = 30.dp.toPx()
            ),
            end = Offset(
                x = 105.dp.toPx(),
                y = 90.dp.toPx()
            ),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(
                x = 135.dp.toPx(),
                y = 30.dp.toPx()
            ),
            end = Offset(
                x = 165.dp.toPx(),
                y = 90.dp.toPx()
            ),
            strokeWidth = 1.dp.toPx()
        )

        //Е
        drawLine(
            color = Color.White,
            start = Offset(
                x = 190.dp.toPx(),
                y = 30.dp.toPx()
            ),
            end = Offset(
                x = 190.dp.toPx(),
                y = 90.dp.toPx()
            ),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(
                x = 190.dp.toPx(),
                y = 30.dp.toPx()
            ),
            end = Offset(
                x = 230.dp.toPx(),
                y = 30.dp.toPx()
            ),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(
                x = 190.dp.toPx(),
                y = 60.dp.toPx()
            ),
            end = Offset(
                x = 230.dp.toPx(),
                y = 60.dp.toPx()
            ),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(
                x = 190.dp.toPx(),
                y = 90.dp.toPx()
            ),
            end = Offset(
                x = 230.dp.toPx(),
                y = 90.dp.toPx()
            ),
            strokeWidth = 1.dp.toPx()
        )

        //Г
        drawLine(
            color = Color.White,
            start = Offset(
                x = 250.dp.toPx(),
                y = 30.dp.toPx()
            ),
            end = Offset(
                x = 250.dp.toPx(),
                y = 90.dp.toPx()
            ),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(
                x = 250.dp.toPx(),
                y = 30.dp.toPx()
            ),
            end = Offset(
                x = 290.dp.toPx(),
                y = 30.dp.toPx()
            ),
            strokeWidth = 1.dp.toPx()
        )

    }
}

@Composable
fun Dp.toPx() = with(LocalDensity.current) {
    this@toPx.toPx()
}