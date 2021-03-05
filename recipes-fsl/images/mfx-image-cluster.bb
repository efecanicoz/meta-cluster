SUMMARY = "Mesaflix Cluster Image"
DESCRIPTION = "This is customized image containing cluster app and its configurations"
 
LICENSE = "MIT"
 
inherit core-image
 
#start of the resulting deployable tarball name
export IMAGE_BASENAME = "mfx-image-cluster"
MACHINE_NAME ?= "${MACHINE}"
IMAGE_NAME = "${MACHINE_NAME}_${IMAGE_BASENAME}"
 
SYSTEMD_DEFAULT_TARGET = "graphical.target"
 
IMAGE_LINGUAS = "en-us"
 
ROOTFS_PKGMANAGE_PKGS ?= '${@oe.utils.conditional("ONLINE_PACKAGE_MANAGEMENT", "none", "", "${ROOTFS_PKGMANAGE}", d)}'
 
IMAGE_INSTALL_append = " \
    packagegroup-boot \
    packagegroup-basic \
    udev-extra-rules \
    ${ROOTFS_PKGMANAGE_PKGS} \
	ssh-files cluster-gui \
	swupdate swupdate-www \
	qtserialbus qtwayland \
	psplash \
"
 
IMAGE_DEV_MANAGER   = "udev"
IMAGE_INIT_MANAGER  = "systemd"
IMAGE_INITSCRIPTS   = " "
IMAGE_LOGIN_MANAGER = "busybox shadow"
