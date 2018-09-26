package com.cogitator.mpandroidchartdemo

import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.formatter.IAxisValueFormatter

/**
 * @author Ankit Kumar on 26/09/2018
 */
class CustomXAxisValueFormatter : IAxisValueFormatter {

    override fun getFormattedValue(value: Float, axis: AxisBase?): String {

        return when (value) {
            0F -> "Jan"
            1F -> "Feb"
            2F -> "Mar"
            3F -> "Apr"
            4F -> "May"
            5F -> "Jun"
            6F -> "Jul"
            7F -> "Aug"
            8F -> "Sep"
            9F -> "Oct"
            10F -> "Nov"
            11F -> "Dec"
            else -> ""
        }

    }
}