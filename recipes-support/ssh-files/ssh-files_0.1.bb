SUMMARY = "SSH public keys for secure connection"
SRC_URI = "file://cluster_key.pub"
LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

FILES_${PN} += "/home/root/.ssh/authorized_keys"

do_install() {
	install -d ${D}/home/root/.ssh
	cp ${WORKDIR}/cluster_key.pub ${D}/home/root/.ssh/authorized_keys
}
