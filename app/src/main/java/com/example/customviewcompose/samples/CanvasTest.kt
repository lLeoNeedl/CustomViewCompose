package com.example.customviewcompose.samples

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun CanvasTest() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        drawLine(
            color = Color.White,
            start = Offset(0F, 0F),
            end = Offset(size.width, size.height)
        )
        drawLine(
            color = Color.White,
            start = Offset(size.width, 0F),
            end = Offset(0F, size.height)
        )
        drawCircle(
            color = Color.White,
            radius = 100.dp.toPx(),
            style = Stroke(width = 1.dp.toPx())
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