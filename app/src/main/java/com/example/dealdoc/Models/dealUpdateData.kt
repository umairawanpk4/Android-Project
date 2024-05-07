package com.example.dealdoc.Models

data class dealUpdateData(
    val `data`: updateDeal,
    val message: String,
    val success: Boolean
)
data class updateDeal(
    val closed_date: String,
    val color: Any,
    val createdAt: String,
    val deal_created_by: Int,
    val deal_name: String,
    val id: Int,
    val in_review: Boolean,
    val investment_size: Int,
    val is_draft: Boolean,
    val is_session_purchased: Boolean,
    val is_video_purchased: Boolean,
    val is_video_recommended: Any,
    val metadata: Any,
    val payement_Id: Any,
    val session_start_date: Any,
    val session_url: Any,
    val status: Any,
    val updatedAt: String
)