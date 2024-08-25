package com.example.todoapp.home

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.todoapp.databinding.AddTaskBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class AddTaskFragment:BottomSheetDialogFragment() {
    lateinit var binding: AddTaskBinding
    var calender:Calendar = Calendar.getInstance()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AddTaskBinding.inflate(inflater,container,false)
        return binding.root
    }
    companion object{
        const val TAG = "ModelBottomSheet"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvDate.setOnClickListener{
            selectDate()
        }
        binding.tvTime.setOnClickListener{
            setTime()
        }
    }


    fun selectDate(){
            val year = calender.get(Calendar.YEAR)
            val month = calender.get(Calendar.MONTH)
            val day = calender.get(Calendar.DAY_OF_MONTH)
            val datePickerDialog = DatePickerDialog(requireContext(),
                { view, year, monthOfYear, dayOfMonth ->
                    binding.tvDate.text = (dayOfMonth.toString() + "-" + (monthOfYear+1).toString()+ "-" + year.toString())
                },
                year,
                month,
                day
                )
        datePickerDialog.show()
        }
    fun setTime(){
        val hours = calender.get(Calendar.HOUR_OF_DAY)
        val min = calender.get(Calendar.MINUTE)
        val timePicker = TimePickerDialog(requireContext(),
            { view, hourOfDay, minute ->
                binding.tvTime.text = (hourOfDay.toString() + ":" + minute.toString())
             }, hours,min,false
            )
        timePicker.show()
    }
    }