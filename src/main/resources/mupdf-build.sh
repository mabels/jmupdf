#!/bin/sh -x

BASEDIR=$1
TARGET=$1/target/cpp
ARCH=$2
if [ ! -f $TARGET/mupdf-build ]
then
  rm -rf $TARGET
  mkdir -p $TARGET
  cp -pr $BASEDIR/src/main/cpp/ $TARGET/
  rm -rf $TARGET/../classes/mupdf/$ARCH
  mkdir -p $TARGET/../classes/mupdf/$ARCH
  cd $TARGET && make && \
    cp $TARGET/build/libjmupdf64.jnilib $TARGET/../classes/mupdf/$ARCH/ && \
    touch $TARGET/mupdf-build
fi
