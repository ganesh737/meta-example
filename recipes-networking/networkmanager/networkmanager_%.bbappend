FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "\
file://railwire_ganesh.nmconnection \
"

do_install_append() {
    # install network config file
    install -m 0600 "${WORKDIR}/railwire_ganesh.nmconnection" "${D}${sysconfdir}/NetworkManager/system-connections"
}

