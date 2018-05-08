hackerrank.store(543121, 100)
hackerrank.keep_if {|key| key.is_a? Integer}
hackerrank.delete_if {|key| (key & 1) == 0}
