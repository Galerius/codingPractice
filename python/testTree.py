from BinaryTree import Tree

values = [50,3,4,52,122,5,4,7,55,21,9,12,11]

tree = Tree()
for v in values:
    tree.add(v)

tree.breath_search(122)
#tree.pretty_print()
