SUMMARY = "mstch is a complete implementation of {{mustache}} templates using modern C++"
URL = "https://github.com/no1msd/mstch"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=74e0ccb277b0751abdf8e70553bbc207"

SRCREV = "ff459067bd02e80dc399006bb610238223d41c50"
SRC_URI = "git://github.com/no1msd/mstch"

S = "${WORKDIR}/git"
DEPENDS = "boost"

inherit cmake pkgconfig
