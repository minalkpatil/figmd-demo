
LIBNAME=mathlib

SRC = $(wildcard *.c)               
OBJS = $(patsubst %.c, %.o, $(SRC)) 

.PHONY:clean all

all: libs

clean:
	rm -f *.o rm $(LIBNAME).a

libs: clean objs 
	ar -rc $(LIBNAME).a $(OBJS)	

objs : $(OBJS)                      


