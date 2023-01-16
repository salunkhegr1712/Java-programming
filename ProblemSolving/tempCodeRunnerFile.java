Arrays.Sort(a);
        int start=0,end=a.length-1,mid=0;
        while(start!=end){
            mid=(start+end)/2;
            if(a[mid]==val){
                return true;
            }
            else if(a[mid]>val){
                start= mid;