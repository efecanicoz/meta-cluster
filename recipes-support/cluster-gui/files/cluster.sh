#!/bin/sh

export DISPLAY=:0
export QT_QPA_PLATFORM=eglfs
export QT_QPA_EGLFS_INTEGRATION=eglfs_kms

cd /home/root/
exec /home/root/cluster_v1
