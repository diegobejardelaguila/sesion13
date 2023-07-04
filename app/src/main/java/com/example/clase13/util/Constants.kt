package com.example.clase13.util

object FireStoreCollection {
    val NOTA = "nota"
    val USUARIO = "usuario"

}


object FireDatabase {
    val FECHA = "fecha"
    val USUARIO_ID = "usuario_id"

}

object SharedPrefConstants {
    val LOCAL_SHARED_PREF = "local_shared_pref"
    val USUARIO_SESION = "usuario_sesion"

}


object FiredbaseStorageConstants {
    val ROOT_DIRECTORY = "app"
    val NOTA_IMAGE = "nota_image"
}

enum class HomeTabs(val index:Int, val key:String){
    NOTAS(0,"notas"),
    TAREAS(1,"tareas"),

}