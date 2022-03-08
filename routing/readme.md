# Logger with routing
based on [this tutorial](https://www.rabbitmq.com/tutorials/tutorial-four-java.html)
A producer process generates logs and shares them with receiver processes via multiple direct-type exchanges

# Producer
Emits logs with different routing keys

# Receiver
Receives only logs with its specified binding keys

More than one binding per receiver can be declared