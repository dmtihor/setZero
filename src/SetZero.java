public class SetZero {
    public int set(int num, int i) {
        int mask = 1 << i - 1;
        return (num & ~mask);
    }
}