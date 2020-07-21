package com.qa.enums;

public enum CalculatorKeys {
	    NUM0("num0Button"),
	    NUM1("num1Button"),
	    NUM2("num2Button"),
	    NUM3("num3Button"),
	    NUM4("num4Button"),
	    NUM5("num5Button"),
	    NUM6("num6Button"),
	    NUM7("num7Button"),
	    NUM8("num8Button"),
	    NUM9("num9Button"),
	    DECIMAL("decimalSeparatorButton"),
	    PLUS("plusButton"),
	    MINUS("minusButton"),
	    MULTIPLY("multiplyButton"),
	    DIVIDE("divideButton"),
	    EQUAL("equalButton"),
	    PERCENT("percentButton"),
	    SQUAREROOT("squareRootButton"),
	    SQUARE("xpower2Button"),
	    CUBE("xpower3Button"),
	    RECIPROCAL("invertButton");

	    private final String keyId;

	    CalculatorKeys(String KeyId) {
	        this.keyId = KeyId;
	    }

	    public String toString() {
	        return String.valueOf(this.keyId);
	    }

}
