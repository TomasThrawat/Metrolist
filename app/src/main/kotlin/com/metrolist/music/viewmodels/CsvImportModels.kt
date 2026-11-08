package com.metrolist.music.viewmodels

/** State used by the CSV playlist-import column mapping dialog. */
data class CsvImportState(
    val previewRows: List<List<String>>,
    val artistColumnIndex: Int,
    val titleColumnIndex: Int,
    val urlColumnIndex: Int,
    val hasHeader: Boolean,
)

/** A converted song displayed while a CSV playlist is being imported. */
data class ConvertedSongLog(
    val title: String,
    val artists: String,
)
