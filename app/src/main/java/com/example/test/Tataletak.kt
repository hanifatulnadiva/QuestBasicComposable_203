package com.example.test

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TataletakColumn(modifier:Modifier){
    Column(modifier=Modifier.padding(top = 50.dp))
    {
        Text(text = "Komponen 1")
        Text(text = "komponen 2")
        Text(text = "komponen 3")
        Text(text = "komponen 4")
        Text(text = "komponen 5")
    }
}
@Composable
fun TataletakColumn2(modifier: Modifier){
    Column(modifier=Modifier
        .padding(top = 50.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text="Komponen 1")
        Text(text = "komponen 2")
        Text(text="komponen 3")
        Text(text = "komponen 4")
        Text(text = "komponen 5")
    }
}

@Composable
fun TataletakRow(modifier:Modifier){
    Row (modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly)
    {
        Text(text="Komponen 1")
        Text(text = "komponen 2")
        Text(text="komponen 3")
        Text(text = "komponen 4")
        Text(text = "komponen 5")
    }
}

@Composable
fun TataletakBox(modifier: Modifier){
    Box (
        modifier= Modifier
            .fillMaxWidth()
            .fillMaxHeight(), contentAlignment = Alignment.Center)
    {
        Text(text="Box1")
        Text(text = "Column 1")
        Text(text="row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier){
    Column (){
        //baris1
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly)
            {
                Text(text ="Komponen 1 baris1")
                Text(text ="komponen 2 baris1")
                Text(text ="komponen 3 baris1")
            }
        //Baris2
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly)
            {
                Text(text ="Komponen 1 baris2")
                Text(text ="komponen 2 baris2")
                Text(text ="komponen 3 baris2 ")
            }
    }
}

@Composable
fun TataletakRowCulumn(modifier: Modifier)
{

}