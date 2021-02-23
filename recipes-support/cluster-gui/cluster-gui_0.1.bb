SUMMARY = "SSH public keys for secure connection"
SRC_URI = "file://cluster_v1 \
			file://cluster.service \
			file://calibration.csv \
			file://cluster.sh \
			"
LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

FILES_${PN} += "/home/root/cluster_v1"
FILES_${PN} += "/home/root/cluster.sh"
FILES_${PN} += "/home/root/calibration.csv"
FILES_${PN} += "/lib/systemd/system"


do_install() {
	install -d ${D}/home/root/
	install -m 0755 ${WORKDIR}/cluster_v1 ${D}/home/root/cluster_v1
	install -m 0755 ${WORKDIR}/cluster.sh ${D}/home/root/cluster.sh
	cp ${WORKDIR}/calibration.csv ${D}/home/root/calibration.csv
	
	install -d ${D}${systemd_system_unitdir}
	install -m 0644 ${WORKDIR}/cluster.service ${D}${systemd_system_unitdir}/
}

inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "cluster.service"

REQUIRED_DISTRO_FEATURES= "systemd"
DEPENDS += "qtbase qtserialbus qtserialport"
