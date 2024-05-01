if(s.size()%2==1) {
    s.pop();
}
while(!s.empty() && s.size()>1) {
    int ans = s.top();
    s.pop();
    if(ans!=s.top()+1) {
        return false;
    }
}
return true;
