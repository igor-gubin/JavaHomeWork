package com.pb.gubin.hw7;

public enum Size {
    XXS,
    XS,
    S,
    M;
    private String title;

    Size(String title) {
        this.title = title;
    }

    public void getDescription() {
        if (title == "XXS") {
            System.out.println("Взрослый размер");
        } else {
            System.out.println("Детский размер");
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
