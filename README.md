Kafka Project
This project demonstrates the implementation of a Kafka-based system with capabilities for Publish-Subscribe Messaging, Fault Tolerance, Scalability, and Streaming Analytics.

Features
Publish-Subscribe Messaging: Utilizes Kafka topics for asynchronous message passing.
Fault Tolerance: Ensures reliability through Kafka's replication and fault recovery mechanisms.
Scalability: Scales horizontally by adding more Kafka brokers and partitioning topics.
Streaming Analytics: Processes real-time data using Kafka Streams for analytics and transformations.

Requirements
Java Development Kit (JDK) 8 or higher
Apache Kafka (version X.X.X)
Other dependencies (if any)

Usefull commands
    1) Start Zookeeper
  
  cmd>cd C:\kafka_2.12-2.6.0 cmd> .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
  
  2)Start Kafka setup
 
  cmd> cd C:\kafka_2.12-2.6.0 cmd> .\bin\windows\kafka-server-start.bat .\config\server.properties 
  
  3) Create a Topic
  
  cmd>.\bin\windows\kafka-topics.bat --create --topic kafka-topic --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3
  
  4)List Topics
  
  cmd>.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

