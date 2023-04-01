package id.heycoding.layartancep.utils

import androidx.room.TypeConverter

class Converters {
    @TypeConverter
    fun listToString(values: List<Int>): String {
        val strList = mutableListOf<String>()
        values.forEach {
            strList.add(it.toString())
        }
        return strList.joinToString(",")
    }

    @TypeConverter
    fun stringToList(value: String): List<Int> {
        val intList = mutableListOf<Int>()
        value.split(",").forEach {
            intList.add(it.toInt())
        }
        return intList
    }
}