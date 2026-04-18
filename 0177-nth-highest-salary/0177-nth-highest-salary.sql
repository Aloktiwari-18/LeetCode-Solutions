CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
    WITH ranked AS (
        SELECT salary,
               DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
        FROM Employee
    )
    SELECT DISTINCT salary
    FROM ranked
    WHERE rnk = N
  );
END