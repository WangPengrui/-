package kama;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList list = new MyLinkedList();
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            list.addFirst(sc.nextInt());
        }
        int oNum = sc.nextInt();
        sc.nextLine();
        while(oNum-- > 0){
            String[] o = sc.nextLine().split(" ");
            if(o[0].equals("show")){
                list.show();
            }
            else if(o[0].equals("delete")){
                list.delete(Integer.parseInt(o[1]) - 1);
            }
            else if(o[0].equals("get")){
                list.get(Integer.parseInt(o[1]) - 1);
            }
            else if(o[0].equals("insert")){
                list.insert(Integer.parseInt(o[1]) - 1, Integer.parseInt(o[2]));
            }
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(){
    }
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}


class MyLinkedList {
    public ListNode dummyhead = new ListNode(-1, null);  //链表的头
    public int len = 0;
    // 头插法
    public void addFirst(int val) {
        ListNode cur = new ListNode(val);
        if(len == 0){
            dummyhead.next = cur;
            len++;
            return;
        }
        cur.next = dummyhead.next;
        dummyhead.next = cur;
        len++;
    }
    // 删除idx位置的节点（从0开始）
    public void delete(int idx){
        if(idx > len - 1){
            System.out.println("delete fail");
            return;
        }
        ListNode cur = dummyhead;
        while(idx-- > 0){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        System.out.println("delete OK");
        len--;
    }
    // 插入（从0开始）
    public void insert(int idx, int val){
        if(idx > len){
            System.out.println("insert fail");
            return;
        }
        ListNode cur = dummyhead;
        ListNode node = new ListNode(val);
        while(idx-- > 0){
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        System.out.println("insert OK");
        len++;
    }
    // 查找
    public void get(int idx){
        if(idx > len - 1){
            System.out.println("get fail");
        }
        ListNode cur = dummyhead;
        while(idx-- >= 0){
            cur = cur.next;
        }
        System.out.println(cur.val);
    }
    // 遍历输出
    public void show(){
        if(len == 0){
            System.out.println("Link list is empty");
            return;
        }
        ListNode cur = dummyhead;
        while(cur.next.next != null){
            cur = cur.next;
            System.out.print(cur.val);
            System.out.print(" ");
        }
        System.out.print(cur.next.val);
        System.out.println();
    }
    // 查长度
    public int size(){
        return len;
    }
}
