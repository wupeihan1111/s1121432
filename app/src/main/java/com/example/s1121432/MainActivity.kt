package com.example.s1121432

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.s1121432.ui.theme.S1121432Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1121432Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

                    Modifier
                        .fillMaxSize()
                        .background(Color.Blue)
                    Modifier.background(Color(0xff95fe95))


                    Column {

                        Text("2024期末上機考(資管二B吳沛涵)")
                        Text("遊戲持續時間0秒")
                        Text("您的成績0分")



                        Image(
                            painter = painterResource(id = R.drawable.class_b),
                            contentDescription = "圖片",
                            modifier = Modifier

                        )
                        Button(onClick = {
                        }) {
                            Text(text = "結束APP")
                        }


                    }
                }
            }
        }
    }
}

