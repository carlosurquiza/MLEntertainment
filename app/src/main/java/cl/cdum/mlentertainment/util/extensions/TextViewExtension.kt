package cl.cdum.mlentertainment.util.extensions

import android.text.SpannableString
import android.text.Spanned
import android.text.style.StrikethroughSpan
import android.widget.TextView

fun TextView.strike() {
    val string = SpannableString(text)
    string.setSpan(StrikethroughSpan(), 0, string.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
    text = string
}