# Work Queue example
based on [this tutorial](https://www.rabbitmq.com/tutorials/tutorial-two-java.html)
processes added to the queue will be taken by one worker and removed from the queue, following a round-robin fashion

# Producer
will send a sequence of dots to the queue

# Receiver
will read the sequence and, for each dot, wait for a second before finishing its task