KC=		kotlinc
KFLAG=		-cp
LIB=	lib/programas

all:	\
	$(LIB)/Programa.class\
	$(LIB)/Interprete.class\
	$(LIB)/Traductor.class\
	$(LIB)/Execute.class\
	DiagramasTKt.class\
		
$(LIB)/Programa.class: $(LIB)/Programa.kt
	$(KC) $(KFLAG) $(LIB): $(LIB)/Programa.kt

$(LIB)/Interprete.class: $(LIB)/Interprete.kt
	$(KC) $(KFLAG) $(LIB): $(LIB)/Interprete.kt

$(LIB)/Traductor.class: $(LIB)/Traductor.kt
	$(KC) $(KFLAG) $(LIB): $(LIB)/Traductor.kt

$(LIB)/Execute.class: $(LIB)/Execute.kt
	$(KC) $(KFLAG) $(LIB): $(LIB)/Execute.kt

DiagramasTKt.class: DiagramasT.kt 
	$(KC) $(KFLAG) .:$(LIB) DiagramasT.kt
	
clean:
	rm -rf *.class $(LIB)/*.class $(LIB)/META-INF 