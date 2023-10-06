package com.example.customviewcompose.samples

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Preview
@Composable
fun CanvasTest() {
    var points by remember {
        mutableStateOf(listOf<Point>())
    }

    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
            .pointerInput(key1 = Unit) {
                detectDragGestures(
                    onDragStart = {
                        points = points + Point(it, true)
                    },
                    onDrag = { change, _ ->
                        points = points + change.historical.map {
                            Point(
                                offset = it.position,
                                false
                            )
                        }
                    }
                )
            }
    ) {
        val path = Path()
        points.forEach { point ->
            if (point.isStartPosition) {
                path.moveTo(point.offset.x, point.offset.y)
            } else {
                path.lineTo(point.offset.x, point.offset.y)
            }
        }
        drawPath(
            path = path,
            brush = Brush.linearGradient(
                listOf(
                    Color.Cyan,
                    Color.Magenta,
                    Color.Red
                )
            ),
            style = Stroke(width = 10.dp.toPx())
        )
    }
}

data class Point(
    val offset: Offset,
    val isStartPosition: Boolean
)

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