package com.dmm.bootcamp.yatter2024.ui.timeline.bindingmodel

import com.dmm.bootcamp.yatter2024.domain.model.Username

data class StatusBindingModel(
    val id: String,
    val displayName: String,
    val username: String,
    val avatar: String?,
    val content: String,
    val attachmentMediaList: List<MediaBindingModel>
)