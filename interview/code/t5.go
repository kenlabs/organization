func divide(dividend int, divisor int) int {
    if dividend == 0 {
        return 0
    }
    if dividend == math.MinInt32 && divisor == -1 {
        return math.MaxInt32
    }

    sign := 1
    if (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0) {
        sign = -1
    }
    
    dividend, divisor = abs(dividend), abs(divisor)
    result := 0
    
    for dividend >= divisor {
        tempDivisor, count := divisor, 1
        for dividend >= (tempDivisor << 1) {
            tempDivisor <<= 1
            count <<= 1
        }
        
        dividend -= tempDivisor
        result += count
    }
    
    return sign * result
}

func abs(x int) int {
    if x < 0 {
        return -x
    }
    return x
}