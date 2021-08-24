class MyHashMap {
    class Node {
        int key, value = 0;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<Node>[] HashMap;
    int size;

    // MyHashMap() : empty Map으로 생성.
    public MyHashMap() {
        // initiallize
        // 1000을 한 이유 : 조건에 많아봐야 1000번 콜한다고 하였음. put을 1000번 할 경우도 있으니 1000까지
        this.size = 1000;
        this.HashMap = new ArrayList[size];
    }

    // void put() : 키와 쌍으로 HashMap에 insert.
    // - if Key가 이미 Map에 존재하는 경우 현재 value를 업데이트.
    // index의 역할 : ArrayList는 Index와 Value를 가지고 있는 자료구조.
    // - 따라서 ArrayList의 index를 Key로 해서 HashMap의 Key처럼 사용.
    public void put (int key, int value){
        int index = key % this.size;
        System.out.println("PUT Func=====================");
        System.out.println("index : "+ index);
        System.out.println("is null : "+ this.HashMap[index]);
        if(this.HashMap[index] == null) {
            System.out.println("is Null...");
            // 키가 Null인 경우
            this.HashMap[index] = new ArrayList<Node>();
            // insert
            this.HashMap[index].add(new Node(key, value));
        } else {
            // 키가 Not Null인 경우 index에 해당하는 HashMap에서 Key Search
            for(int i=0; i< this.HashMap[index].size(); i++) {
                if(this.HashMap[index].get(i).key == key) {
                    // 키에 해당하는 value 업데이트
                    this.HashMap[index].get(i).value = value;
                    return;
                }
            }
            this.HashMap[index].add(new Node(key, value));
        }
    }
    // int get() : key가 존재하지 않을 경우 -1, key가 존재할 경우 value return
    public int get(int key){
        int index = key % this.size;
        System.out.println("GET Func=====================");
        System.out.println("index : "+ index);
        System.out.println("is null : "+ this.HashMap[index]);
        if(this.HashMap[index] == null) {
            System.out.println("Return : -1");
            return -1;
        } else {
            for(Node node : this.HashMap[index]) {
                if(node.key == key) {
                    System.out.println("Return : "+node.value);
                    return node.value;
                }
            }
        }
        return -1;
    }
    // void remove() : key가 존재할 경우 key와 value를 제거한다.
    public void remove(int key){
        int index = key % this.size;
        System.out.println("Remove Func=====================");
        System.out.println("index : "+ index);
        System.out.println("is null : "+ this.HashMap[index]);

        if(this.HashMap[index] != null) {
            for(int i=0; i < this.HashMap[index].size(); i++) {
                if(this.HashMap[index].get(i).key == key) {
                    this.HashMap[index].remove(i);
                    break;
                }
            }
        }
    }

 /*   public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1,1);
        myHashMap.put(1,2);
        myHashMap.put(2,2);
        myHashMap.put(2,3);
        myHashMap.get(3);
        myHashMap.get(1);
        myHashMap.get(2);
        myHashMap.remove(2);
        myHashMap.get(2);
        myHashMap.put(2,3);
        myHashMap.get(2);
    }*/
}
