package com.example.task_2.data.repository

import androidx.lifecycle.LiveData
import com.example.task_2.domain.model.ColorModel
import com.example.task_2.domain.model.NoteModel


/**
 * Позволяет общаться с базой данных приложения.
 */
interface Repository {

    // notes

    fun getAllNotesNotInTrash(): LiveData<List<NoteModel>>

    fun getAllNotesInTrash(): LiveData<List<NoteModel>>

    fun getNote(id: Long): LiveData<NoteModel>

    fun insertNote(note: NoteModel)

    fun deleteNote(id: Long)

    fun deleteNotes(noteIds: List<Long>)

    fun moveNoteToTrash(noteId: Long)

    fun restoreNotesFromTrash(noteIds: List<Long>)

    // colors

    fun getAllColors(): LiveData<List<ColorModel>>

    fun getAllColorsSync(): List<ColorModel>

    fun getColor(id: Long): LiveData<ColorModel>

    fun getColorSync(id: Long): ColorModel
}