Day 2 

Patterns = Array continued

Pattern 4 = Prefix Accumulation
Core idea = Pre compute info for subarray in o(1)

1. Find sum of subarray
2. Check if subarray sum equal K
3. Equilibrium index (left sum == right sum)

Pattern 5 = Frequency count
Core idea = Convert array into freq info

1. Find elements with max freq
2. Find missing number(1...N)
3. Check if array contains duplicate // not doing it, as it is very simple, put all in set,
    if set already contains the item, then it mean it contains duplicate.