// I'm close to you. Look around you carefully.

letters = []
s = set(list(input().lower()))

for i in range(97, 122):
    letters.append(i)

for i, element in enumerate(s):
    if ord(element) in letters:
        letters.remove(ord(element))

if len(letters) > 0:
    print("not", end=" ")

print("pangram")
