
# IMAGE_DEPENDS: list of Yocto images that contains a root filesystem
# it will be ensured they are built before creating swupdate image
IMAGE_DEPENDS = "mfx-image-cluster"

# SWUPDATE_IMAGES: list of images that will be part of the compound image
# the list can have any binaries - images must be in the DEPLOY directory
SWUPDATE_IMAGES = "mfx-image-cluster"


SWUPDATE_IMAGES_FSTYPES[mfx-image-cluster] = ".tar.gz"
