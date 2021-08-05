class Solution {
     public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
       
        List<Map.Entry<Integer, Integer> > list =new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
  
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
         
       HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
 
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int c=0;
        int v=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if(hm.get(arr[i])==null)
                hm.put(arr[i],1);
            else
                hm.put(arr[i],hm.get(arr[i])+1);
        }
        hm=sortByValue(hm);
         for (Map.Entry<Integer, Integer> en : hm.entrySet()) {
          if(v<=arr.length/2)
              return c;
             c=c+1; //en.getValue();
                 v=v-(int)en.getValue();
        }
        return c;
        
        
    }
}