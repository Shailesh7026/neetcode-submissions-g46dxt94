class MyHashMap {

    public class ListNode{
        int key, val;
        ListNode next;

        public ListNode(int key, int val, ListNode next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }

        public ListNode() {
            this(-1, -1, null);
        }

    }

    ListNode map[];

    public MyHashMap() {
        map = new ListNode[101];
        for(int i = 0 ; i<map.length ; i++){
            map[i] = new ListNode();
        }
    }
    
    public void put(int key, int value) {
        ListNode curr = map[key % map.length];
        while(curr.next != null){
            if (curr.next.key == key) {
                curr.next.val = value;
                return;
            }
            curr=curr.next;
        }

        curr.next = new ListNode(key,value,null);
    }
    
    public int get(int key) {
        ListNode curr = map[key % map.length];
        while(curr != null){
            if(curr.key == key){
                return curr.val;
            }
            curr=curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
         ListNode curr = map[key % map.length];
        while(curr.next != null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return;
            }
            curr=curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */