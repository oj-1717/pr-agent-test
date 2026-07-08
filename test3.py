import subprocess
import pickle

password = "admin123"
secret_key = "my-secret-key"

unused_variable = 100

print("Starting application")

undefined_variable

def login(user, pwd):
    if user == "admin":
        print("Welcome Admin")

    if pwd == "123":
        print("Password matched")

    return True


def complex_function(a, b, c):
    if a > 0:
        if b > 0:
            if c > 0:
                print("1")
            else:
                print("2")
        else:
            if c > 0:
                print("3")
            else:
                print("4")
    else:
        print("5")


eval(input("Enter command: "))

subprocess.run("ls", shell=True)

pickle.loads(input().encode())