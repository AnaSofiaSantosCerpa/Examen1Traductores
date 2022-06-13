KC=		kotlinc
KFLAG=		-cp
LIB=	lib/operaciones

all:	\
	$(LIB)/Cuaternion.class\
	ModuloKt.class\

$(LIB)/Cuaternion.class: $(LIB)/Cuaternion.kt
	$(KC) $(KFLAG) $(LIB): $(LIB)/Cuaternion.kt


ModuloKt.class: Modulo.kt 
	$(KC) $(KFLAG) .:$(LIB) Modulo.kt
	
clean:
	rm -rf *.class $(LIB)/*.class $(LIB)/META-INF 