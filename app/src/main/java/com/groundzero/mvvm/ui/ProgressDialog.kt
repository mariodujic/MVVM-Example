package com.groundzero.mvvm.ui

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import com.groundzero.mvvm.R
import javax.inject.Inject

class ProgressDialog @Inject constructor() {

    private var dialog: Dialog? = null

    fun showDialog(context: Context, message: String) {
        dialog = Dialog(context)
        val view =
            LayoutInflater.from(context).inflate(R.layout.custom_progress_dialog, null, false)
        val viewMessage = view.findViewById<TextView>(R.id.progress_dialog_message)
        viewMessage.text = message
        dialog!!.setContentView(view)
        dialog!!.show()
    }

    fun cancelDialog() {
        dialog?.dismiss()
    }
}