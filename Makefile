JFLAGS = -g
JAVAC = javac

.PHONY: clean default

JAVA_SRCS = src/AppMain.java \
	src/ArrayTest.java

CLASSES = $(JAVA_SRCS:.java=.class)

$(CLASSES): $(JAVA_SRCS)
	$(JAVAC) $(JFLAGS) $(JAVA_SRCS)

default: $(CLASSES)


clean:
	@find ./src/ -name *.class|xargs rm -f
