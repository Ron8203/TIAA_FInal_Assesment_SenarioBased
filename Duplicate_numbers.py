
arr = [11,44,99,66,11,55,44,66,88,100]

duplicate_numbers = []
for num in arr:
    if arr.count(num) > 1 and num not in duplicate_numbers:
        duplicate_numbers.append(num)

# Print the result
print("Original array ", arr)
print("Duplicate numbers ", duplicate_numbers)





