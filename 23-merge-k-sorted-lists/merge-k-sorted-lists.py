# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Definition for singly-linked list.
#class ListNode(object):
#   def __init__(self, val=0, next=None):
#        self.val = val
 #       self.next = next
class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[Optional[ListNode]]
        :rtype: Optional[ListNode]
        """
        vals = []
        for node in lists:
            while node:
                vals.append(node.val)
                node = node.next
        if not vals:
            return None
        vals.sort()
        dummy = ListNode(0)
        curr = dummy
        for v in vals:
            curr.next = ListNode(v)
            curr = curr.next
        return dummy.next
        