package com.example.laboratorio1

fun main(){
    //Definicion de variables
    val productId: Int = 101
    val productName: String = "Smartphone X1"
    var productDescription: String? = null
    var stockQuantity: Int = 25
    val unitPrice: Double = 599.99

    println("---Datos Iniciales Cargados---")

    //2. Lógica de Impuestos
    val TAX_RATE = 0.15 // IVA del 15%
    val totalPriceWithTax = unitPrice * (1 + TAX_RATE)

    //3. Uso del Operador Elvis (?:)
    val descriptionToShow = productDescription ?: "Sin descripción disponible"
    println("Producto: $productName")
    println("Descripción: $descriptionToShow")

    // 4. Simulación de Venta
    val itemsSold = 5
    stockQuantity -= itemsSold //Actualización de variable mutable

    // 5. Generación de Reporte con Plantilla de Cadena
    val report = """ --- REPORTE DE INVENTARIO --- 
    ID: $productId | Nombre: $productName 
    Precio Final: $${String.format("%.2f", totalPriceWithTax)} 
    Stock Actual: $stockQuantity 
    Estado: ${if (stockQuantity > 10) "Suficiente" else "Crítico"} ----------------------------- 
    """.trimIndent()
}