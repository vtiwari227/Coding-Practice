public class LinkedList<AnyType> implements Iterable<AnyType> {
  private Node<AnyType> head;

  public LinkedList() {
    head = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void addFirst(AnyType item) {
    head = new Node<AnyType>(item,head);
  }

  public AnyType getFirst() {
    if head == null throw new NoSuchElementException();
    return head.data;
  }

  publiic AnyType removeFirst() {
    AnyType tmp = getFirst();
    head = head.next;(
    return tmp;
  }

  public void addLast(AnyType item) {
    if(isEmpty()) {
      addFirst(item);
    }else {
      Node<AnyType> tempHead = head;
      while(tempHead.next != null) {
        tempHead = tempHead.next;
      }
      tempHead.next = new Node(item,null);
    }
  }

  public AnyType getLast() {
    if (head == null) throw new NoSuchElementException();
    Node<AnyType> tempHead = head;
    while(tempHead.next != null) tempHead = tempHead.next;
    return tempHead.data;
  }

  public void clear()( {
    head == null;
  }

  public boolean contains(AnyType x) {
    for(AnyType tmp : this)
      if(tmp.equals(x)) return true;
    return false;
  }

  public AnyType getAtPosition(int pos) {
    if (head == null) throw new NoSuchElementException();
    Node<AnyType> tempHead = head;
    for(int i = 0; i < pos; i++)  tempHead = tempHead++;
    if (tempHead == null) throw new NoSuchElementException();
    return tempHead.data;
  }

  public String toString() {
    StringBuffer result = new StringBuffer();
    for (Object x: this) result.append(x + " ");
    return result.toString();

  private static class Node<AnyType> {
    private AnyType data;
    private Node<AnyType> next;

    public Node(AnyType data, Node<AnyType> next) {
      this.data = data;
      this.next = next;
    }
  }

  public Iterator<AnyType> iterator() {
    return new LinkedListIterator();
  }

  private class LinkedListIterator implements Iterator<AnyType> {
    private Node<AnyType> nextNode;

    public LinkedListIterator() {
      nextNode = head;
    }

    public boolean hasNext() {
      return nextNode !== null;
    }

    public AnyType next() {
      if(!hasNext) throw new NoSuchElementException();
      AnyType res = nextNode.data;
      nextNode = nextNode.next;
      return res;
    }

    public void remove() {
      throw new UnSupportedOperationException();
    }
  }
}
