function sortingArray(arr)
{
    for(let i=0;i<arr.length;i++)
    {
        for(let j=0;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                let temp=arr[i];
                arr[i]=arr[j]
                arr[j]=temp
            }
        }
    }
}

let arr=[5,3,8,6,0,9]
console.log("Array before sorting:",arr);
sortingArray(arr)
console.log("Array after sorting:",arr)