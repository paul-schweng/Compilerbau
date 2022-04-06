main :: IO ()
main = putStrLn "Hello, World!"

data Expr = PlusExpr Expr Expr | MinusExpr Expr Expr | MultExpr Expr Expr | DivExpr Expr Expr | Literal Double


eval :: Expr -> Double
eval (Literal x) = x
eval (PlusExpr a b) = (eval a) + (eval b)
eval (MinusExpr a b) = (eval a) - (eval b)
eval (MultExpr a b) = (eval a) * (eval b)

eval (DivExpr a b) = (eval a) / (eval b)
