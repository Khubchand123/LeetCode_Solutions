class BrowserHistory {
    List<String> obj;
    int cur;
    public BrowserHistory(String homepage) {
        obj = new ArrayList<>();
        obj.add(homepage);
        cur = 0;
    }
    
    public void visit(String url) {
        int k = obj.size()-cur-1;
        while(k-->0){
            obj.remove(obj.size()-1);
        }
        obj.add(url);
        cur = obj.size()-1;
    }
    
    public String back(int steps) {
        if(cur>=steps){
            cur=cur-steps;
        }
        else{
            cur=0;
        }
        return obj.get(cur);
    }
    
    public String forward(int steps) {
        if(cur+steps<obj.size()){
            cur=cur+steps;
        }
        else{
            cur=obj.size()-1;
        }
        return obj.get(cur);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */