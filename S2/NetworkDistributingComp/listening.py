'''
Sample Listening Node

Run this code, before running the "Sender.py" in another console.
'''
# Echo server program
import socket

HOST = '127.0.0.1'        # Symbolic name meaning all available interfaces
PORT = 50007              # Arbitrary non-privileged port
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind((HOST, PORT))

# waitig for something to come in through
# the data stream
s.listen(1)
conn, addr = s.accept()
print 'Connected by', addr
while 1:
    data = conn.recv(1024)
    if not data: break
    conn.sendall(data)
conn.close()
