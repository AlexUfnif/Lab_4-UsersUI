package com.example.task_2.data.database.dbmapper

import com.example.task_2.data.database.model.ColorDbModel
import com.example.task_2.data.database.model.NoteDbModel
import com.example.task_2.domain.model.ColorModel
import com.example.task_2.domain.model.NoteModel


interface DbMapper {

    // NoteDbModel -> NoteModel

    fun mapNotes(
        noteDbModels: List<NoteDbModel>,
        colorDbModels: Map<Long, ColorDbModel>
    ): List<NoteModel>

    fun mapNote(noteDbModel: NoteDbModel, colorDbModel: ColorDbModel): NoteModel

    // ColorDbModel -> ColorModel

    fun mapColors(colorDbModels: List<ColorDbModel>): List<ColorModel>

    fun mapColor(colorDbModel: ColorDbModel): ColorModel

    // NoteModel -> NoteDbModel

    fun mapDbNote(note: NoteModel): NoteDbModel

    // ColorModel -> ColorDbModel

    fun mapDbColors(colors: List<ColorModel>): List<ColorDbModel>

    fun mapDbColor(color: ColorModel): ColorDbModel
}