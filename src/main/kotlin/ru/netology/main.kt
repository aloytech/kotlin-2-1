package ru.netology

fun main() {
    val amount = 7500
    val minTransferFee = 3500
    val amountRub = amount / 100
    val amountKop = amount % 100
    val transferFee = if (amount * 0.0075 >= minTransferFee) (amount * 0.0075).toInt() else minTransferFee
    val transferFeeRub = transferFee / 100
    val transferFeeKop = transferFee % 100

    println(
        "При переводе $amountRub" + '\u20BD' + " $amountKop коп. " +
                "комиссия составит $transferFeeRub" + '\u20BD' + " $transferFeeKop коп."
    )
}