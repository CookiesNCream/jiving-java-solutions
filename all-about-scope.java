Difference(int[] e) {
        elements = e;
}
    
int computeDifference() {
    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i<elements.length; i++){
        for (int j = i+1; j<elements.length; j++){
        list.add(Math.abs(elements[i] - elements[j]));
        }
    }
    maximumDifference = Collections.max(list);
    return maximumDifference;
}

/**/

Difference(int a[]) {
        elements = a;
}

int computeDifference() {
    Arrays.sort(elements);
    maximumDifference=elements[elements.length-1]-elements[0];
    return maximumDifference;
} 
