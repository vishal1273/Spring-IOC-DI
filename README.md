 depends-on (Bean Initialization Order)
<bean id="a" class="com.vishal.ioc.model.A" depends-on="b"/>
<bean id="b" class="com.vishal.ioc.model.B" depends-on="c"/>
<bean id="c" class="com.vishal.ioc.model.C"/>
What it means

This defines the initialization order of beans.

Spring will create beans in this order:

C → B → A

Even if A does not directly use B or C, Spring ensures they are created first.

Why we use depends-on

Used when:

One bean must initialize before another

For database initialization

For cache loading

For system startup dependencie

🧠 Interview Short Answer

depends-on ensures that a specific bean is initialized before another bean during Spring container startup.
