public class UShort {
    private int value;
    
    public UShort() {
        value = 0;
    }
    
    public UShort(int n) {
        value = n & 0xFFFF;
    }
    
    public int add(int n) {
        return (this.value + n) & 0xFFFF;
    }
    
    public int addEquals(int n) {
        this.value = this.Add(n);
        return this.value;
    }
    
    public int subtract(int n) {
        return (this.value - n) & 0xFFFF;
    }
    
    public int subtractEquals(int n) {
        this.value = this.Subtract(n);
        return this.value;
    }
    
    public String toString() {
        return Integer.toString(this.value);
    }
}
