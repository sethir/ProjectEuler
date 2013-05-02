#Find the sum of all multiples of 3 or 5 below 1000
#Tim Skew 2013-04-28

total_sum = 0

for i in range(1000):
	if i % 3 == 0 or i % 5 == 0:
		total_sum += i

print (total_sum)
