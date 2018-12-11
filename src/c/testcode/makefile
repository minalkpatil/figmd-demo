
EXE=mathLibTest

SRC = $(wildcard *.c)
OBJS = $(patsubst %.c, %.o, $(SRC))

INC = -I../
LIBS=../mathlib/mathlib.a

all:clean objs
	cc -o $(EXE) $(OBJS) $(LIBS)

clean:
	rm -f $(EXE) *.o

objs:$(OBJS)

.c.o:
	cc $(INC) -c $< -o $@
