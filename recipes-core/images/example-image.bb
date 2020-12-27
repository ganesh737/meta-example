# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

# Set compatibility to machines starting with rpi
COMPATIBLE_MACHINE = "^rpi$"

# set root password to ashwini
inherit extrausers
EXTRA_USERS_PARAMS = "\
usermod -p \\\$1\\\$8FMC0jlY\\\$ciBNe563XThP8D45jPfbx\. root \
" 

# limit fstype to wic
IMAGE_FSTYPE = "wic"

# remove old builds
RM_OLD_IMAGE = "1"

# install kernel modules
IMAGE_INSTALL += " kernel-modules "

# disable the splash screen
IMAGE_FEATURES_remove = "splash"

# print the message once do_rootfs() has completed
do_rootfs_append() {
    bb.warn("An image has been freshly builti!")
}

# Install ssh server
IMAGE_FEATURES += " ssh-server-dropbear "

# Install vim
IMAGE_INSTALL += "vim"

# install tzdata for localtime settings
IMAGE_INSTALL += " tzdata tzdata-asia"

# install networkmanager
IMAGE_INSTALL += " networkmanager networkmanager-nmtui networkmanager-bash-completion"

# install hello world cpp app
IMAGE_INSTALL += " hello-world-cpp-sources "
