class Cashier {
    private int nth;
    private int dis;
    private int cnt;
    private Map<Integer,Integer> item;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.nth = n;
        this.dis = discount;
        this.item = new HashMap<>();
        for(int i=0;i<products.length;i++) {
            item.put(products[i],prices[i]);
        }
        this.cnt = 0;
    }
    
    public double getBill(int[] product, int[] amount) {
        cnt++;
        double sum = 0;
        for(int i=0;i<product.length;i++) {
            sum += item.get(product[i])*amount[i];
        }
        if(cnt == nth) {
            cnt = 0;
            sum = sum*((double)(100-dis)/(double)100);
        }
        return sum;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */
