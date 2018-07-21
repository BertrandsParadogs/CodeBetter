# CodeBetter

# LeetCode

## 1. 
## 2. 
## 3. 
## 4. 
## 5. 
## 6. 
## 7. 
## 8. 
## 9. 
## 10. 
## 11. 
## 12. 
## 13. 
## 14. 
## 15. 
## 16. 
## 17. 
## 18. 
## 19. 
## 20. 
## 21. 
## 22. 
## 23. 
## 24. 
## 25. 
## 26. 
## 27. 
## 28. 
## 29. 
## 30. 
## 31. 
## 32. 
## 33. 
## 34. 
## 35. 
## 36. 
## 37. 
## 38. 
## 39. 
## 40. 
## 41. 
## 42. 
## 43. 
## 44. 
## 45. 
## 46. 
## 47. 
## 48. 
## 49. 
## 50. 
## 51. 
## 52. 
## 53. [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/description/)
### Intuition
Dynamic Programming. Similar to the road segment one we saw in algo class.
We find the maximum sum we can achieve at each index which has the recurrence relation as follows:
`sum[i] = cost[i] + max(sum[i-1], 0)`

## 54. 
## 55. 
## 56. 
## 57. 
## 58. 
## 59. 
## 60. 
## 61. 
## 62. 
## 63. 
## 64. 
## 65. 
## 66. 
## 67. 
## 68. 
## 69. 
## 70. 
## 71. 
## 72. 
## 73. 
## 74. 
## 75. 
## 76. 
## 77. 
## 78. 
## 79. 
## 80. 
## 81. 
## 82. 
## 83. [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/)
### Intuition
Skip the next node if the value is the same as the current node.

## 84. 
## 85. 
## 86. 
## 87. 
## 88. 
## 89. 
## 90. 
## 91. 
## 92. 
## 93. 
## 94. 
## 95. 
## 96. 
## 97. 
## 98. 
## 99. 
## 100. 
## 101. 
## 102. 
## 103. 
## 104. 
## 105. 
## 106. 
## 107. 
## 108. [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/)
### Intuition
Recursion and binary search (sort of).
## 109. 
## 110. 
## 111. 
## 112. [Path Sum](https://leetcode.com/problems/path-sum/description/)
### Intuition
DFS. Check Leaf. Update sum at each level.
## 113. 
## 114. 
## 115. 
## 116. 
## 117. 
## 118. 
## 119. 
## 120. 
## 121. [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)
### Intuition
Problem that I have seen before in Algorithm class. We can use Kadane's Algorithm to find the max subarray. The idea is to calculate the difference of the original array and find a contiguous subarray giving the max profit. If the difference falls beflow 0, reset it to 0.

### WIL
For comparing max with the current value, we could simply use `Math.max(cur, max)` instead of an if-statement.
## 122. 
## 123. 
## 124. 
## 125. 
## 126. 
## 127. 
## 128. 
## 129. 
## 130. 
## 131. 
## 132. 
## 133. 
## 134. 
## 135. 
## 136. 
## 137. 
## 138. 
## 139. 
## 140. 
## 141. [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/description/)
### Intuition
Use two pointers as in the Floyd's Cycle detection algorithm where one moves two steps at a time and the other one step at a time.

## 142. 
## 143. 
## 144. 
## 145. 
## 146. 
## 147. 
## 148. 
## 149. 
## 150. 
## 151. 
## 152. 
## 153. 
## 154. 
## 155. 
## 156. 
## 157. 
## 158. 
## 159. 
## 160. 
## 161. 
## 162. 
## 163. 
## 164. 
## 165. 
## 166. 
## 167. 
## 168. 
## 169. [Majority Element](https://leetcode.com/problems/majority-element/description/)
**The Boyer–Moore majority vote algorithm** is an algorithm for finding the majority of a sequence of elements using linear time and constant space. 
### Intuition

If we had some way of counting instances of the majority element as +1+1 and instances of any other element as -1−1, summing them would make it obvious that the majority element is indeed the majority element.

### Algorithm

Essentially, what Boyer-Moore does is look for a suffix sufsuf of `nums` where `suf[0]suf[0]` is the majority element in that suffix. To do this, we maintain a count, which is incremented whenever we see an instance of our current candidate for majority element and decremented whenever we see anything else. Whenever count equals 0, we effectively forget about everything in `nums` up to the current index and consider the current number as the candidate for majority element. It is not immediately obvious why we can get away with forgetting prefixes of `nums` - consider the following examples (pipes are inserted to separate runs of nonzero count).

`[7, 7, 5, 7, 5, 1 | 5, 7 | 5, 5, 7, 7 | 7, 7, 7, 7]`

Here, the `7` at index `0` is selected to be the first candidate for majority element. count will eventually reach `0` after index `5` is processed, so the `5` at index `6` will be the next candidate. In this case, `7` is the true majority element, so by disregarding this prefix, we are ignoring an equal number of majority and minority elements - therefore, `7` will still be the majority element in the suffix formed by throwing away the first prefix.

`[7, 7, 5, 7, 5, 1 | 5, 7 | 5, 5, 7, 7 | 5, 5, 5, 5]`

Now, the majority element is `5` (we changed the last run of the array from `7s` to `5s`), but our first candidate is still `7`. In this case, our candidate is not the true majority element, but we still cannot discard more majority elements than minority elements (this would imply that count could reach `-1` before we reassign candidate, which is obviously false).

Therefore, given that it is impossible (in both cases) to discard more majority elements than minority elements, we are safe in discarding the prefix and attempting to recursively solve the majority element problem for the suffix. Eventually, a suffix will be found for which count does not hit `0`, and the majority element of that suffix will necessarily be the same as the majority element of the overall array.
## 170. 
## 171. 
## 172. 
## 173. 
## 174. 
## 175. 
## 176. 
## 177. 
## 178. 
## 179. 
## 180. 
## 181. 
## 182. 
## 183. 
## 184. 
## 185. 
## 186. 
## 187. 
## 188. 
## 189. 
## 190. 
## 191. 
## 192. 
## 193. 
## 194. 
## 195. 
## 196. 
## 197. 
## 198. 
## 199. 
## 200. 
## 201. 
## 202. 
## 203. 
## 204. 
## 205. 
## 206. 
## 207. 
## 208. 
## 209. 
## 210. 
## 211. 
## 212. 
## 213. 
## 214. 
## 215. 
## 216. 
## 217. 
## 218. 
## 219. 
## 220. 
## 221. 
## 222. 
## 223. [Rectangle Area](https://leetcode.com/problems/rectangle-area/discuss/62149/Just-another-short-way)
### Intuition
Get the overlapping area and subtract from the sum of two rectangle area. Pretty intuitive.

## 224. 
## 225. 
## 226. 
## 227. 
## 228. 
## 229. 
## 230. 
## 231. 
## 232. 
## 233. 
## 234. 
## 235. 
## 236. 
## 237. 
## 238. 
## 239. 
## 240. 
## 241. 
## 242. 
## 243. 
## 244. 
## 245. 
## 246. 
## 247. 
## 248. 
## 249. 
## 250. 
## 251. 
## 252. [Meeting Rooms](https://leetcode.com/problems/meeting-rooms/description/)
### Intuition
Interval Scheduling problem. Determines if there are any overlapping intervals.
First sort the intervals in ascending order based on their start time. Then determine if there are any overlap by checking the head and tail of two adjacent intervals.

### WIL
#### Java Comparator within Sort Syntax
`Arrays./Collections.sort(array/list, new Comparator<T> () {public int compare (O o1, O o2)()});`

#### Compare to
Ascending order --> `i1 - i2`
Descending order --> `i2 - i1`
## 253. 
## 254. 
## 255. 
## 256. [Paint House](https://leetcode.com/problems/paint-house/description/)
### Intuition
Dynamic Programming. Each cell stores the minimum cost so far. Compare three at the end.
`O(N)`
## 257. 
## 258. [Add Digits](https://leetcode.com/problems/add-digits/description/)
### Intuition
The naive approach of iteration or recursion is simple yet can be slow when the number is large.
The better way with O(1) runtime is to use the idea of a digital root.
The problem, widely known as digit root problem, has a congruence formula:

https://en.wikipedia.org/wiki/Digital_root#Congruence_formula
For base b (decimal case b = 10), the digit root of an integer is:

dr(n) = 0 if n == 0
dr(n) = (b-1) if n != 0 and n % (b-1) == 0
dr(n) = n mod (b-1) if n % (b-1) != 0
or

dr(n) = 1 + (n - 1) % 9
Note here, when n = 0, since (n - 1) % 9 = -1, the return value is zero (correct).
**From Wikipedia**
The digital root (also repeated digital sum) of a non-negative integer is the (single digit) value obtained by an iterative process of summing digits, on each iteration using the result from the previous iteration to compute a digit sum. The process continues until a single-digit number is reached.

Digital roots can be used as a sort of checksum, to check that a sum has been performed correctly. If it has, then the digital root of the sum of the given numbers will equal the digital root of the sum of the digital roots of the given numbers.

## 259. 
## 260. 
## 261. 
## 262. 
## 263. [Ugly Number](https://leetcode.com/problems/ugly-number/description/)
### Intuition
Repeated divide 2, 3, 5 from the number if divisible. If we end up with 1 that means it is an ugly number.

## 264. 
## 265. 
## 266. 
## 267. 
## 268. 
## 269. 
## 270. 
## 271. 
## 272. 
## 273. 
## 274. 
## 275. 
## 276. 
## 277. 
## 278. 
## 279. 
## 280. 
## 281. 
## 282. 
## 283. 
## 284. 
## 285. 
## 286. 
## 287. 
## 288. 
## 289. 
## 290. 
## 291. 
## 292. 
## 293. 
## 294. 
## 295. 
## 296. 
## 297. 
## 298. 
## 299. 
## 300. 
## 301. 
## 302. 
## 303. 
## 304. 
## 305. 
## 306. 
## 307. 
## 308. 
## 309. 
## 310. 
## 311. 
## 312. 
## 313. 
## 314. 
## 315. 
## 316. 
## 317. 
## 318. 
## 319. 
## 320. 
## 321. 
## 322. 
## 323. 
## 324. 
## 325. 
## 326. 
## 327. 
## 328. 
## 329. 
## 330. 
## 331. 
## 332. 
## 333. 
## 334. 
## 335. 
## 336. 
## 337. 
## 338. 
## 339. 
## 340. 
## 341. 
## 342. 
## 343. 
## 344. 
## 345. 
## 346. 
## 347. 
## 348. 
## 349. 
## 350. 
## 351. 
## 352. 
## 353. 
## 354. 
## 355. 
## 356. 
## 357. 
## 358. 
## 359. 
## 360. 
## 361. 
## 362. 
## 363. 
## 364. 
## 365. 
## 366. 
## 367. 
## 368. 
## 369. 
## 370. 
## 371. 
## 372. 
## 373. 
## 374. 
## 375. 
## 376. 
## 377. 
## 378. 
## 379. 
## 380. 
## 381. 
## 382. 
## 383. 
## 384. 
## 385. 
## 386. 
## 387. 
## 388. 
## 389. 
## 390. 
## 391. 
## 392. 
## 393. 
## 394. 
## 395. 
## 396. 
## 397. 
## 398. 
## 399. 
## 400. 
## 401. 
## 402. 
## 403. 
## 404. [Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/description/)
### Intuition
I first made the mistake of counting all the left nodes, but the question is asking only for the left *leaves*. Should read the problem more carefully before start coding. Once that is cleared up the solution is easy to reach. For each node we just need to check if its left node is a leaf (two null pointers).

Always think of some actual examples before writing the code. That can easily help you avoid some silly mistakes such as misread the problem.
## 405. [Convert a Number to Hexadecimal](https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/)
### Intuition
Convert hex four bits at a time. Use `num&15` to get the last four bits and store the corresponding hex representation.

## 406. 
## 407. 
## 408. 
## 409. 
## 410. 
## 411. 
## 412. 
## 413. 
## 414. 
## 415. [Add Strings](https://leetcode.com/problems/add-strings/description/)
### Intuition
Start from the back and use a StringBuilder to keep the previous digits. Adding `carry == 1` to the conditional statement of the for loop handles the case of same length numbers with a carry digit at the most significant digit.
## 416. 
## 417. 
## 418. 
## 419. 
## 420. 
## 421. 
## 422. 
## 423. 
## 424. 
## 425. 
## 426. 
## 427. 
## 428. 
## 429. 
## 430. 
## 431. 
## 432. 
## 433. 
## 434. 
## 435. 
## 436. 
## 437. 
## 438. 
## 439. 
## 440. 
## 441. 
## 442. 
## 443. 
## 444. 
## 445. 
## 446. 
## 447. 
## 448. 
## 449. 
## 450. 
## 451. 
## 452. 
## 453. [Minimum Moves to Equal Array Elements](https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/)
### Intuition
This approach is based on the idea that adding 1 to all the elements except one is equivalent to decrementing 1 from a single element, since we are interested in the relative levels of the elements which need to be equalized. Thus, the problem is simplified to find the number of decrement operations required to equalize all the elements of the given array. For finding this, it is obvious that we'll reduce all the elements of the array to the minimum element. Think of this as an island/ocean case where the minimum element represent the sea level. We would like to know the area of the island that lies above the sea so we find the sum of all area and subtract the sea `n * min` to get the desired area.
To avoid overflow of sum, it's best to find the min first and increment the area in each iteration.

## 454. 
## 455. [Assign Cookies](https://leetcode.com/problems/assign-cookies/description/)
### Intuition
Greedy `O(NlogN)` solution. First sort the two arrays. Then start from the back, use two pointers to keep track of the position. If a child's greediness can fit in a cookies' size, then assign that cookie to that child. Otherwise that children will not receive any cookie. The somewhat tricky part was to figure out the correct index. But that could be done with some examples and checking. A forward pass that starts from the least greedy may work too.
## 456. 
## 457. 
## 458. 
## 459. 
## 460. 
## 461. [Hamming Distance](https://leetcode.com/problems/hamming-distance/description/)
### Intuition
Just use bitCount on the XOR result.
## 462. 
## 463. [Island Perimeter](https://leetcode.com/problems/island-perimeter/description/)
### Intuition
For each piece of land, we explore the connected blocks. We add one to the perimeter if it is water or out of bound.

## 464. 
## 465. 
## 466. 
## 467. 
## 468. 
## 469. 
## 470. 
## 471. 
## 472. 
## 473. 
## 474. 
## 475. 
## 476. 
## 477. 
## 478. 
## 479. 
## 480. 
## 481. 
## 482. 
## 483. 
## 484. 
## 485. 
## 486. 
## 487. 
## 488. 
## 489. 
## 490. 
## 491. 
## 492. [Construct the Rectangle](https://leetcode.com/problems/construct-the-rectangle/description/)
### Intuition
Find the square root and decrement from there. The first element that can evenly divide the number is the width.
## 493. 
## 494. 
## 495. 
## 496. 
## 497. 
## 498. 
## 499. 
## 500. 
## 501. 
## 502. 
## 503. 
## 504. [Base 7](https://leetcode.com/problems/base-7/description/)
### Intuition
Have to handle the negative case. Append the modulo and divide.

## 505. 
## 506. [Relative Ranks](https://leetcode.com/problems/relative-ranks/description/)
### Intuition
First store the orginal indices of the numbers and then sort and convert corresponding elements.

### WIL
`Arrays.sort(pair, (a, b) -> (b[0] - a[0]));`
This sorts an index array based the element comparison of the orignal array. Very smart approach using lambda.

```java
for (all indices) {
	if(index is 0){
	gold
	}else if(index is 1){
	silver
	} ...
}
```
This saves the step of checking the orignal array length.

## 507. 
## 508. 
## 509. 
## 510. 
## 511. 
## 512. 
## 513. 
## 514. 
## 515. 
## 516. 
## 517. 
## 518. 
## 519. 
## 520. 
## 521. 
## 522. 
## 523. 
## 524. 
## 525. 
## 526. 
## 527. 
## 528. 
## 529. 
## 530. 
## 531. 
## 532. 
## 533. 
## 534. 
## 535. 
## 536. 
## 537. 
## 538. 
## 539. 
## 540. 
## 541. 
## 542. 
## 543. 
## 544. 
## 545. 
## 546. 
## 547. 
## 548. 
## 549. 
## 550. 
## 551. [Student Attendance Record I](https://leetcode.com/problems/student-attendance-record-i/description/) 
### Intuition
An easy string question.
I use `indexOf` and `lastIndexOf` to check if there is more than 1 Absent. Continuous 3 L is straightforward.
Another way is to use regex matching.

## 552. 
## 553. 
## 554. 
## 555. 
## 556. 
## 557. 
## 558. 
## 559. 
## 560. 
## 561. 
## 562. 
## 563. 
## 564. 
## 565. 
## 566. 
## 567. 
## 568. 
## 569. 
## 570. 
## 571. 
## 572. 
## 573. 
## 574. 
## 575. 
## 576. 
## 577. 
## 578. 
## 579. 
## 580. 
## 581. 
## 582. 
## 583. 
## 584. 
## 585. 
## 586. 
## 587. 
## 588. 
## 589. 
## 590. 
## 591. 
## 592. 
## 593. 
## 594. [Longest Harmonious Subsequence](https://leetcode.com/problems/longest-harmonious-subsequence/description/)
### Intuition
The idea is to keep a count of all the numbers, and eventually for each of the numbers, check if there's any adjacent number. If it's present, then add the count of both - since these two numbers form subsequence in the array.
Note that the difference between max and min must be **exactly** 1.

## 595. 
## 596. 
## 597. 
## 598. 
## 599. 
## 600. 
## 601. 
## 602. 
## 603. 
## 604. 
## 605. 
## 606. [Construct String from Binary Tree](https://leetcode.com/problems/construct-string-from-binary-tree/description/)
### Intuition
Preorder tree traversal using DFS. The tricky part is finding out under which conditions do we add the parenthesis.
## 607. 
## 608. 
## 609. 
## 610. 
## 611. 
## 612. 
## 613. 
## 614. 
## 615. 
## 616. [Add Bold Tag in String](https://leetcode.com/problems/add-bold-tag-in-string/description/)
### Intuition
The same as problem 758. Use a boolean array to keep track of the bold characters.

## 617. [Merge Two Binary Tree](https://leetcode.com/problems/merge-two-binary-trees/description/)
### Intuition
Traverse through the tree. If both nodes are null, the resulting node is null. If either of them is not null, then we create a new TreeNode with the value equal to their sum. Then we use recursion to repeat the process on the children of the current node.
## 618. 
## 619. 
## 620. 
## 621. 
## 622. 
## 623. 
## 624. 
## 625. 
## 626. 
## 627. 
## 628. [Maximum Product of Three Numbers](https://leetcode.com/problems/maximum-product-of-three-numbers/description/)
### Intuition
Use sorting:
Time: O(NlogN) Space: O(logN)

One pass:
Time: O(N) Space: O(1)

Pick your poison.
## 629. 
## 630. 
## 631. 
## 632. 
## 633. 
## 634. 
## 635. 
## 636. 
## 637. 
## 638. 
## 639. 
## 640. 
## 641. 
## 642. 
## 643. 
## 644. 
## 645. 
## 646. 
## 647. 
## 648. 
## 649. 
## 650. 
## 651. 
## 652. 
## 653. 
## 654. 
## 655. 
## 656. 
## 657. [Judge Route Circle](https://leetcode.com/problems/judge-route-circle/description/)
### Intuition
Just do it by simulation.
## 658. 
## 659. 
## 660. 
## 661. [Image Smoother](https://leetcode.com/problems/image-smoother/description/)
### Intuition
I intially thought the only possible values are 0 and 1 after looking at the example. But apparently I misread the problem.
But the approach is not that different, first check inbound, then sum up. Pretty straightforward.

## 662. 
## 663. 
## 664. 
## 665. 
## 666. 
## 667. 
## 668. 
## 669. 
## 670. 
## 671. 
## 672. 
## 673. 
## 674. [Longest Continuous Increasing Subsequence](https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/)
### Intuition
Use count to keep track of the length of current increasing sequence. Reset to 1 if we encounter a non-increasing number.

## 675. 
## 676. 
## 677. 
## 678. 
## 679. 
## 680. 
## 681. 
## 682. 
## 683. 
## 684. 
## 685. 
## 686. 
## 687. 
## 688. 
## 689. 
## 690. 
## 691. 
## 692. 
## 693. 
## 694. 
## 695. 
## 696. [Count Binary Substrings](https://leetcode.com/problems/count-binary-substrings/description/)
### Intuition
Each time we encounter a different digit, we keep the length of the previous segment and increment the result for every digit forward until 1) the length of the current segment exceeds that of the previous segment. or 2) we encounter the next different digit

## 697. [Degree of an Array](https://leetcode.com/problems/degree-of-an-array/description/)
### Intuition
First I find all the modes (numbers with max degrees). Then for each mode, I find the index of their first and last occurrence in the array to get the min length of subarray for that mode.
The minimum of these lengths is the answer.
## 698. 
## 699. 
## 700. 
## 701. 
## 702. 
## 703. 
## 704. 
## 705. 
## 706. 
## 707. 
## 708. 
## 709. 
## 710. 
## 711. 
## 712. 
## 713. 
## 714. 
## 715. 
## 716. 
## 717. 
## 718. 
## 719. [Longest Word in Dictionary](https://leetcode.com/problems/longest-word-in-dictionary/description/)
### Intuition
First sort the words so that the words are ordered first by length and then by alphabetic order.
Then add all the 1-length words into a Set and all the Strings that can be built from the previous Strings in the Set. Update the result to be the word with the max length so far that is in the built Set.

Trie:
Build a trie in the normal way, then do a dfs to find the longest continuous downward path from the root. This is not a particularly hard question in the context of trie, the point of this solution is to present a generic way of trie building and inserting that can be easily adapted to similar questions.

## 720. 
## 721. 
## 722. 
## 723. 
## 724. 
## 725. 
## 726. 
## 727. 
## 728. [Self Dividing Numbers](https://leetcode.com/problems/self-dividing-numbers/description/)
### Intuition
For each number, check if every digit can divide the number without remainder.
Pretty self-explanatory problem.

## 729. 
## 730. 
## 731. 
## 732. 
## 733. [Flood Fill](https://leetcode.com/problems/flood-fill/description/)
### Intuition
DFS search similar to island parameter, connected component, island area etc.
Explore four directions.
Edge case is when the oldPixel is the same as the newColor, then we just return image, else we would run into infinite loop.
## 734. 
## 735. 
## 736. 
## 737. 
## 738. 
## 739. 
## 740. 
## 741. 
## 742. 
## 743. 
## 744. 
## 745. 
## 746. 
## 747. [Largest Number At Least Twice of Others](https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/)
### Intuition
One pass O(N).
Keep track of the largest and the second largest element. Then compare in the end.

## 748. 
## 749. 
## 750. 
## 751. 
## 752. 
## 753. 
## 754. 
## 755. 
## 756. 
## 757. 
## 758. [Bold Words in String](https://leetcode.com/problems/bold-words-in-string/description/)
### Intuition
Use a boolean array to keep track of the bold characters. Then one-pass to insert the bold tags.
## 759. 
## 760. [Find Anagram Mappings](https://leetcode.com/problems/find-anagram-mappings/description/)
### Intuition
Very straightforward using HashMap.
## 761. 
## 762. 
## 763. 
## 764. 
## 765. 
## 766. 
## 767. 
## 768. 
## 769. 
## 770. 
## 771. [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/description/)
### Intuition
Several ways to approach this problem, each with different space and time complexity.

#### String replaceAll
```
public int numJewelsInStones(String J, String S) {
    return S.replaceAll("[^" + J + "]", "").length();
}
```
Can be expensive, but a very interesting solution using regular expression.<br>
It removes all the characters that is not a jewel in the stones string. We are left with jewels and just need to find the length of the remaining string.

#### Brute force
Time: O(JS)
Space: O(J + S)
```java
    public int numJewelsInStones(String J, String S) {
        // Brute force approach
        int result = 0;
        for (char chJ : J.toCharArray())
            for (char chS : S.toCharArray())
                if (chJ == chS)
                    result++;
        return result;
    }
```

#### Store the Jewels
Time: O(J+S)
Space: O(1)
The idea is to store the jewels in an array of length 58, which is 'z' - 'A'. And check for each character in stone array if it is a jewel.<br>
A HashSet should work too.
```java
public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set setJ = new HashSet();
        for (char j: J.toCharArray()) setJ.add(j);
        for (char s: S.toCharArray()) if (setJ.contains(s)) res++;
        return res;
    }
```
## 772. 
## 773. 
## 774. 
## 775. 
## 776. 
## 777. 
## 778. 
## 779. 
## 780. 
## 781. 
## 782. 
## 783. 
## 784. 
## 785. 
## 786. 
## 787. 
## 788. 
## 789. 
## 790. 
## 791. 
## 792. 
## 793. 
## 794. 
## 795. 
## 796. [Rotate String](https://leetcode.com/problems/rotate-string/description/)
### Intuition
All rotations of `A` are contained in `B+B`. Thus, we can simply check whether `A` is a substring of `B+B`. We also need to check `A.length == B.length`, otherwise we will fail cases like `A = "a", B = "aa"`.

## 797. 
## 798. 
## 799. 
## 800. 
## 801. 
## 802. 
## 803. 
## 804. [Unique Morse Code Words](https://leetcode.com/problems/unique-morse-code-words/description/)
### Intuition
Use a HashSet to store the patterns we've seen. Check the size in the end to get the number of unique morse code words.
## 805. 
## 806. 
## 807. [Max Increase to Keep City Skyline](https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/)
### Intuition
The first loop of grid calcule maximum for every row and every col.
The second loop calculate the maximum increasing height for every building.
## 808. 
## 809. 
## 810. 
## 811. 
## 812. 
## 813. 
## 814. 
## 815. 
## 816. 
## 817. 
## 818. 
## 819. 
## 820. 
## 821. 
## 822. 
## 823. 
## 824. 
## 825. 
## 826. 
## 827. 
## 828. 
## 829. 
## 830. [Positions of Large Groups](https://leetcode.com/problems/positions-of-large-groups/discuss/128957/C++JavaPython-Straight-Forward)
### Intuition
I thought about using a char variable to store the character of the current group and use a count to keep track of the group size. Once we encounter a different character, we would update the count and at the range of the group into the result list.

The solution uses two pointers, one for tracking the start position of a group, and the other to move forward in the String until encountering a different character. This saves the step of computing the starting index but does not improve the space or time complexity.

    ### WIL
    #### How to create an ArrayList of several elements
    `Arrays.asList(e1, e2, ...)`

## 831. 
## 832. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/description/)
### Intuition
Just do in place element swapping. Use (C+1) / 2 to iterate over all indexes i in the first half of the row, inlcuding the center.

### WIL
Standard element swapping
```
int tmp = A;
A = B;
B = tmp;
```
Use XOR to flip bits
```
1^1 = 0
0^1 = 1
```
Do in place swap whenever possible for better space complexity.

## 833. 
## 834. 
## 835. 
## 836. [Rectangle Overlap](https://leetcode.com/problems/rectangle-overlap/discuss/132340/C++JavaPython-1-line-Solution-1D-to-2D)
### Intuition
By lee himself.
Before we do it in 2D plane, let's try it in 1D.
Given 2 segment `(left1, right1), (left2, right2)`, how can we check whether they overlap?
If these two intervals overlap, it should exist an number `x`,

`left1 < x < right1 && left2 < x < right2`

`left1 < x < right2 && left2 < x < right1`

`left1 < right2 && left2 < right1`

This is the sufficient and necessary condition for two segments overlap.

Explanation:
For 2D, if two rectangle overlap both on x and y, they overlap in the plane.

Time Complexity:
O(1)

## 837. 
## 838. 
## 839. 
## 840. 
## 841. 
## 842. 
## 843. 
## 844. [Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/description/)
### Intuition
We could do it with O(N) space using string comparison and StringBuilder.
We could also do it backward, skipping a character when encounter a `'#'`. What is worth noting is how to deal with consecutive `'#'s`. We use a variable to keep the number of `'#'` encountered starting at the current index and skip indices based on the count until we reach a lowercase letter that is not `#` and the skip count is zero.Backspace String Compare
## 845. 
## 846. 
## 847. 
## 848. 
## 849. 
## 850. 
## 851. 
## 852. [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/description/)
### Intuition
Binary Search
## 853. 
## 854. 
## 855. 
## 856. 
## 857. 
## 858. 
## 859. 
## 860. [Lemonade Change](https://leetcode.com/problems/lemonade-change/description/)
### Intuition
Keep track of the change (5 and 10 dollar bills). Subtract the number of change when encountered a bill with 10 or 20. Greedy solution in the sense that we would prefer to give out a $10 change first when receiving a bill of 20.

## 861. 
## 862. 
## 863. 
## 864. 
## 865. 
## 866. 
## 867. 
## 868. 
## 869. 
## 870. 
## 871. 
## 872. 
## 873. 
## 874. 
## 875. 
## 876. 
## 877. 
## 878. 
## 879. 
## 880. 
## 881. 
## 882. 
## 883. 
## 884. 
## 885. 
## 886. 
## 887. 
## 888. 
## 889. 
## 890. 
## 891. 
## 892. 
## 893. 
## 894. 
## 895. 
## 896. 
## 897. 
## 898. 
## 899. 

