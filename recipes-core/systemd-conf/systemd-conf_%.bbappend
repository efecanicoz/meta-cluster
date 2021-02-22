FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://20-eth.network \
    file://21-can.network \
    file://22-wlan.network \
"

FILES_${PN} += " \
    ${sysconfdir}/systemd/network/20-eth.network \
    ${sysconfdir}/systemd/network/21-can.network \
    ${sysconfdir}/systemd/network/22-wlan.network \
"

do_install_append() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/20-eth.network ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/21-can.network ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/22-wlan.network ${D}${sysconfdir}/systemd/network
}
