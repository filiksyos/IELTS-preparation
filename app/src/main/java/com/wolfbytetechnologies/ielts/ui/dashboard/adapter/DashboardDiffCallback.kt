package com.wolfbytetechnologies.ielts.ui.dashboard.adapter

import androidx.recyclerview.widget.DiffUtil
import com.wolfbytetechnologies.ielts.ui.dashboard.data.DashboardItems

class DashboardDiffCallback : DiffUtil.ItemCallback<DashboardItems>() {
    override fun areItemsTheSame(oldItem: DashboardItems, newItem: DashboardItems): Boolean {
        return oldItem.itemText == newItem.itemText && oldItem.cardType == newItem.cardType
    }

    override fun areContentsTheSame(oldItem: DashboardItems, newItem: DashboardItems): Boolean {
        return oldItem == newItem
    }
}