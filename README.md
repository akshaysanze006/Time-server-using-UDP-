# Time-server-using-UDP-

The server program is a simple UDP server that waits for the datagram from clients. When it  receives a datagram containing the text " Request for Current Time from server ", it returns the  current server's time to the client. 


Algorithm 
• Server 
1). Create datagram socket 
2). Listen to a port 
3). Create empty byte array 
4). While (true) 
5). Create a datagram packet 
6). Get message from client 
7). Write the time to byte array 
8). Attach packet with byte array 
9). Send packet 
10) End While 
11). Stop 
• Client 
1).Create datagram socket 
2). While (true) 
 3). Create a request for current time  
 4). Convert string to byte 
 5). Create a packet with destination IP, Port address 
 6). Attach packet with byte array 
 7) Send packet 
8) End while 
9). Stop
