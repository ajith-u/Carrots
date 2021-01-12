n,p=gets.chomp.split.map(&:to_i)
if(n.between?(1,1000) and p.between?(1,1000))
  n.times { gets.chomp }
  puts p
end