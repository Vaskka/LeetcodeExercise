package org.example.model;

import lombok.Data;

/**
 * 单链表node
 */
@Data
public class SingleListNode {
    int val;
    SingleListNode next;
    SingleListNode() { }
    SingleListNode(int val) { this.val = val; }
    SingleListNode(int val, SingleListNode next) { this.val = val; this.next = next; }
}
