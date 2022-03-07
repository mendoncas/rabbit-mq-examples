# Simple logger example
based on [this tutorial](https://www.rabbitmq.com/tutorials/tutorial-three-java.html)
A simple producer process generates logs and shares them with every receiver process via a fanout exchange

# Producer
Will send a log string to an exchange called "logs".
This exchange is defined as a "fanout" type. A fanout exchange will broadcast its messages to every queue subscribed to it.

# Receiver