inherit swupdate

LICENSE = "MIT"

# IMAGE_DEPENDS: list of Yocto images that contains a root filesystem
# it will be ensured they are built before creating swupdate image
IMAGE_DEPENDS = "fsl-image-qt5"

# SWUPDATE_IMAGES: list of images that will be part of the compound image
# the list can have any binaries - images must be in the DEPLOY directory
SWUPDATE_IMAGES = "fsl-image-qt5"

# Images can have multiple formats - define which image must be
# taken to be put in the compound image
SWUPDATE_IMAGES_FSTYPES[var-image-swupdate] = ".tar.gz"
