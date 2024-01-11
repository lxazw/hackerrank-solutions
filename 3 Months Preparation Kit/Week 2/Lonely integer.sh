# I'm close to you. Look around you carefully.

tail -n 1 | awk '{split($0, r, " "); t=0; for (i in r) t=xor(t, r[i]); print t;}'
