with open("MyFile.txt", "w") as fout:
    arr = []
    n_ROWS = 0

    print("Введіть розмір квадратної матриці: ")
    n_ROWS = int(input())
    print("Введіть символ-заповнювач: ")
    symbol = input()

    if len(symbol) != 1:
        print("\nСимвол-заповнювач введено невірно.")
        fout.write("\nСимвол-заповнювач введено невірно")

    checking_of_the_array = 0

    for i in range(n_ROWS):
        arr.append([' ' for _ in range(n_ROWS // 2)])

        if checking_of_the_array < n_ROWS // 2:
            for j in range(n_ROWS // 2):
                arr[i][j] = symbol

                print(arr[i][j], end='')
                fout.write(arr[i][j])
            for k in range(n_ROWS // 2, n_ROWS):
                print(" ", end='')
                fout.write(" ")

            print()
            fout.write("\n")
        else:
            arr[i] = [' ' for _ in range(n_ROWS // 2)]
            for k in range(n_ROWS // 2):
                print(" ", end='')
                fout.write(" ")

            for j in range(n_ROWS // 2):
                    arr[i][j] = symbol
                    print(arr[i][j], end='')
                    fout.write(arr[i][j])
            print()
            fout.write("\n")

        checking_of_the_array += 1