FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SAVED_DIR := "${THISDIR}"

do_configure_prepend () {
	cp ${SAVED_DIR}/files/imx8mm-var-som.dts ${S}/arch/arm64/boot/dts/freescale/imx8mm-var-som.dts
	
    sed -i 's/CONFIG_LOGO=y/\# CONFIG_LOGO is not set/' ${WORKDIR}/build/.config
}
