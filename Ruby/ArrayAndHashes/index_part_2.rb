def neg_pos(arr, index)
  arr[-index]
end

def first_element(arr)
  arr.first
end

def last_element(arr)
  arr.last
end

def first_n(arr, n)
    # return the first n elements of the array
  arr.take(n)
end

def drop_n(arr, n)
    # drop the first n elements of the array and return the rest
  arr.drop(n)
end
