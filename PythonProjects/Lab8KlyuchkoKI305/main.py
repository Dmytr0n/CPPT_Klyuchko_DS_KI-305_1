import struct
import sys
import math
import os
def write_bin(result):
    with open('MyFile.bin', 'wb') as f:
        f.write(struct.pack('f', result))
        f.close()
def read_bin():
    result = 0.0
    try:
       if os.path.exists('MyFile.bin'):
         with open('MyFile.bin', 'rb') as f:
          result = struct.unpack('f', f.read())[0]
          f.close()
       else:
         raise FileNotFoundError(f"File {'MyFile.bin'} not found.")
    except FileNotFoundError as e:
       print(e)
    return result
def write_txt(result):
    with open('MyFile.txt', 'w') as f:
     f.write(str(result))
     f.close()
def read_txt():
    result = 0.0
    try:
        if os.path.exists('MyFile.txt'):
          with open('MyFile.txt', 'r') as f:
            result = f.read()
            f.close()
        else:
           raise FileNotFoundError(f"File {'MyFile.txt'} not found.")
    except FileNotFoundError as e:
           print(e)
    return result
def my_calc (x):
    rad = x * math.pi / 180
    y = math.sin(rad) / math.tan(4*rad)
    return y

if __name__ == "__main__":
    x = int(input("Введіть значення x:"))
    result = my_calc(x)
    try:
        writetxt = write_txt(result)
        readtxt =read_txt()
        print(readtxt)
        writebin = write_bin(result)
        readbin =read_bin()
        print(readbin)
    except FileNotFoundError as e:
        print(e)
        sys.exit(1)