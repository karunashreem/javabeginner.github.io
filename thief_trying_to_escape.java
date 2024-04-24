int sum=0;
int count=0;
for(int i=0;i<N;i++){
    int num=arr[i];
    while(num>0){
        if(num<=X){
            count++;
            break;
        }
        else{
        num=num-X+Y;
        count++;
        }
    }
}   
return count;