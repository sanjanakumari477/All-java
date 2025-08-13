 How does Garbage Collection work in Java?
Answer:

JVM’s Garbage Collector (GC) automatically frees memory of unreachable objects.

Common algorithms: Mark and Sweep, Copying, Generational GC.

You can request GC via System.gc(), but it’s not guaranteed.

Tuning GC is possible with JVM options (e.g., -Xms, -Xmx, -XX:+UseG1GC).
