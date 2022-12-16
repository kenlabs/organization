# 面试题

1. （leetcode 951 数据结构与算法 中等难度）For a binary tree **T**, we can define a **flip operation** as follows: choose any node, and swap the left and right child subtrees.

   A binary tree **X** is *flip equivalent* to a binary tree **Y** if and only if we can make **X** equal to **Y** after some number of flip operations.

   Given the roots of two binary trees `root1` and `root2`, return `true` if the two trees are flip equivalent or `false` otherwise.

    

   **Example 1:**

   ![Flipped Trees Diagram](questions.assets/tree_ex.png)

   ```
   Input: root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
   Output: true
   Explanation: We flipped at nodes with values 1, 3, and 5.
   ```

**Example 2:**

```
Input: root1 = [], root2 = []
Output: true
```

**Example 3:**

```
Input: root1 = [], root2 = [1]
Output: false
```

 

**Constraints:**

- The number of nodes in each tree is in the range `[0, 100]`.
- Each tree will have **unique node values** in the range `[0, 99]`.



2. （leetcode 208 数据结构与算法 中等难度）Given an integer array `nums` where the elements are sorted in **ascending order**, convert *it to a **height-balanced** binary search tree*.

   A **height-balanced** binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

    

   **Example 1:**

   ![img](questions.assets/btree1.jpg)

   ```
   Input: nums = [-10,-3,0,5,9]
   Output: [0,-3,9,-10,null,5]
   Explanation: [0,-10,5,null,-3,null,9] is also accepted:
   ```

   **Example 2:**

   ![img](questions.assets/btree.jpg)

   ```
   Input: nums = [1,3]
   Output: [3,1]
   Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
   ```

    

   **Constraints:**

   - `1 <= nums.length <= 104`
   - `-104 <= nums[i] <= 104`
   - `nums` is sorted in a **strictly increasing** order.



3. （leetcode 617 数据结构与算法 简单难度）You are given two binary trees `root1` and `root2`.

   Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.

   Return *the merged tree*.

   **Note:** The merging process must start from the root nodes of both trees.

    

   **Example 1:**

   ![img](questions.assets/merge.jpg)

   ```
   Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
   Output: [3,4,5,5,4,null,7]
   ```

   **Example 2:**

   ```
   Input: root1 = [1], root2 = [1,2]
   Output: [2,2]
   ```

    

   **Constraints:**

   - The number of nodes in both trees is in the range `[0, 2000]`.
   - `-104 <= Node.val <= 104`



4. (leetcode 146 数据结构与算法 中等难度) Design a data structure that follows the constraints of a **[Least Recently Used (LRU) cache](https://en.wikipedia.org/wiki/Cache_replacement_policies#LRU)**.

   Implement the `LRUCache` class:

   - `LRUCache(int capacity)` Initialize the LRU cache with **positive** size `capacity`.
   - `int get(int key)` Return the value of the `key` if the key exists, otherwise return `-1`.
   - `void put(int key, int value)` Update the value of the `key` if the `key` exists. Otherwise, add the `key-value` pair to the cache. If the number of keys exceeds the `capacity` from this operation, **evict** the least recently used key.

   The functions `get` and `put` must each run in `O(1)` average time complexity.

    

   **Example 1:**

   ```
   Input
   ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
   [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
   Output
   [null, null, null, 1, null, -1, null, -1, 3, 4]
   
   Explanation
   LRUCache lRUCache = new LRUCache(2);
   lRUCache.put(1, 1); // cache is {1=1}
   lRUCache.put(2, 2); // cache is {1=1, 2=2}
   lRUCache.get(1);    // return 1
   lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
   lRUCache.get(2);    // returns -1 (not found)
   lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
   lRUCache.get(1);    // return -1 (not found)
   lRUCache.get(3);    // return 3
   lRUCache.get(4);    // return 4
   ```

    

   **Constraints:**

   - `1 <= capacity <= 3000`
   - `0 <= key <= 104`
   - `0 <= value <= 105`
   - At most `2 * 105` calls will be made to `get` and `put`.



5. (leetcode 29 计算机系统 中等难度) Given two integers `dividend` and `divisor`, divide two integers **without** using multiplication, division, and mod operator.

   The integer division should truncate toward zero, which means losing its fractional part. For example, `8.345` would be truncated to `8`, and `-2.7335` would be truncated to `-2`.

   Return *the **quotient** after dividing* `dividend` *by* `divisor`.

   **Note:** Assume we are dealing with an environment that could only store integers within the **32-bit** signed integer range: `[−231, 231 − 1]`. For this problem, if the quotient is **strictly greater than** `231 - 1`, then return `231 - 1`, and if the quotient is **strictly less than** `-231`, then return `-231`.

    

   **Example 1:**

   ```
   Input: dividend = 10, divisor = 3
   Output: 3
   Explanation: 10/3 = 3.33333.. which is truncated to 3.
   ```

   **Example 2:**

   ```
   Input: dividend = 7, divisor = -3
   Output: -2
   Explanation: 7/-3 = -2.33333.. which is truncated to -2.
   ```

    

   **Constraints:**

   - `-231 <= dividend, divisor <= 231 - 1`
   - `divisor != 0`



6. （leetcode 196 数据库 简单难度）

   Schema: 

   ```sql
   Create table If Not Exists Person (Id int, Email varchar(255))
   Truncate table Person
   insert into Person (id, email) values ('1', 'john@example.com')
   insert into Person (id, email) values ('2', 'bob@example.com')
   insert into Person (id, email) values ('3', 'john@example.com')
   ```

   

   Table: `Person`

   ```
   +-------------+---------+
   | Column Name | Type    |
   +-------------+---------+
   | id          | int     |
   | email       | varchar |
   +-------------+---------+
   id is the primary key column for this table.
   Each row of this table contains an email. The emails will not contain uppercase letters.
   ```

    

   Write an SQL query to **delete** all the duplicate emails, keeping only one unique email with the smallest `id`. Note that you are supposed to write a `DELETE` statement and not a `SELECT` one.

   After running your script, the answer shown is the `Person` table. The driver will first compile and run your piece of code and then show the `Person` table. The final order of the `Person` table **does not matter**.

   The query result format is in the following example.

    

   **Example 1:**

   ```
   Input: 
   Person table:
   +----+------------------+
   | id | email            |
   +----+------------------+
   | 1  | john@example.com |
   | 2  | bob@example.com  |
   | 3  | john@example.com |
   +----+------------------+
   Output: 
   +----+------------------+
   | id | email            |
   +----+------------------+
   | 1  | john@example.com |
   | 2  | bob@example.com  |
   +----+------------------+
   Explanation: john@example.com is repeated two times. We keep the row with the smallest Id = 1.
   ```



7. (leetcode 184 数据库 中等难度) 

   Schema: 

   ```sql
   Create table If Not Exists Employee (id int, name varchar(255), salary int, departmentId int)
   Create table If Not Exists Department (id int, name varchar(255))
   Truncate table Employee
   insert into Employee (id, name, salary, departmentId) values ('1', 'Joe', '70000', '1')
   insert into Employee (id, name, salary, departmentId) values ('2', 'Jim', '90000', '1')
   insert into Employee (id, name, salary, departmentId) values ('3', 'Henry', '80000', '2')
   insert into Employee (id, name, salary, departmentId) values ('4', 'Sam', '60000', '2')
   insert into Employee (id, name, salary, departmentId) values ('5', 'Max', '90000', '1')
   Truncate table Department
   insert into Department (id, name) values ('1', 'IT')
   insert into Department (id, name) values ('2', 'Sales')
   ```

   

   Table: `Employee`

   ```
   +--------------+---------+
   | Column Name  | Type    |
   +--------------+---------+
   | id           | int     |
   | name         | varchar |
   | salary       | int     |
   | departmentId | int     |
   +--------------+---------+
   id is the primary key column for this table.
   departmentId is a foreign key of the ID from the Department table.
   Each row of this table indicates the ID, name, and salary of an employee. It also contains the ID of their department.
   ```

    

   Table: `Department`

   ```
   +-------------+---------+
   | Column Name | Type    |
   +-------------+---------+
   | id          | int     |
   | name        | varchar |
   +-------------+---------+
   id is the primary key column for this table.
   Each row of this table indicates the ID of a department and its name.
   ```

    

   Write an SQL query to find employees who have the highest salary in each of the departments.

   Return the result table in **any order**.

   The query result format is in the following example.

    

   **Example 1:**

   ```
   Input: 
   Employee table:
   +----+-------+--------+--------------+
   | id | name  | salary | departmentId |
   +----+-------+--------+--------------+
   | 1  | Joe   | 70000  | 1            |
   | 2  | Jim   | 90000  | 1            |
   | 3  | Henry | 80000  | 2            |
   | 4  | Sam   | 60000  | 2            |
   | 5  | Max   | 90000  | 1            |
   +----+-------+--------+--------------+
   Department table:
   +----+-------+
   | id | name  |
   +----+-------+
   | 1  | IT    |
   | 2  | Sales |
   +----+-------+
   Output: 
   +------------+----------+--------+
   | Department | Employee | Salary |
   +------------+----------+--------+
   | IT         | Jim      | 90000  |
   | Sales      | Henry    | 80000  |
   | IT         | Max      | 90000  |
   +------------+----------+--------+
   Explanation: Max and Jim both have the highest salary in the IT department and Henry has the highest salary in the Sales department.
   ```



8. （leetcode 607 数据库 简单难度 ）

   Schema:

   ```sql
   Create table If Not Exists SalesPerson (sales_id int, name varchar(255), salary int, commission_rate int, hire_date date)
   Create table If Not Exists Company (com_id int, name varchar(255), city varchar(255))
   Create table If Not Exists Orders (order_id int, order_date date, com_id int, sales_id int, amount int)
   Truncate table SalesPerson
   insert into SalesPerson (sales_id, name, salary, commission_rate, hire_date) values ('1', 'John', '100000', '6', '4/1/2006')
   insert into SalesPerson (sales_id, name, salary, commission_rate, hire_date) values ('2', 'Amy', '12000', '5', '5/1/2010')
   insert into SalesPerson (sales_id, name, salary, commission_rate, hire_date) values ('3', 'Mark', '65000', '12', '12/25/2008')
   insert into SalesPerson (sales_id, name, salary, commission_rate, hire_date) values ('4', 'Pam', '25000', '25', '1/1/2005')
   insert into SalesPerson (sales_id, name, salary, commission_rate, hire_date) values ('5', 'Alex', '5000', '10', '2/3/2007')
   Truncate table Company
   insert into Company (com_id, name, city) values ('1', 'RED', 'Boston')
   insert into Company (com_id, name, city) values ('2', 'ORANGE', 'New York')
   insert into Company (com_id, name, city) values ('3', 'YELLOW', 'Boston')
   insert into Company (com_id, name, city) values ('4', 'GREEN', 'Austin')
   Truncate table Orders
   insert into Orders (order_id, order_date, com_id, sales_id, amount) values ('1', '1/1/2014', '3', '4', '10000')
   insert into Orders (order_id, order_date, com_id, sales_id, amount) values ('2', '2/1/2014', '4', '5', '5000')
   insert into Orders (order_id, order_date, com_id, sales_id, amount) values ('3', '3/1/2014', '1', '1', '50000')
   insert into Orders (order_id, order_date, com_id, sales_id, amount) values ('4', '4/1/2014', '1', '4', '25000')
   ```

   

   Table: `SalesPerson`

   ```
   +-----------------+---------+
   | Column Name     | Type    |
   +-----------------+---------+
   | sales_id        | int     |
   | name            | varchar |
   | salary          | int     |
   | commission_rate | int     |
   | hire_date       | date    |
   +-----------------+---------+
   sales_id is the primary key column for this table.
   Each row of this table indicates the name and the ID of a salesperson alongside their salary, commission rate, and hire date.
   ```

    

   Table: `Company`

   ```
   +-------------+---------+
   | Column Name | Type    |
   +-------------+---------+
   | com_id      | int     |
   | name        | varchar |
   | city        | varchar |
   +-------------+---------+
   com_id is the primary key column for this table.
   Each row of this table indicates the name and the ID of a company and the city in which the company is located.
   ```

    

   Table: `Orders`

   ```
   +-------------+------+
   | Column Name | Type |
   +-------------+------+
   | order_id    | int  |
   | order_date  | date |
   | com_id      | int  |
   | sales_id    | int  |
   | amount      | int  |
   +-------------+------+
   order_id is the primary key column for this table.
   com_id is a foreign key to com_id from the Company table.
   sales_id is a foreign key to sales_id from the SalesPerson table.
   Each row of this table contains information about one order. This includes the ID of the company, the ID of the salesperson, the date of the order, and the amount paid.
   ```

    

   Write an SQL query to report the names of all the salespersons who did not have any orders related to the company with the name **"RED"**.

   Return the result table in **any order**.

   The query result format is in the following example.

    

   **Example 1:**

   ```
   Input: 
   SalesPerson table:
   +----------+------+--------+-----------------+------------+
   | sales_id | name | salary | commission_rate | hire_date  |
   +----------+------+--------+-----------------+------------+
   | 1        | John | 100000 | 6               | 4/1/2006   |
   | 2        | Amy  | 12000  | 5               | 5/1/2010   |
   | 3        | Mark | 65000  | 12              | 12/25/2008 |
   | 4        | Pam  | 25000  | 25              | 1/1/2005   |
   | 5        | Alex | 5000   | 10              | 2/3/2007   |
   +----------+------+--------+-----------------+------------+
   Company table:
   +--------+--------+----------+
   | com_id | name   | city     |
   +--------+--------+----------+
   | 1      | RED    | Boston   |
   | 2      | ORANGE | New York |
   | 3      | YELLOW | Boston   |
   | 4      | GREEN  | Austin   |
   +--------+--------+----------+
   Orders table:
   +----------+------------+--------+----------+--------+
   | order_id | order_date | com_id | sales_id | amount |
   +----------+------------+--------+----------+--------+
   | 1        | 1/1/2014   | 3      | 4        | 10000  |
   | 2        | 2/1/2014   | 4      | 5        | 5000   |
   | 3        | 3/1/2014   | 1      | 1        | 50000  |
   | 4        | 4/1/2014   | 1      | 4        | 25000  |
   +----------+------------+--------+----------+--------+
   Output: 
   +------+
   | name |
   +------+
   | Amy  |
   | Mark |
   | Alex |
   +------+
   Explanation: 
   According to orders 3 and 4 in the Orders table, it is easy to tell that only salesperson John and Pam have sales to company RED, so we report all the other names in the table salesperson.
   ```