
(defun lxadd2()
  (format t "Please input x:")
  (let ((x (read)))
    (format t "x is ~A.~%" x)
    (format t "Please input y:")
    (let ((y (read)))
      (format t "y is ~A.~%" y)
      (format t "x+y is ~A.~%" (+ x y)))))

(defun lx-show-square (start end)
  (do ((i start (+ i 1)))
      ((> i end) 'done)
    (format t "~A --> ~A ~%" i (* i i))))
