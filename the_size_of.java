void dataTypes(int a, float b, double c, long long l, string d){
    float d1=b/c;
    double d2=b/a;
    int d3=c/a;
    long long d4=d3+l;
    cout<<sizeof(d1)<<" "<<sizeof(d2)<<" "<<sizeof(d3)  <<" "<<sizeof(d4)<<endl;
    cout<<sizeof(d)<<" "<<sizeof(d[3])<<endl;

}