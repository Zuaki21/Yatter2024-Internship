package com.dmm.bootcamp.yatter2024.infra.domain.converter

import android.os.Build
import androidx.annotation.RequiresApi
import com.dmm.bootcamp.yatter2024.domain.model.Status
import com.dmm.bootcamp.yatter2024.domain.model.StatusId
import com.dmm.bootcamp.yatter2024.infra.api.json.StatusJson
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter



object StatusConverter {
  @RequiresApi(Build.VERSION_CODES.O)
  fun convertToDomainModel(jsonList: List<StatusJson>): List<Status> =
    jsonList.map { convertToDomainModel(it) }

  @RequiresApi(Build.VERSION_CODES.O)
  var formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")
  @RequiresApi(Build.VERSION_CODES.O)
  fun convertToDomainModel(json: StatusJson): Status = Status(
    id = StatusId(json.id),
    account = AccountConverter.convertToDomainModel(json.account),
    content = json.content ?: "",
    createdAt = LocalDateTime.parse(json.createdAt, formatter),
    attachmentMediaList =  json.attachmentMediaList?.let {
      MediaConverter.convertToDomainModel(it)
    } ?: listOf()
  )
}
