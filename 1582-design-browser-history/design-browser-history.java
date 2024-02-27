class BrowserHistory {
    public String homepage;
    public List<String> history = new ArrayList<String>();
    public int curr;

    public BrowserHistory(String homepage) {
        this.homepage = homepage;
        this.history.add(homepage);
        this.curr = 0;
    }
    
    public void visit(String url) {
        this.history = this.history.subList(0, this.curr+1);
        this.history.add(url);
        this.curr++;
    }
    
    public String back(int steps) {
        this.curr = (steps > this.curr) ? 0 : this.curr-steps;
        return this.history.get(this.curr);
    }
    
    public String forward(int steps) {
        this.curr = ((this.curr+steps) > (this.history.size()-1)) ? (this.history.size()-1) : this.curr+steps;
        return this.history.get(this.curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */