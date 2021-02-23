#!/bin/sh

export WAYLAND_DISPLAY=wayland-0
export DISPLAY=:0
QT_QPA_PLATFORM=xcb

cd /home/root/
exec /home/root/cluster_v1
