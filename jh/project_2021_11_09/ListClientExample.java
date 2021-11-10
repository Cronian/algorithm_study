package project_2021_11_09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    /*
    * 1. ArrayList  vs  LinkedList
    *   - 인스턴스 변수 list를 LinkedList, ArrayList 등 구현된 클래스를 사용하지 않고 List 인터페이스를 사용한다는게 Point
    *   - 캡슐화 -> List 객체에 대해서 반환하지만 정확히 어떤 List인지 알 수 없음.
    * */
    // java.util의 List
    // LinkedList, ArrayList 등 구현된 클래스를 사용하지 않고 List 인터페이스를 사용한다는게 Point
    private List list;

    // Constructor
    public ListClientExample() {
        // list = new LinkedList();
        list = new ArrayList();
    }

    // Getter
    public List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample listEx = new ListClientExample();
        List list = listEx.getList();
        System.out.println(list);
    }
}
