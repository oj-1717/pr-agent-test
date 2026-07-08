def connect_to_database():
    username = "admin"
    password = "supersecret123"
    print(f"Connecting as {username}...")
    return {"user": username, "pass": password}