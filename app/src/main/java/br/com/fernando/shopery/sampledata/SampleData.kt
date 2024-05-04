package br.com.fernando.shopery.sampledata

import br.com.fernando.shopery.R
import br.com.fernando.shopery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hambúrguer",
        price = BigDecimal("12.99"),
        image = R.drawable.burguer
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("19.99"),
        image = R.drawable.pizza
    ),
    Product(
        name = "Batata frita",
        price = BigDecimal("5.99"),
        image = R.drawable.fries
    )
)