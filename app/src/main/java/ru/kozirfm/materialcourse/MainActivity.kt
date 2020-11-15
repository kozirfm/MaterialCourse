package ru.kozirfm.materialcourse

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            showDialog().show()
        }

    }

    private fun showDialog(): Dialog {
        return MaterialAlertDialogBuilder(this, R.style.DialogStyle)
            .setTitle(resources.getString(R.string.dialog))
            .setMessage(resources.getString(R.string.dialog_message))
            .setPositiveButton("OK") { dialogInterface, _ ->
                dialogInterface.dismiss()
            }.create()
    }
}