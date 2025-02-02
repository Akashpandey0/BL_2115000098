
class HotelBooking {
    String gN, rT;
    int n;

    HotelBooking() {
        gN = "";
        rT = "";
        n = 0;
    }

    HotelBooking(String gN, String rT, int n) {
        this.gN = gN;
        this.rT = rT;
        this.n = n;
    }

    HotelBooking(HotelBooking h) {
        this.gN = h.gN;
        this.rT = h.rT;
        this.n = h.n;
    }
}
