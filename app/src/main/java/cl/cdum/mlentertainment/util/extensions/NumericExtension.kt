package cl.cdum.mlentertainment.util.extensions

import java.text.DecimalFormat

fun Long.currencyFormat(): String {
    val numberFormat = DecimalFormat("#,###")
    return "$${numberFormat.format(this)}".replace(",", ".")
}