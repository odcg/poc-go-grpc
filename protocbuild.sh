PROTOC_PATH=third\bin\
DST_DIR=src\main\generated
SRC_DIR=src\main\proto\Prime.proto
$PROTOC_PATH\protoc.exe -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/Prime.proto
