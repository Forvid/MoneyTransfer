fun main() {
    val amount = 10_000 // Сумма перевода в рублях
    val commissionPercent = 0.0075
    val minCommission = 35.0

    val commission = amount * commissionPercent
    val finalCommission = if (commission < minCommission) minCommission else commission

    println("Сумма комиссии за перевод: ${finalCommission.toInt()} рублей")
}
