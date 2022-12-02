package com.example.crimeintent

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.util.*

class ImageFragment() : DialogFragment() {
    interface Callbacks {
        fun onImageSelected(id: Int)
    }

}