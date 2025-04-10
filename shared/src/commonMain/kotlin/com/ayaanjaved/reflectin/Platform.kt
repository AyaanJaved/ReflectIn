package com.ayaanjaved.reflectin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform