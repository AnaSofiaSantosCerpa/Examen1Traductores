KC=		kotlinc
KFLAG=		-cp
LIB=	lib/calculos

all:	\
	$(LIB)/Bell.class\
	$(LIB)/Fibonacci.class\
	RetoKt.class\
		
$(LIB)/Bell.class: $(LIB)/Bell.kt
	$(KC) $(KFLAG) $(LIB): $(LIB)/Bell.kt

$(LIB)/Fibonacci.class: $(LIB)/Fibonacci.kt
	$(KC) $(KFLAG) $(LIB): $(LIB)/Fibonacci.kt


RetoKt.class: Reto.kt 
	$(KC) $(KFLAG) .:$(LIB) Reto.kt
	
clean:
	rm -rf *.class $(LIB)/*.class $(LIB)/META-INF 