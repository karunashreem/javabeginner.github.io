int index = 0;
for(;index < n - 1; index++)
{
    if(arr[index] >= arr[index + 1])
         return index;
}
return index;