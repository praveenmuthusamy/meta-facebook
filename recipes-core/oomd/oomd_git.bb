SUMMARY = "A userspace out-of-memory killer"
HOMEPAGE = "https://github.com/facebookincubator/oomd"
SECTION = "base"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9450224a11928f85794c948d3539a882"

SRC_URI = "git://github.com/facebookincubator/oomd.git \
	   file://0001-oomd-refer-header-files-without-oomd-prefix.patch \
	"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

DEPENDS = "jsoncpp"
RDEPENDS_${PN} = "${PN}-dev"

inherit meson pkgconfig
# INSANE_SKIP_${PN}-dev += "dev-elf"
FILES_${PN}-dev = "${libdir}/*"
