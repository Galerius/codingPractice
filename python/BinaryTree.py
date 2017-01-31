from queue import Queue

class Node:
    def __init__(self,value):
        self.left = None
        self.right = None
        self.value = value

class Tree:
    def __init__(self):
        self.root = None

    def get_root(self):
        return self.root

    def add(self,value):
        if self.root is None:
            self.root = Node(value)
        else:
            self._add(value,self.root)

    def _add(self,value,node):
        if value < node.value:
            if node.left is None:
                node.left = Node(value)
            #elif value > node.left.value:
            #    new_node = Node(value)
            #    new_node.left = node.left
            #    node.left = new_node
            else:
                self._add(value,node.left)
        else:
            if node.right is None:
                node.right = Node(value)
            #elif value < node.right.value:
            #    new_node = Node(value)
            #    new_node.right = node.right
            #    node.right = new_node
            else:
                self._add(value,node.right)
    
    def depth_search(self,value):
        self._depth_search(value,self.root)

    def _depth_search(self,value,node):
        print(node.value)
        if node.value == value:
            return
        if node.left:
            self._depth_search(value,node.left)
        if node.right:
            self._depth_search(value,node.right)

    def breath_search(self,value):
        node_queue = Queue()
        node_set = set()
        node_queue.put(self.root)
        while (not node_queue.empty()):
            current_node = node_queue.get()
            print(current_node.value)
            if current_node.value == value:
                return
            for child_node in [current_node.left,current_node.right]:
                if child_node not in node_set and child_node:
                    node_set.add(child_node)
                    node_queue.put(child_node)

    def pretty_print(self):
        self._pretty_print(self.root,0)

    def _pretty_print(self,node,level):
        print('  ' * level + str(node.value))
        if node.left is not None:
            print('L',end="")
            self._pretty_print(node.left, level + 1)
        if node.right is not None:
            print('R',end="")
            self._pretty_print(node.right, level + 1)
        
