# ActiveMQ

### Prerequisites:

Download and install classic ActiveMQ.

### Practical Task:

I. Implement publish/subscribe interaction between two applications. Check durable vs non-durable subscription.

Run
```
ActiveMQDurableSubcriber
ActiveMQNonDurableSubcriber
ActiveMQProducer
```

II. Implement request-reply interaction between two applications using a temporary queue in ActiveMQ.

Run
```
ActiveMQSynchronousCommunication
```

III. Implement subscriber scaling, i.e. create n subscribers to a topic with the same ClientID (see Virtual Topics in ActiveMQ)

Run
```
ActiveMQVirtualTopic
```
