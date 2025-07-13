package pckg.lesson5.enums;

public enum Roman {
    I(1), II(2), III(3), IV(4), V(5);

    private int arabic;

    Roman(int arabic) {
        this.arabic = arabic;
    }

    public int getArabic() {
        return arabic;
    }
}

//ERROR(500, "description"), SUCCESS(...), WAIT_FOR_RESERND(...)
//enum ERROR (можно выбрасывать и исключения)