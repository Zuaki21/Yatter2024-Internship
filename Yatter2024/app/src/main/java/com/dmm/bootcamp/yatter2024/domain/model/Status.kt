package com.dmm.bootcamp.yatter2024.domain.model

import com.dmm.bootcamp.yatter2024.common.ddd.Entity
import java.time.LocalDateTime

class Status(
  id: StatusId,
  val account: Account,
  val content: String,
  val createdAt: LocalDateTime,
  val attachmentMediaList: List<Media>
) : Entity<StatusId>(id)
