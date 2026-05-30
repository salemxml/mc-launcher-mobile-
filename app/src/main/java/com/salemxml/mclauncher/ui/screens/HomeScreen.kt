package com.salemxml.mclauncher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.salemxml.mclauncher.ui.theme.PrimaryGreen
import com.salemxml.mclauncher.ui.theme.DarkCard

@Composable
fun HomeScreen(navController: NavController) {
    var selectedVersion by remember { mutableStateOf("1.20.1") }
    var selectedAccount by remember { mutableStateOf("إضافة حساب") }
    var ramValue by remember { mutableStateOf(2048f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E1E1E))
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0F0F0F))
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "🎮 MC-Launcher",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryGreen
                )
                Text(
                    "الإصدار 1.0.0",
                    fontSize = 12.sp,
                    color = Color(0xFF999999)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Accounts Section
        CardSection(
            title = "👤 حسابات اللاعب",
            onClick = { navController.navigate("accounts") }
        ) {
            var expanded by remember { mutableStateOf(false) }
            Box {
                OutlinedButton(
                    onClick = { expanded = true },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(selectedAccount)
                }
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    listOf("إضافة حساب", "حساب 1", "حساب 2").forEach { account ->
                        DropdownMenuItem(
                            text = { Text(account) },
                            onClick = {
                                selectedAccount = account
                                expanded = false
                            }
                        )
                    }
                }
            }
        }

        // Versions Section
        CardSection(
            title = "📦 الإصدارات",
            onClick = { }
        ) {
            var expanded by remember { mutableStateOf(false) }
            Box {
                OutlinedButton(
                    onClick = { expanded = true },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(selectedVersion)
                }
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    listOf("1.20.1", "1.19.2", "1.18.2", "1.17.1").forEach { version ->
                        DropdownMenuItem(
                            text = { Text(version) },
                            onClick = {
                                selectedVersion = version
                                expanded = false
                            }
                        )
                    }
                }
            }
        }

        // Settings Section
        CardSection(
            title = "⚙️ الإعدادات",
            onClick = { navController.navigate("settings") }
        ) {
            Column(modifier = Modifier.padding(8.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "ذاكرة RAM:",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                    Text(
                        "${ramValue.toInt()} MB",
                        color = PrimaryGreen,
                        fontWeight = FontWeight.Bold
                    )
                }
                Slider(
                    value = ramValue,
                    onValueChange = { ramValue = it },
                    valueRange = 512f..16384f,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                )
            }
        }

        // Mods Section
        CardSection(
            title = "🧩 المودات",
            onClick = { navController.navigate("mods") }
        ) {
            Button(
                onClick = { navController.navigate("mods") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text("إدارة المودات")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Play Button
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryGreen,
                contentColor = Color.Black
            )
        ) {
            Text(
                "▶️ لعب",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun CardSection(
    title: String,
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .clickable { onClick() },
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = DarkCard
        )
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(
                title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryGreen,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            content()
        }
    }
}
