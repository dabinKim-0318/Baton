package com.depromeet.baton.domain.model

enum class TransactionMethod(val value: String) {
    FACE("현장결제(대면)"),
    NON_FACE("선결제(비대면)"),
    SELLER("판매자 부담"),
    CONSUMER("구매자 부담"),
}