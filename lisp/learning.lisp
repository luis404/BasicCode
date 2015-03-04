(defun hi (name)
  (format t "Helox ~A~%" name))

(defun lxsub (a b)
  (format t "~A-~A=~A~%" a b (- a b)))

(defun lxread (str)
  (format t "~A:" str)
  (read))

(defun lxswitch (a b)
  (format t "a=~A, b=~A~%" a b)
  (let ((c a))
    (setf a b
	  b c))
  (format t "a=~A, b=~A~%" a b))

(defun lxremovechr (a b)
  (remove a b))


(defun _lxsquare (a)
  (* a a))

(defun lxsquare (start end)
  (do ((i start (+ i 1)))
      ((> i end) 'done)
    (format t "~AZ: ~A ~%" i (_lxsquare i))))

(defun lxsqrAB (a b)
  (+ (_lxsquare a) (_lxsquare b)))

