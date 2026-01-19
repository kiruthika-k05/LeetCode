class Solution:
    def maxSideLength(self, mat, threshold):
        m, n = len(mat), len(mat[0])
        pre = [[0] * (n + 1) for _ in range(m + 1)]
        for i in range(m):
            for j in range(n):
                pre[i+1][j+1] = (
                    mat[i][j]
                    + pre[i][j+1]
                    + pre[i+1][j]
                    - pre[i][j]
                )

        def can(k):
            for i in range(m - k + 1):
                for j in range(n - k + 1):
                    s = pre[i+k][j+k] - pre[i][j+k] - pre[i+k][j] + pre[i][j]
                    if s <= threshold:
                        return True
            return False

        lo, hi = 0, min(m, n)
        while lo < hi:
            mid = (lo + hi + 1) // 2
            if can(mid):
                lo = mid
            else:
                hi = mid - 1

        return lo