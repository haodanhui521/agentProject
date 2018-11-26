package com.agent.core.util;

import java.math.BigDecimal;

@FunctionalInterface
public interface ToBigDecimalFunction<T> {
    BigDecimal applyAsBigDecimal(T value);
}
