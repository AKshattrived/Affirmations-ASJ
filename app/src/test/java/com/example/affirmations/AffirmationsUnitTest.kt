package com.example.affirmations

import android.content.Context
import com.example.affirmations.adapterr.ItemAdapter
import com.example.affirmations.modle.Affirmation
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.mockito.Mockito

class AffirmationsUnitTest {
    private val context = Mockito.mock(Context::class.java)

    @Test
    fun adapter_size(){
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2))

        val adapter = ItemAdapter(context,data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}